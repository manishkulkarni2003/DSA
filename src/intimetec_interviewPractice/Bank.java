package intimetec_interviewPractice;

class Bank{
    public static void main(String[] args){
        
    
    SavingsAccount obj =new SavingsAccount("Manish",1233,100);
    
    obj.depoist(200);
    obj.TotalBalance();
    obj.calculateInterest();
    obj.withdraw(300);
    
    }
}

class Account{
    public String AccountHolderName;
    public int AccountNumber;
    public double Amount;
    Account(String AccountHolderName,int AccountNumber,double Amount){
        this.AccountHolderName=AccountHolderName;
        this.AccountNumber=AccountNumber;
        this.Amount=Amount;
    }
    public void depoist(double Depoist){
        System.out.println("Total Amount Depoist"+Depoist);
        Amount+=Depoist;
        
    }
    public void TotalBalance(){
        System.out.println("Total Balance:"+Amount);
    }
    public void withdraw(double with){
        double res=Amount-with;
        System.out.println("Withdrawed Amount is:"+with);
        System.out.println("Total Balance is:"+res);
    }
    
    
}
class SavingsAccount extends Account{
    SavingsAccount(String AccountHolderName,int  AccountNumber,double Amount){
        super(AccountHolderName,AccountNumber,Amount);
    }
    public void calculateInterest(){
        double interest=Amount+Amount*(10.00/100.00);
        System.out.println("Interest is :"+interest);
    }
}



