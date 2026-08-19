package com.java.prac;

public class IfElsePrac {
	public void demo(){
        int balance = 1000;
        int withdraw = 500;
        if(balance >= withdraw) {
            System.out.println("WithdrawDraw successful!! Balance is : " + (balance - withdraw));
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
