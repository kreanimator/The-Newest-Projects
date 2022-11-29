

public class MyUser1
    {
        public static void main(String args[])
        {


            Thread srv = new Thread(new MyServer1());
            Thread clt = new Thread(new MyClient1());

            srv.start();
            clt.start();
        }
    }

