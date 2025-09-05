/*
Problem
Create a class `Account` with private attributes `accountNumber` and `balance`. It should have methods to set and get these attributes. Additionally, it should have a method `getDetails()` which returns the account details.



Derive a class `SavingsAccount` from `Account`, adding an attribute `interestRate`. It should override the `getDetails()` method to include the interest rate in the account details.



Derive another class named `CurrentAccount` from `Account`, adding an attribute `overdraftLimit`. It should override the `getDetails()` method to include the overdraft limit in the account details.



Write a program that asks the user which type of account needs to be created. According to the user's choice, collect the details from the user and display the information of the respective account.

Input Format
- The first line contains the type of account ("SavingsAccount" or "CurrentAccount").

- The second line contains a comma-separated list of the attributes for the account.

  - For a SavingsAccount: accountNumber,balance,interestRate

  - For a CurrentAccount: accountNumber,balance,overdraftLimit

Output Format
- A single line displaying the account details in the format: `Account Details: Account Number: <AccountNumber>, Balance: <Balance>, Interest Rate: <InterestRate>%` for SavingsAccount



﻿or `Account Details: Account Number: <AccountNumber>, Balance: <Balance>, Overdraft Limit: <OverdraftLimit>` for CurrentAccount.

Do's
Create a base class named Account.
Use private variables in the Account class named accountNumber and balance.
Create a subclass named SavingsAccount using inheritance.
Use a private variable in the SavingsAccount class named interestRate.
Create a subclass named CurrentAccount using inheritance.
Use a private variable in the CurrentAccount class named overdraftLimit.
Override the getDetails() method in SavingsAccount and CurrentAccount.
Create appropriate public getters and setters for variables in Account, SavingsAccount, and CurrentAccount.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

SavingsAccount
12345,10000,2.5
Sample Output 1

Account Details: Account Number: 12345, Balance: 10000, Interest Rate: 2.5%
Sample Input 2

CurrentAccount
67890,5000,1000
Sample Output 2

Account Details: Account Number: 67890, Balance: 5000, Overdraft Limit: 1000
Constraints
1. The `accountNumber` is a positive integer.

2. The `balance` is a positive integer.

3. The `interestRate` is a positive floating-point number with up to two decimal places.

4. The `overdraftLimit` is a positive integer.

5. The `accountNumber`, `balance`, `interestRate`, and `overdraftLimit` values must be between 1 and 1,000,000 inclusive.

6. Input values must be provided in the correct format, otherwise, the program should handle errors gracefully.

7. There must be no leading or trailing spaces in the comma-separated input values.
*/

import java.util.Scanner;

// Base class
class Account {
    private int accountNumber;
    private int balance;

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Method to return details (will be overridden)
    public String getDetails() {
        return "Account Details: Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

// Derived class: SavingsAccount
class SavingsAccount extends Account {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String getDetails() {
        return "Account Details: Account Number: " + getAccountNumber() +
               ", Balance: " + getBalance() +
               ", Interest Rate: " + interestRate + "%";
    }
}

// Derived class: CurrentAccount
class CurrentAccount extends Account {
    private int overdraftLimit;

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getDetails() {
        return "Account Details: Account Number: " + getAccountNumber() +
               ", Balance: " + getBalance() +
               ", Overdraft Limit: " + overdraftLimit;
    }
}

// Main program
public class AccountInformationUsingInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String accountType = scanner.nextLine().trim();
            String[] inputValues = scanner.nextLine().trim().split(",");

            if (accountType.equals("SavingsAccount")) {
                if (inputValues.length != 3) {
                    System.out.println("Invalid input format for SavingsAccount.");
                    return;
                }

                int accountNumber = Integer.parseInt(inputValues[0]);
                int balance = Integer.parseInt(inputValues[1]);
                double interestRate = Double.parseDouble(inputValues[2]);

                SavingsAccount sa = new SavingsAccount();
                sa.setAccountNumber(accountNumber);
                sa.setBalance(balance);
                sa.setInterestRate(interestRate);

                System.out.println(sa.getDetails());

            } else if (accountType.equals("CurrentAccount")) {
                if (inputValues.length != 3) {
                    System.out.println("Invalid input format for CurrentAccount.");
                    return;
                }

                int accountNumber = Integer.parseInt(inputValues[0]);
                int balance = Integer.parseInt(inputValues[1]);
                int overdraftLimit = Integer.parseInt(inputValues[2]);

                CurrentAccount ca = new CurrentAccount();
                ca.setAccountNumber(accountNumber);
                ca.setBalance(balance);
                ca.setOverdraftLimit(overdraftLimit);

                System.out.println(ca.getDetails());

            } else {
                System.out.println("Invalid account type.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}
