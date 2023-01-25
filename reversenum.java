//reverse a number
import java.util.*;
class reversenum
{
 public static void main(String []args)
{
 Scanner a=new Scanner(System.in);
 try{
 System.out.println("number: ");
 int num=a.nextInt();
 System.out.println("the reversed number is: " +(numrev(num)));
 }
 catch (Exception e){
 System.out.println("enter the integer number only");
 }
 }
 public static int numrev(int num){
 int rev=0;
 while(num!=0){
 int rem=num%10;
 rev=rev*10+rem;
 num=num/10;
 }
 return rev;
 }
 }