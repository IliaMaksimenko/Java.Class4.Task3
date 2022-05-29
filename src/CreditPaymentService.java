public class CreditPaymentService {

    public double payment(int a, int b){

        double percent = 0.008325;

        switch (b){
            case 1: return a * (percent * Math.pow((1 + percent), 12)) / (Math.pow((1 + percent), 12) - 1);
            case 2: return a * (percent * Math.pow((1 + percent), 24)) / (Math.pow((1 + percent), 24) - 1);
            case 3: return a * (percent * Math.pow((1 + percent), 36)) / (Math.pow((1 + percent), 36) - 1);
            case 4: return a * (percent * Math.pow((1 + percent), 48)) / (Math.pow((1 + percent), 48) - 1);
            case 5: return a * (percent * Math.pow((1 + percent), 60)) / (Math.pow((1 + percent), 60) - 1);
            default: return a * 0;
        }
    }
}
