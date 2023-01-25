//simple interest
import java.util.*;
class simpleinterest
{
public static void main(String[] arg)
{
int cal;
char choice;
Scanner sc=new Scanner(System.in);
System.out.println("enter the principal amount: ");
int pr_amount=sc.nextInt();
System.out.println("enter the no of years: ");
int years=sc.nextInt();
if((pr_amount>1000)&&(years>0))
{
System.out.println("is customer senior citizen (y/n): ");
String senior=sc.next();
choice=senior.charAt(0);
switch(choice)
{
  case 'y' :
         {

          cal=(pr_amount*12)/100;
          System.out.println("interest: " +cal);
         break;
         }
  case 'n':
         {

          cal=(pr_amount*10)/100;
          System.out.println("interest: " +cal);
           break;
         }
}
}
else{
System.out.println("invalid");}       
}
}