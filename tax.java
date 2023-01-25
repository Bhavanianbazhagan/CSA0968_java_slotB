import java.util.Scanner;
class tax
{
public static void main(String[] arg)
{
   int income;
   int tax1; 
Scanner sc=new Scanner(System.in);
System.out.print("enter the income:");
income=sc.nextInt();
if(income>0 && income<=150000)
  System.out.println("no tax");
else if(income>=150001 && income<=300000)
{ 
tax1=(income*10)/100;
System.out.println("tax=" +tax1);
}
else if(income>=300001 && income<=500000)
{
tax1=(income*20)/100;
System.out.println("tax=" +tax1);
}
else if(income>=500001)
{
tax1=(income*30)/100;
System.out.println("tax=" +tax1);
}
else
  System.out.print("invalid");
}
}