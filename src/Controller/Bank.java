package Controller;
import Model.Branch;
import Model.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bank
{
    public static long fund=0;

    LinkedHashMap<String,Branch> branches=new LinkedHashMap<>();

    public boolean create_branch(String ifce,String branch_name,Address address,String contact,Employee branch_manager)
    {
        try
        {
            branches.put(ifce, new Model.Branch(ifce, branch_name,address,contact,branch_manager,0));
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public LinkedHashMap<String,Branch> view_all_branches()
    {
        return branches;
    }

    public long view_funds()
    {
        return fund;
    }


    public boolean assign_new_manager(String ifce,Employee employee)
    {
        Branch branchData=null;
        for(Map.Entry<String,Branch> e:branches.entrySet())
        {
            if(ifce.equals(e.getValue().ifce))
            {
                branchData=e.getValue();
                break;
            }
        }
        branches.put(ifce,new Branch(ifce,branchData.branch_name,branchData.address,branchData.contact,employee,branchData.totalfund));
        return true;
    }

    public void assign_funds_to_branch(String ifce,long fund)
    {
        Branch branchData=null;
        for(Map.Entry<String,Branch> e:branches.entrySet())
        {
            if(ifce.equals(e.getValue().ifce))
            {
                branchData=e.getValue();
                break;
            }
        }
        branches.put(ifce,new Branch(ifce,branchData.branch_name,branchData.address,branchData.contact,branchData.branch_manager,fund));
    }

}
