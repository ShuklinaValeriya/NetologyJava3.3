public class CreditPaymentService {
    public int calculate(int amount, int loanTerm) {

        double percent = 9.99;
        double monthPercent = (9.99 / 100) / 12;
        double pmt = percent / (12 * loanTerm);
        double annuityRatio = (monthPercent * Math.pow((1 + monthPercent), (loanTerm * 12))) / ((Math.pow((1 + monthPercent), (loanTerm * 12)) - 1));
        double monthlyPayment = amount * annuityRatio;
        return (int) monthlyPayment;
    }
}
