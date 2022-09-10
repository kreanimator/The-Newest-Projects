public class ChildBankAccount {

    private double balance;
    private double maxBalance;

    public ChildBankAccount (double maxBalance) {
        balance = 0.0;
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney (double value){
        double sum = balance + value;
        if (sum > maxBalance || sum < balance) {
            return false;
        }
        balance = sum;
        return true;
    }

    public boolean debitMoney ( double value) {
        double sum = balance - value;
        if (sum < 0 || sum > balance){
            return false;
        }
        balance = sum;
        return true;

    }
    public double getBalance(){
        return balance;
    }


}
