//string to integer
import java.util.Scanner;
class strtoint
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String s=sc.nextLine();
try{
int a=Integer.parseInt(s);
System.out.println("string to integer conversion is: " +a);}
catch(NumberFormatException ex){
   System.out.println("invalid");}
}
}