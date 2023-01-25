import java.util.*;
import java.io.*;
class special
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String str=sc.nextLine();
System.out.println("the special characters are:" +str.replaceAll("[a-zA-Z1-9]",""));
int count=0;
for(int i=0;i<str.length();i++)
 {
    if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)) )
    {
        count++;
     }
 }
if(count==0)
  System.out.println("no special characters");
else
   System.out.println("total special characters :" +count);
}
}