public class BankAccount {
    double amount;
    double getAmount(){
    return amount;}
    public void Deposit(double som) {
        amount = amount + som;
    }
    public void WithDraw(double som2) throws LimitException {
        if (som2 > amount) {
            throw new LimitException( amount,som2=amount-amount);}
        amount = amount - som2;
    }
}
