package com.java.prac;
import java.util.Scanner;

public class IfPrac {
	public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        if(marks > 85){
            System.out.println("You passed the test");
        }
        System.out.println("Code executed");
        sc.close();
    }
}
