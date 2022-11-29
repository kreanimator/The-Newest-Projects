
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer implements Runnable
{
    public void run()
    {
        try
        {
            ServerSocket ss = new ServerSocket(4242);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = "";
            while (!str.equals("stop"))
            {
                str =  din.readUTF();
                print2Screen(str);
            }
            ss.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    synchronized static void print2Screen(String str)
    {
        System.out.println("Client says: " + str);
    }
}