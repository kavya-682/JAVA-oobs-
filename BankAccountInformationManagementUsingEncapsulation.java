/*
Problem
Define a class BankAccount with private fields accountNumber, accountHolder, balance, and accountType. Implement getter and setter methods to ensure encapsulation. Write a program that creates a BankAccount object, sets the attributes using user input, and then displays the account information using the getter methods.

Input Format
The input consists of four lines:

A string representing the accountNumber.
A string representing the accountHolder.
A float representing the balance.
A string representing the accountType.
Output Format
The output should display the bank account's information in the following order:

accountNumber
accountHolder
balance
accountType
Do's
Create the class: Define a class named BankAccount.
Declare private attributes: Inside the class, declare private attributes: accountNumber, accountHolder, balance, and accountType.
Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
Implement setter methods: Create public setter methods to assign values to the private attributes.
Take user input: Use the setter methods to set the values for accountNumber, accountHolder, balance, and accountType from user input.
Display output using getter methods: Use the getter methods to display the bank account's information in the specified order.
Sample Inputs & Outputs
Sample Input 1

123456789
John Doe
15000.75
Savings
Sample Output 1

123456789
John Doe
15000.75
Savings

*/

import java.util.Scanner;

class BankAccount {
    // Private attributes
    private String accountNumber;
    private String accountHolder;
    private float balance;
    private String accountType;

    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }
}

public class BankAccountInformationManagementUsingEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create BankAccount object
        BankAccount account = new BankAccount();

        // Take user input
        String accountNumber = sc.nextLine();
        String accountHolder = sc.nextLine();
        float balance = sc.nextFloat();
        sc.nextLine(); // Consume newline
        String accountType = sc.nextLine();

        // Set values using setter methods
        account.setAccountNumber(accountNumber);
        account.setAccountHolder(accountHolder);
        account.setBalance(balance);
        account.setAccountType(accountType);

        // Display output using getter methods
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolder());
        System.out.println(account.getBalance());
        System.out.println(account.getAccountType());

        sc.close();
    }
}
