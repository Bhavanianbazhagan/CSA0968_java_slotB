import java.util.*;
import java.io.*;
class vowels
{
 public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String str=sc.nextLine();
System.out.println("the vowels are: " +str.replaceAll("[bcdfghjklmnpqrstvwxyz]",""));
int count=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
count++;
}
}
System.out.println("number of vowels is:" +count);
}
}