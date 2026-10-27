
import java.math.BigDecimal;

public class EncapsulationDemo {

    static class BankAccount {
        private BigDecimal balance;

        public BankAccount(BigDecimal initialBalance) {
            validatePositiveAmount(initialBalance);
            this.balance = initialBalance;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void deposit(BigDecimal amount) {
            validatePositiveAmount(amount);
            balance = balance.add(amount);
        }

        public void withdraw(BigDecimal amount) {
            validatePositiveAmount(amount);

            if (amount.compareTo(balance) > 0) {
                throw new IllegalArgumentException(
                    "Insufficient funds"
                );
            }

            balance = balance.subtract(amount);
        }

        private void validatePositiveAmount(BigDecimal amount) {
            if (amount == null ||
                amount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException(
                    "Amount must be greater than zero"
                );
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account =
            new BankAccount(new BigDecimal("100.00"));

        account.deposit(new BigDecimal("50.00"));
        account.withdraw(new BigDecimal("30.00"));

        System.out.println("Balance: " + account.getBalance());
    }
}
