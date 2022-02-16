public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // кейс 1 год
        int monthlyPayment = service.calculate(1000000, 1);
        System.out.println("Ежемесячный платеж " + monthlyPayment + " рублей");

        // кейс 2 года
        int monthlyPayment2 = service.calculate(1000000, 2);
        System.out.println("Ежемесячный платеж " + monthlyPayment2 + " рублей");

        // кейс 3 года
        int monthlyPayment3 = service.calculate(1000000, 3);
        System.out.println("Ежемесячный платеж " + monthlyPayment3 + " рублей");

    }
}
