package com.company.z2;
import java.util.Scanner;

public class MainBankException {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Czy chcesz stworzyc konto ?");
        boolean doCreateAccount = getYesNoAnswer();
        if(!doCreateAccount) {
            endProgram();
        }
        Account account = createNewAccount();
        System.out.println("Czy chcesz wyplacic pieniadze?");
        boolean shouldWithdrawMoney = getYesNoAnswer();
        if(!shouldWithdrawMoney) {
            endProgram();
        }

        while (true) {
            System.out.println("Ile chcesz wyplacic ?");

            try {
                int amount = getAmount();
                try {
                    account.withdraw(amount);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nie jest to liczba!");

                }
            }catch (NumberFormatException e){
                System.out.println("Nie jest to liczba!");

            }

        }
        System.out.printf("Dziekujemy za skorzystanie z serwisu. Twoj stan konta to: %.2f $", account.getBalance());

    }

    private static Account createNewAccount() {
        String name = "";
        while (name.length() < 1){
            System.out.println("Jak masz na imie ?");
            name = scanner.nextLine();
        }


        while (true) {
            System.out.println("Ile srodkow chcesz dodac do swojego konta?");
             try{
                 int initialAmount = getAmount();
                 return new Account(name, initialAmount);
             }catch (NumberFormatException e){
                 System.out.println("Nie jest to liczba!");
             }
        }
    }
    private static void endProgram() {
        System.out.println("Dziekujemy za korzystanie z serwisu");
        System.exit(0);
    }
    private static int getAmount() {
        Integer x =  Integer.parseInt(scanner.nextLine());
        if (x instanceof Integer == false){
            throw new NumberFormatException();
        }
        return x;
    }
    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if(userAnswer.toLowerCase().contains("y")) {
            return true;
        }else if(userAnswer.toLowerCase().contains("n")) {
            return false;
        } else {
            System.out.println("Napisz tak lub nie");
            return getYesNoAnswer();
        }
    }
}
