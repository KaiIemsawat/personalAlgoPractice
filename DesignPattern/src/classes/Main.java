package classes;

public class Main {
    public static void main(String[] args) {
        /* CLASSES */
//        User user = new User("Zukkii", 6);
//        System.out.println(user.name);
//        user.saySomething();

        /* INTERFACE */
//        TaxCalculator calculator = getCal();
//        calculator.calculateTax();

        /* ENCAPSULATION */
//        var account = new Account();
//        account.setBalance(100);
//        account.deposit(10);
//        account.withdraw(5);
//        System.out.println(account.getBalance());

        /* Abstract */
        var mailService = new MailService();
        mailService.sendEmail();
    }

//    public static TaxCalculator getCal() {
//        return new TaxCal2022();
//    }
}
