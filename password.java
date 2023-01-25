//valid or not
import java.util.Scanner;
class password
{
public static void main(String[] arg)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the user name:");
  String str1=sc.nextLine();
  System.out.println("re-enter the user name:");
  String str2=sc.nextLine();
  if(str1.equals(str2))
    System.out.println("user name is valid");
  else
   System.out.println("uset name  is invalid");
}
}