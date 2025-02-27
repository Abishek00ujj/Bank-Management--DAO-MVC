package Model;

public class Account
{
    public String cust_id;
    public String acc_number;
    public String acc_type;
    public String acc_balance;

    public Transaction transaction;

    public Account(String cust_id,String acc_number,String acc_type,String acc_balance,Transaction transaction)
    {
        this.acc_number=acc_number;
        this.acc_type=acc_type;
        this.acc_balance=acc_balance;
        this.cust_id=cust_id;
        this.transaction=transaction;
    }

}
