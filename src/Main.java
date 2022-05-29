import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input credit amount: ");
        int amount = in.nextInt();
        System.out.print("Input credit term: ");
        int term = in.nextInt();

        CreditPaymentService service = new CreditPaymentService();
        double YourPayment = (int) service.payment(amount, term);

        if (YourPayment == 0) {
            System.out.println("You entered the wrong credit term");
            in.close();
        } else {
            System.out.println("Your monthly payment = " + YourPayment);
            in.close();
        }

    }
}
