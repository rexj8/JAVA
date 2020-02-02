import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

class main {
       public static void main(String[] args){
            try {
               String str = "hey sunny";
               byte[] msg = new byte[1024];
               msg        = str.getBytes();

               Socket s = new Socket();
               s.connect(new InetSocketAddress("192.168.1.101",4044));
               DataOutputStream dos=new DataOutputStream(s.getOutputStream());
               dos.write(msg, 0, str.length());
               s.close();
             }
             catch(Exception er) {
                 System.out.println(er.getMessage());
             }
        }
  }
