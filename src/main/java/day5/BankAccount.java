package day5;

public class BankAccount {
    private  double balance ; //global for the class local of the package

    public BankAccount( double initialBalance)
    {
            if(initialBalance<0)
            {
                System.out.println(" initialization Balance canot be negative . setting balance to 0 ");
            }

        balance=initialBalance;

    }

    public  void  deposit(double amount)
    {
        if(amount>0)
        {
            balance +=amount;
        }

    }
    //get
    public double getBalance()
    {
        return balance;
    }
}
