# Day 2 — Object-Oriented Programming

## Objectives

- Understand encapsulation, inheritance, polymorphism and abstraction.
- Explain OOP concepts in British English.
- Apply OOP principles to a payment-processing example.

## Concepts Learned

### Encapsulation

Encapsulation protects an object's internal state and provides controlled access through methods that enforce business rules.

In the `BankAccount` example, the `balance` field is private. The `deposit()` and `withdraw()` methods validate transactions before modifying the balance.

### Inheritance

Inheritance allows a class to extend another class and specialise its behaviour.

In the payment example, `CardPayment`, `BankTransferPayment` and `WalletPayment` extend the abstract `PaymentMethod` class.

### Polymorphism

Polymorphism allows different implementations to be used through a common type.

The `processPayment()` method accepts a `PaymentMethod` reference and calls `pay()`. Java executes the implementation corresponding to the actual object at runtime.

### Abstraction

Abstraction exposes essential behaviour while hiding implementation details.

The abstract `PaymentMethod` class defines the `pay()` contract, which each concrete payment class implements.

## Practical Exercises

- `EncapsulationDemo.java`
- `OopPillarsDemo.java`
- `BankAccountValidationTest.java`
- `WalletPayment` implementation
- Invalid input and insufficient balance scenarios
- Payment processing through a common abstract type

## Testing

### EncapsulationDemo.java

**Compilation:** Successful.

**Command:**

```powershell
javac EncapsulationDemo.java
```

**Execution:**

```powershell
java EncapsulationDemo
```

**Expected output:**

```text
Balance: 120.00
```

### OopPillarsDemo.java

**Compilation and execution:** Successful.

**Commands:**

```powershell
javac OopPillarsDemo.java
java OopPillarsDemo
```

**Actual output:**

```text
Processing card payment: 100.00
Processing bank transfer: 250.00
Processing wallet payment: 75.00
```

**Result:** All three payment implementations compiled and executed successfully.

### BankAccountValidationTest.java

**Test type:** Java test harness without external testing libraries.

**Compilation:**

```powershell
javac EncapsulationDemo.java BankAccountValidationTest.java
```

**Execution:**

```powershell
java BankAccountValidationTest
```

**Scenarios tested:**

1. Negative initial balance.
2. Null initial balance.
3. Zero deposit.
4. Negative deposit.
5. Null deposit.
6. Zero withdrawal.
7. Negative withdrawal.
8. Null withdrawal.
9. Withdrawal exceeding the available balance.

**Additional verification:** Invalid deposit and withdrawal operations must leave the account balance unchanged.

**Actual result:** Passed — all 9 scenarios.

**Status:** Completed successfully on 27 October 2026.

The test output confirmed that all nine scenarios passed. Invalid operations threw `IllegalArgumentException`, and invalid transactions did not modify the account balance.

## Interview Practice

### 1. What is encapsulation and why is it important?

Encapsulation protects an object's internal state by restricting direct access to its fields and exposing controlled methods. It helps maintain data integrity and prevents invalid state changes.

### 2. What is the difference between inheritance and composition?

Inheritance represents an "is-a" relationship, where a class extends another class. Composition represents a "has-a" relationship, where an object contains or collaborates with other objects.

Composition often provides greater flexibility because behaviour can be delegated to separate components instead of being tied to an inheritance hierarchy.

### 3. How does runtime polymorphism work in Java?

Runtime polymorphism allows Java to select an overridden method implementation based on the actual object's type at runtime. In this exercise, each payment class implements `pay()` differently while `processPayment()` works with the common `PaymentMethod` type.

### 4. What is the difference between an interface and an abstract class?

An abstract class can provide shared state, constructors and concrete or abstract methods. An interface defines a contract that classes can implement and supports multiple interface implementation. The choice depends on whether shared implementation or a common capability is required.

## Lessons Learned

- Encapsulation protects internal state and allows validation through controlled methods.
- Inheritance supports specialised payment implementations.
- Polymorphism allows the same processing method to work with different payment types.
- Abstraction separates the payment contract from the implementation.
- A missing or misplaced closing brace can cause Java compilation errors.
- Compilation and execution should be verified before committing code.
- `BigDecimal` is preferable to `double` for many monetary calculations because it supports decimal arithmetic without binary floating-point representation errors.
- Automated tests help verify validation rules and prevent invalid state changes.

## Next Steps

- Review composition versus inheritance.
- Compare interfaces with abstract classes.
- Add a `CryptoPayment` implementation without modifying `processPayment()`.
- Practise explaining OOP concepts in British English.
- Review the changes and commit the completed exercises to GitHub.
