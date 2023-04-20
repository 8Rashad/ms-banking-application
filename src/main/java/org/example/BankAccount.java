package org.example;

import java.util.Scanner;

public class BankAccount {
        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        BankAccount (String name, String id) {
            customerName = name;
            customerId = id;
        }

        void deposit(int amount){
            if (amount != 0){
                balance += amount;
                previousTransaction = amount;
            }
        }
        void withdraw(int amount){
            balance -= amount;
            previousTransaction = -amount;
        }

        void getPreviousTransaction(){
            if (previousTransaction > 0){
                System.out.println("Deposited: " + previousTransaction);
            }
            else if (previousTransaction < 0){
                System.out.println("Withdrawn: " + Math.abs(previousTransaction));
            }
            else {
                System.out.println("No transaction happened");
            }
        }
        void showMenu(){

            char option = '\0';
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome " + customerName);
            System.out.println("Your ID is: " + customerId);
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous transaction");
            System.out.println("E. Exit. Thank you! ");

            do {
                System.out.print("Enter an option: ");
                option = input.next().charAt(0);

                switch (option){
                    case 'A':
                        System.out.println("------------------------------------------");
                        System.out.println("Balance = " + balance);
                        System.out.println("------------------------------------------");
                        break;

                    case 'B':
                        System.out.println("------------------------------------------");
                        System.out.println("Enter an amount to deposit");
                        System.out.println("------------------------------------------");
                        int amount1 = input.nextInt();
                        deposit(amount1);
                        break;

                    case 'C':
                        System.out.println("------------------------------------------");
                        System.out.println("Enter an amount to withdraw");
                        System.out.println("------------------------------------------");
                        int amount2 = input.nextInt();
                        withdraw(amount2);
                        break;

                    case 'D':
                        System.out.println("------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("------------------------------------------");
                        break;
                    case 'E':
                        System.out.println("********************************************");
                        break;

                    default:
                        System.out.println("Invalid Option! Please enter again");
                }
            } while (option != 'E');
            System.out.println("Thank you for using our services");



        }
    }

