package View;

import Model.Branch;

import java.util.Scanner;

public class Employee
{
     public void employee_view(Branch branch)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("------------------EMPLOYEE LOGIN---------------------");
         System.out.println();

         System.out.println("ENTER YOUR EMP_ID:");
         String emp_id=sc.nextLine();

         System.out.println("ENTER YOUR PASSWORD:");
         String emp_password=sc.nextLine();

         Model.Employee employee_data=
     }
}
