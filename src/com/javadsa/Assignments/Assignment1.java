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
        evenOrOdd();
    }
    static void evenOrOdd(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        int n =sc.nextInt();
        if(n % 2 ==0){
            System.out.println(n+" is even number");
        }
        else{
            System.out.println(n+" is odd number");
        }
    }

}
