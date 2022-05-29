public class CreditPaymentService {

    public double payment(int a, int b) {

        double percent = 0.008325;

        return a * (percent * Math.pow((1 + percent), (b * 12))) / (Math.pow((1 + percent), (b * 12)) - 1);


    }
}
