import java.util.*;
import java.io.*;
class matrixadd
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of rows and columns:");
int row=sc.nextInt();
int column=sc.nextInt();
int a[][]=new int[row][column];
int b[][]=new int[row][column];
int c[][]=new int[row][column];
System.out.println("enter first matrix");
for(int i=0;i<row;i++)
{
  for(int j=0;j<column;j++)
   {
    a[i][j]=sc.nextInt();
    }
 }
System.out.println("enter second matrix");
for(int i=0;i<row;i++)
{
  for(int j=0;j<column;j++)
   {
      b[i][j]=sc.nextInt();
    }
 }
for(int i=0;i<row;i++)
{
   for(int j=0;j<column;j++)
    {
     c[i][j]=a[i][j]+b[i][j];
    }
 }
System.out.println("addition of two matrix");
for(int i=0;i<row;i++)
{
   for(int j=0;j<column;j++)
    {
     System.out.print(c[i][j] +" ");
    }
System.out.print("\n");
 }
}
}