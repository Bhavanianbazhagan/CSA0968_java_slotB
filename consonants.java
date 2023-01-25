import java.util.*;
class consonants
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String str=sc.nextLine();
System.out.println("the string without vowels is:" +str.replaceAll("[aeiou]","") );
}
}