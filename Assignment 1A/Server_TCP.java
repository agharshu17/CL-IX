import java.io.*;
import java.net.*;

public class Server_TCP{
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(5056);

    while(true){
      Socket socket = null;
      try{
        socket = serverSocket.accept();
        System.out.println("A new client is connected: " + socket);

        // obtaining the input and output streams
        DataInputStream dis = new DataInputStream(socket.getInputStream()); // client socket's output stream
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); // client socket's input stream

        System.out.println("Assigning new thread for this client");

        // assigning a new thread using the ClientHandler
        Thread t = new ClientHandler(socket, dis, dos);

        // Invoking the start() method
        t.start();
      }catch(Exception e){
        serverSocket.close();
        socket.close();
        e.printStackTrace();
      }
    }
  }
}

class ClientHandler extends Thread{
  final DataInputStream dis;
  final DataOutputStream dos;
  final Socket socket;

  public ClientHandler(Socket socket, DataInputStream dis, DataOutputStream dos){
    this.socket = socket;
    this.dis = dis;
    this.dos = dos;
  }

  @Override
  public void run(){
    String received;
    String toReturn;

    while(true){
      try{
        dos.writeUTF("What's your message?");
        received = dis.readUTF();

        if(received.equals("Exit")){
          System.out.println("Client " + this.socket + " sends exit...");
          System.out.println("Closing this connection.");
          this.socket.close();
          System.out.println("Connection closed");
          break;
        }

        toReturn = received; //echo server
        dos.writeUTF(toReturn);
        
      }catch(IOException e){
        e.printStackTrace();
      }
    }
  }
}