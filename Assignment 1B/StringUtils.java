import java.rmi.*;
import java.rmi.server.*;

public class StringUtils extends UnicastRemoteObject implements StringUtilsInterface{

  StringUtils() throws RemoteException{
    super();
  }
  
  public boolean isEqual(String a, String b){
    return a.equals(b);
  }

  public String toLowerCase(String a){
    return a.toLowerCase();
  }
}