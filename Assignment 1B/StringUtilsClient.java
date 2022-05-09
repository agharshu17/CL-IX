import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;
import java.io.*;

public class StringUtilsClient {
  public static void main(String[] args) throws IOException{
    try{
      String string1, string2;
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the 1st string: ");
      string1 = scanner.nextLine();

      System.out.println("Enter the 2nd string: ");
      string2 = scanner.nextLine();

      StringUtilsInterface object = (StringUtilsInterface)Naming.lookup("rmi://localhost:3909/string");
      String result = object.isEqual(string1, string2) ? "Equal" : "Not equal";
      System.out.println(result);
      System.out.println("Lower case for the 1st string: " + object.toLowerCase(string1));
      System.out.println("Lower case for the 2nd string: " + object.toLowerCase(string2));
    }catch(Exception e){
      e.printStackTrace();
    }
  }  
}
