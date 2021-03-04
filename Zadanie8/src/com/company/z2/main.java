package com.company.z2;

public class main {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("Bank A: "+a.getBalance()+"\nBank B: "+b.getBalance()+"\nBank C: "+c.getBalance());
    }
}
