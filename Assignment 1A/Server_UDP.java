import java.io.*;
import java.net.*;

public class Server_UDP {
  public static void main(String[] args) throws IOException{
    DatagramSocket datagramSocket = new DatagramSocket(5058);

    byte[] receive = new byte[65000];
    String receivedData = null;
    DatagramPacket datagramPacketReceive = null;

    try{
      while(true){
        datagramPacketReceive = new DatagramPacket(receive, receive.length);
        datagramSocket.receive(datagramPacketReceive);
        System.out.print("Client sent - ");
        receivedData = data(receive);
        System.out.println(receivedData);
  
        if(receivedData.equals("Exit")){
          datagramSocket.close();
          System.out.println("Client closed the connection.");
          break;
        }
        receive = new byte[65000];
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

