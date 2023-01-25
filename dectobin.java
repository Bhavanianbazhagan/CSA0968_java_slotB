//decimal to binary
import java.util.*;
class dectobin
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a decimal number:");
int decimal=sc.nextInt();
String binary=Integer.toBinaryString(decimal);
System.out.println("binary number is: " +binary);
}
}
