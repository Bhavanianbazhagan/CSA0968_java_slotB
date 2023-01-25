import java.util.Scanner;
class student_users
{
    public static void main(String[] arg)
   {
int stud_user,staff_user,tot_user,non_teach;
Scanner sc=new Scanner(System.in);
System.out.print("enter total users:");
tot_user=sc.nextInt();
    if(tot_user>0)
     { 
         System.out.print("enter staff users:");
         staff_user=sc.nextInt();
          if(tot_user==staff_user)
           {
              System.out.println("invalid");
            }
           else if(tot_user>staff_user)
          {
             non_teach=staff_user/3;
             stud_user=tot_user-(staff_user+non_teach);
             System.out.println("the total students in a college:" +stud_user);
          }
           else
             System.out.println("invalid");
}
else
{
     System.out.println("invalid");
}

}
}