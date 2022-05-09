import java.io.*;
import java.util.*;
import java.net.*;

public class Client_UDP {
  public static void main(String[] args) throws IOException{
    Scanner scanner = new Scanner(System.in);
    InetAddress ip = InetAddress.getByName("localhost");

    DatagramSocket datagramSocket= new DatagramSocket();

    byte[] send = null;
    try{
      while(true){
        String input = scanner.nextLine();
        send = input.getBytes();
        DatagramPacket datagramPacketSend = new DatagramPacket(send, send.length, ip, 5058);
        datagramSocket.send(datagramPacketSend);

        if(input.equals("Exit")){
          datagramSocket.close();
          scanner.close();
          System.out.println("Exiting..");
          break;
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }

  }

  public static String data(byte[] a)
  {
    if (a == null)
        return null;
    StringBuilder ret = new StringBuilder();
    int i = 0;
    while (a[i] != 0)
    {
      ret.append((char) a[i]);
      i++;
    }
    return ret.toString();
  }
}
