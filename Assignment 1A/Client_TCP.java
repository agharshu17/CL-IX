import java.net.*;
import java.io.*;
import java.util.*;

public class Client_TCP {
  public static void main(String[] args) throws IOException{
    try{
      Scanner scanner = new Scanner(System.in);
      InetAddress ip = InetAddress.getByName("localhost");
      Socket socket = new Socket(ip, 5056);

      DataInputStream dis = new DataInputStream(socket.getInputStream());
      DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

      while(true){
        System.out.println(dis.readUTF());
        String toSend = scanner.nextLine(); // change this to nextInt for base, power, metres, centimetres
        dos.writeUTF(toSend);

        if(toSend.equals("Exit")){
          System.out.println("Closing this connection : " + socket);
          socket.close();
          System.out.println("Connection closed");
          break;
        }

        String received = dis.readUTF();
        System.out.println(received);
      }
      scanner.close();
      dis.close();
      dos.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
