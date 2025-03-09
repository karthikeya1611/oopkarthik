class Bankaccount {
    String Name;
    int AccNo, CurrBal;

    Bankaccount(String Name, int AccNo, int CurrBal) {
        this.Name = Name;
        this.AccNo = AccNo;
        this.CurrBal = CurrBal;
        System.out.println("Customer details: Name: " + Name + ", Account Number: " + AccNo + ", Current Balance: " + CurrBal);
    }

    public void Withdraw(int wAmount) {
        if (10000 < CurrBal - wAmount) {
            CurrBal = CurrBal - wAmount;
            System.out.println(CurrBal);
        } else {
            System.out.println("Insufficient funds. Minimum balance should be maintained.");
        }
    }

    public int deposit(int dAmount) {
        CurrBal = CurrBal + dAmount;
        return CurrBal;
    }

    public static void main(String[] args) {
        Bankaccount person1 = new Bankaccount("RAM", 3459, 11000);
        person1.Withdraw(1000);
        System.out.println("Balance is " + person1.deposit(50000));
        System.out.println(" ");

        Bankaccount person2 = new Bankaccount("PURNA", 2005, 30000);
        person1.Withdraw(15000);
        System.out.println("Balance is " + person1.deposit(100000));
        System.out.println(" ");

        Bankaccount person3 = new Bankaccount("KOMALI", 3432, 100000);
        person1.Withdraw(1000);
        System.out.println("Balance is " + person1.deposit(500000));
    }
}
