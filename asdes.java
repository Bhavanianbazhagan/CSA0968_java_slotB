//sort a list in alphabetical order
import java.io.*;
import java.util.*;
class asdes
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int n=5;
char choice;
String names[]={"Banana","Carrot","Radish","Apple","Jack"};
System.out.println("order(A/D): ");
String str=sc.nextLine();
choice=str.charAt(0);
switch(choice)
{
 case 'A':
        Arrays.sort(names);
        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(names[i]);
        }
case 'D':
        Arrays.sort(names);
        System.out.println("The names in descending order are: ");
        for (int i = 0; i <n; i++)
        {
            System.out.println(names[i]);
        }
        
}
}
}