//to print vowels and consonants
import java.util.*;
import java.io.*;
class vowcon
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String str=sc.nextLine();
System.out.println("the vowels: "+str.replaceAll("[bcdfghjklmnpqrstvwxyz]",""));
System.out.println("the consonants: "+str.replaceAll("[aeiou]",""));

}
}