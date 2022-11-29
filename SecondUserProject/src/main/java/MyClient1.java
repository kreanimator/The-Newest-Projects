
import java.io.*;
import java.net.Socket;

public class MyClient1 implements Runnable
{
    public void run()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Socket s = null;
            while (true)
            {
                try
                {
                    s = new Socket("localhost", 4242);
                    break;
                }
                catch (Exception e)
                {
                    Thread.sleep(200);
                    continue;
                }
            }
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String str = "";
            while (!str.equals("stop"))
            {
                str = br.readLine();
                dout.writeUTF(str);
                dout.flush();
            }

            dout.close();
            s.close();
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}