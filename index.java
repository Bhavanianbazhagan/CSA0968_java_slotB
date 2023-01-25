import java.util.*;
import java.io.*;
class index
{
public static void main(String[] arg)
{
char n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
System.out.println("enter the characters to be searched:");
String str2=sc.nextLine();
n=str2.charAt(0);
System.out.println(n+"is found in string at indes:" +(str.indexOf(n)));
}
}