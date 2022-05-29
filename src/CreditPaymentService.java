public class CreditPaymentService {

    public double payment(int a, int b) {

        double percent = 9.99 / (100 * 12);  //годовой процент разделенный на каждый месяц

        return a * (percent * Math.pow((1 + percent), (b * 12))) / (Math.pow((1 + percent), (b * 12)) - 1);


    }
}
