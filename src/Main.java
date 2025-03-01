import java.util.*;

import Controller.Employee;
import Model.Address;
import View.*;
import Controller.Bank;
import Model.*;

import View.Branch;
public class Main
{
    public static void main(String[] args)
    {
        Bank bank=new Controller.Bank();
        Controller.Branch branch=new Controller.Branch();
        Scanner sc=new Scanner(System.in);

        int option;

        Model.Branch branchData=null;
        Branch branchView=new Branch();
        View.Bank bankview=new View.Bank();

        while(true)
        {
            System.out.println("WELCOME TO BANK MANAGEMENT SYSTEM");
            System.out.println();
            System.out.println("1.BANK LOGIN");
            System.out.println("2.BRANCH MANAGER LOGIN");
            System.out.println("3.EMPLOYEE LOGIN");
            option=Integer.parseInt(sc.nextLine());
            if(option==1)
            {
                System.out.println("Enter the Admin Id:");
                String admin_id=sc.nextLine();
                System.out.println("Enter the Admin Password");
                String admin_password=sc.nextLine();
                if(admin_id.equals("1") && admin_password.equals("1"))
                {
                   bankview.bank_view(bank);
                }
                else
                {
                    System.out.println("Invalid credentials..");
                }
            }
            else if(option==2)
            {
                System.out.println("Enter the IFCE CODE: ");
                String ifce=sc.nextLine();
                System.out.println("Enter the ID:");
                String emp_id=sc.nextLine();
                System.out.println("Enter the Password: ");
                String emp_password=sc.nextLine();
                branchData=bank.branch_manager_login(ifce,emp_id,emp_password);
                if(branchData!=null)
                {
                    branchView.branchManager_view(branchData,ifce,branch);
                }
                else
                {
                    System.out.println("Inavlid credentials");
                }
            }
            else if(option==3)
            {

            }
        }
    }
}