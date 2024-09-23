package com.javadsa.Assignments;
import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.
//Take name as input and print a greeting message for that particular name.
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//Take 2 numbers as input and print the largest number.
//Input currency in rupees and output in USD.
//To calculate Fibonacci Series up to n numbers.
//To find out whether the given String is Palindrome or not.
//To find Armstrong Number between two given number.
public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        evenOrOdd(sc.nextInt());
        System.out.println("Enter name: ");
        greet(sc.next());
        System.out.println("Enter principal amount: ");
        System.out.println("Enter no of years: ");
        System.out.println("Enter rate of interest");
        simpleInterest(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
    }
    static void evenOrOdd(int n){


        if(n % 2 ==0){
            System.out.println(n+" is even number");
        }
        else{
            System.out.println(n+" is odd number");
        }
    }
    static void greet(String name){
        System.out.println("Hello "+name);

    }
    static void simpleInterest(double p,double t,double r){
        double i =(p*t*r)/100;
        System.out.println("simple interest : "+i);
    }


}
