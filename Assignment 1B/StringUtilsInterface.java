import java.rmi.*;

public interface StringUtilsInterface extends Remote{
  public boolean isEqual(String a, String b) throws RemoteException;
  public String toLowerCase(String a) throws RemoteException;
}
