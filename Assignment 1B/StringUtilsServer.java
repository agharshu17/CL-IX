import java.rmi.*;
import java.io.*;
import java.rmi.registry.*;

public class StringUtilsServer{
  public static void main(String[] args) throws IOException{
    try{
      StringUtilsInterface object = new StringUtils();
      LocateRegistry.createRegistry(3909);
      Naming.rebind("rmi://localhost:3909/string", object);
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
