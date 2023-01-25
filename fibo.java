import java.util.Scanner;
class fibo
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int n1=0,n2=1,n3;
System.out.println("enter a number:");
int num=sc.nextInt();
System.out.print(n1+" "+n2);
for(int i=0;i<num;i++)
{
n3=n1+n2;
System.out.print(" "+n3+" ");
n1=n2;
n2=n3;

}
}
}