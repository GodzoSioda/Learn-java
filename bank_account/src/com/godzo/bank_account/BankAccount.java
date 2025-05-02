package com.godzo.bank_account;

import java.util.Arrays;
import java.util.function.Predicate;

public class BankAccount {

    private static String[] accountNumbers = new String[3];
    private final int accountId;
    private int balance;

    private BankAccount(int accountId, int balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public int getAccountNumber() {
        String str = accountNumbers[accountId];
        return Integer.parseInt(str);
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int sumDeposit) {
        balance += sumDeposit;
    }

    public void withdraw(int sumWithdraw) {
        if(balance > 0 && balance >= sumWithdraw) {
            balance -= sumWithdraw;
        }
    }

    public static BankAccount createAccount(int accountNumber, int balance) {
        BankAccount account = null;
        String numberStr = Integer.toString(accountNumber);
        if(Arrays.stream(accountNumbers).noneMatch(Predicate.isEqual(numberStr))) {
            int index = checkArray();
            accountNumbers[index] = numberStr;
            account = new BankAccount(index, balance);
        }
        return account;
    }

    private static int checkArray() {
        int index = -1;
        for(int i = 0; i < accountNumbers.length; i++) {
            if(accountNumbers[i] == null) {
                index = i;
                break;
            } else {
                index = accountNumbers.length;
                accountNumbers = Arrays.copyOf(accountNumbers, accountNumbers.length +2);
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                '}';
    }
}
