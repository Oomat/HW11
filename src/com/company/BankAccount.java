package com.company;

public class BankAccount extends Exception {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Вы пополнили счет на " + sum);

    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Не достаточна средств", amount);

        } else {
            amount -= sum;
            System.out.println("Вы сняли с вашего счета: " + sum + " " + "\n" + "Ваш счет: " + amount);
        }

    }

}


