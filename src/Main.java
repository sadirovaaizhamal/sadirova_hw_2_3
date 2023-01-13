import java.util.Scanner;

public class Main {
    private static double som2;

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.Deposit(20000);
        Scanner scanner=new Scanner(System.in);
        while (true){
            Double som3=scanner.nextDouble();


            try {
                bankAccount.WithDraw(som2);
                System.out.println(bankAccount.amount);
            }catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                System.out.println(limitException.getRemainingAmount());
                break;}
            }
    }
}