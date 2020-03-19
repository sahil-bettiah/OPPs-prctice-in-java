package com.company;

//Assume that a bank maintains two kinds of accounts for customers, one called as
//        savings account and the other as current account. The savings account provides 4%
//        interest and withdrawal facilities. The current account provides no interest. Current
//        account holders should maintain a minimum balance and if the balance falls below
//        level, a service charge is imposed. Create a class Account that stores customer name,
//        account number and type of account. From this derive the classes Cur_acct and Sav
//        acct to make them more specific to their requirements. Include necessary member
//        functions in order to achieve the following tasks:
//        i. Input functions or constructors for taking the data
//        ii. Accept deposit from a customer and update the balance.
//
//        iii. Display the balance
//        iv. Compute and deposit interest.
//        v. Permit withdrawal and update the balance.
//        vi. Check for the minimum balance, impose penalty, necessary, and update
//        the balance.
//
//        Construct a Java application to fulfil above requirements.

import java.util.Scanner;

class Account {
    String customer_name;
    int account_no;
    int type;
}

class Curr_act extends Account {

    void curr_act(){
        balance= 0;
        int rate = 4;
    }
    int balance = 0;
    int min = 10000;
    int penalty = 10;
    void deposit(int money){
        balance = balance + money;
    }
    void withdraw(int money){
        if(balance>money)
            balance = balance - money;
        else
            System.out.println("Not enough cash");
    }
    void penalty(){
        if (balance<min)
            balance = balance - penalty;
    }
    void display(){
        System.out.println(balance);
    }


}

class Sav_act extends Account {

    void curr_act(){
        balance= 0;
        int rate = 4;
    }
    int balance = 0;
    int min = 10000;
    int penalty = 10;
    void deposit(int money){
        balance = balance + money;
    }
    void withdraw(int money){
        if(balance>money)
            balance = balance - money;
        else
            System.out.println("Not enough cash");
    }
    void display(){
        System.out.println(balance);
    }
    void interest(int rate){
        balance = balance + (rate/100)*balance;
    }


}
public class bank {

    public static String menu(){
        return "Press 1 for deposit \n Press 2 for withdraw \n Press 3 for display balance \n ";
    }

    public static void main(String[] args) {
        Curr_act curract = new Curr_act();
        Sav_act savact = new Sav_act();
        System.out.println("Welcome to Shantanu Sahil Bank");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter account number: ");
        int acc_number = input.nextInt();
        System.out.println("Press 1 for saving and 2 for current");
        int type = input.nextInt();
        int choice;
        if (type == 1) {
            System.out.println(menu());
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter money");
                int money = input.nextInt();
                curract.deposit(money);
            }
            if (choice == 2) {
                System.out.println("Enter money");
                int money = input.nextInt();
                curract.withdraw(money);
            }
            if (choice == 3) {
                curract.display();
            }

        }
        if (type == 2) {
            System.out.println(menu());
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter money");
                int money = input.nextInt();
                savact.deposit(money);
            }
            if (choice == 2) {
                System.out.println("Enter money");
                int money = input.nextInt();
                savact.withdraw(money);
            }
            if (choice == 3) {
                savact.display();
            }


        }
    }

}
