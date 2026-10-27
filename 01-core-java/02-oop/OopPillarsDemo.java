
import java.math.BigDecimal;

public class OopPillarsDemo {

    public static void main(String[] args) {
        PaymentMethod card = new CardPayment();
        PaymentMethod bankTransfer = new BankTransferPayment();
        PaymentMethod wallet = new WalletPayment();

        processPayment(card, new BigDecimal("100.00"));
        processPayment(bankTransfer, new BigDecimal("250.00"));
        processPayment(wallet, new BigDecimal("75.00"));
    }

    private static void processPayment(
            PaymentMethod paymentMethod,
            BigDecimal amount) {

        paymentMethod.pay(amount);
    }
}

abstract class PaymentMethod {

    public abstract void pay(BigDecimal amount);
}

class CardPayment extends PaymentMethod {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(
                "Processing card payment: " + amount
        );
    }
}

class BankTransferPayment extends PaymentMethod {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(
                "Processing bank transfer: " + amount
        );
    }
}

class WalletPayment extends PaymentMethod {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(
                "Processing wallet payment: " + amount
        );
    }
}
