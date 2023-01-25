//eligible for voting
import java.util.*;
class voting
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your age:");
int age=sc.nextInt();
if(age>=18)
{
System.out.println("eligible for voting...");
}
else
 {
   System.out.println("you are allowed to vote after " +(18-age) +" years");
 }
}
}