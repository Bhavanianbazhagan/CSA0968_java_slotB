//matrixmul
import java.util.*;
class matrixmul
{
public static void main(String[] arg)
{
int r1,r2,c1,c2,sum;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of row of matrix1");
r1=sc.nextInt();
System.out.println("enter number of column of matrix1");
c1=sc.nextInt();
System.out.println("enter number of row of matrix2");
r2=sc.nextInt();
System.out.println("enter number of column of matrix2");
c2=sc.nextInt();
int mat1[][]=new int[r1][c1];
int mat2[][]=new int[r2][c2];
int result[][]=new int[r1][c2];
System.out.println("enter elements of first matrix:");
for(int i=0;i<r1;i++)
{
  for(int j=0;j<c1;j++)
   {
     mat1[i][j]=sc.nextInt();
    }
 }
System.out.println("enter elements of second matrix:");
for(int i=0;i<r2;i++)
{ 
   for(int j=0;j<c2;j++)
    {
     mat2[i][j]=sc.nextInt();
     }
 }
System.out.println("multiplication of two matrix:");
for(int i=0;i<r1;i++)
{
  for(int j=0;j<c2;j++)
   {
     sum=0;
     for(int k=0;k<r2;k++)
      {
        sum=sum+mat1[i][j]+mat2[i][j];
       }
result[i][j]=sum;

    }
 }
for(int i=0;i<r1;i++)
 {
   for(int j=0;j<c2;j++)
   {
    System.out.print(result[i][j] +" ");
    }
System.out.print("\n");
}
}
}