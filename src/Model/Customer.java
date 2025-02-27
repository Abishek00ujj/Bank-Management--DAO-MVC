package Model;

public class Customer
{
    public String cust_id;
    public String cust_name;
    public String cust_password;
    public Address address;
    public String contact;
    public String ifce;

    public Customer(String cust_id,String cust_name,String cust_password,Address address,String contact,String ifce)
    {
        this.address=address;
        this.contact=contact;
        this.cust_name=cust_name;
        this.cust_password=cust_password;
        this.ifce=ifce;
        this.cust_id=cust_id;
    }

}
