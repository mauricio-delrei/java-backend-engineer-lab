
import java.math.BigDecimal;

public class BankAccountValidationTest {

    private static int passed = 0;

    public static void main(String[] args) {
        testNegativeInitialBalance();
        testNullInitialBalance();
        testZeroDeposit();
        testNegativeDeposit();
        testNullDeposit();
        testZeroWithdrawal();
        testNegativeWithdrawal();
        testNullWithdrawal();
        testInsufficientFunds();

        System.out.println();
        System.out.println("Tests passed: " + passed);
        System.out.println("All validation tests completed.");
    }

    private static void testNegativeInitialBalance() {
        expectException(
                "Negative initial balance",
                () -> new EncapsulationDemo.BankAccount(
                        new BigDecimal("-10.00"))
        );
    }

    private static void testNullInitialBalance() {
        expectException(
                "Null initial balance",
                () -> new EncapsulationDemo.BankAccount(null)
        );
    }

    private static void testZeroDeposit() {
        verifyInvalidTransaction(
                "Zero deposit",
                account -> account.deposit(new BigDecimal("0.00"))
        );
    }

    private static void testNegativeDeposit() {
        verifyInvalidTransaction(
                "Negative deposit",
                account -> account.deposit(new BigDecimal("-10.00"))
        );
    }

    private static void testNullDeposit() {
        verifyInvalidTransaction(
                "Null deposit",
                account -> account.deposit(null)
        );
    }

    private static void testZeroWithdrawal() {
        verifyInvalidTransaction(
                "Zero withdrawal",
                account -> account.withdraw(new BigDecimal("0.00"))
        );
    }

    private static void testNegativeWithdrawal() {
        verifyInvalidTransaction(
                "Negative withdrawal",
                account -> account.withdraw(new BigDecimal("-10.00"))
        );
    }

    private static void testNullWithdrawal() {
        verifyInvalidTransaction(
                "Null withdrawal",
                account -> account.withdraw(null)
        );
    }

    private static void testInsufficientFunds() {
        verifyInvalidTransaction(
                "Insufficient funds",
                account -> account.withdraw(new BigDecimal("150.00"))
        );
    }

    private static void verifyInvalidTransaction(
            String testName,
            AccountOperation operation) {

        EncapsulationDemo.BankAccount account =
                new EncapsulationDemo.BankAccount(
                        new BigDecimal("100.00"));

        BigDecimal originalBalance = account.getBalance();

        expectException(
                testName,
                () -> operation.execute(account)
        );

        if (account.getBalance().compareTo(originalBalance) != 0) {
            throw new AssertionError(
                    testName + " changed the account balance."
            );
        }

        System.out.println(
                "PASS: " + testName + " — balance unchanged"
        );
    }

    private static void expectException(
            String testName,
            Runnable operation) {

        try {
            operation.run();
        } catch (IllegalArgumentException exception) {
            passed++;
            System.out.println("PASS: " + testName);
            return;
        }

        throw new AssertionError(
                testName
                + " should have thrown IllegalArgumentException."
        );
    }

    @FunctionalInterface
    private interface AccountOperation {
        void execute(EncapsulationDemo.BankAccount account);
    }
}
