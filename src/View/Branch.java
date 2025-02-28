package View;
import Model.Address;

import java.util.*;

public class Branch
{
    public void branchManager_view(Model.Branch branch,String ifce,Controller.Branch branchController)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------------BRANCH MANAGER-----------------------------------------");
        System.out.println("BRANCH NAME: "+branch.branch_name);
        System.out.println("IFCE CODE : "+branch.ifce);



        int option=0;

        while(true)
        {
            System.out.println("1.create employees");
            System.out.println("2.view employees");
            System.out.println("");

            option=Integer.parseInt(sc.nextLine());
            if(option==1)
            {
                System.out.println("Enter the Name :");
                String emp_name=sc.nextLine();

                System.out.println("Enter the id :");
                String emp_id=sc.nextLine();

                System.out.println("Enter the password :");

                String emp_password=sc.nextLine();
                System.out.println("Enter the resignation :");

                String emp_resgination=sc.nextLine();
                System.out.println("Enter the contact: ");

                String contact=sc.nextLine();
                System.out.println("Enter the Address");

                System.out.println("City:");
                String city=sc.nextLine();

                System.out.println("Door no.");
                String doorno=sc.nextLine();

                System.out.println("District:");
                String district=sc.nextLine();

                System.out.println("State:");
                String state=sc.nextLine();


                if(emp_name.isEmpty() && emp_id.isEmpty() && emp_password.isEmpty() && emp_resgination.isEmpty() && state.isEmpty() && city.isEmpty() && doorno.isEmpty())
                {
                    branchController.create_employee(branch.ifce,emp_id,emp_name,emp_password,emp_resgination,new Address(city,doorno,district,state),contact);
                    System.out.println("Loading...");
                    System.out.println("Employee is added succuessfully!");
                }
            }
        }
    }

}
