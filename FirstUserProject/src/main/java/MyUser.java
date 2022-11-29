

public class MyUser
    {
        public static void main(String args[])
        {
            Thread srv = new Thread(new MyServer());
            Thread clt = new Thread(new MyClient());
            srv.start();
            clt.start();
        }
    }

