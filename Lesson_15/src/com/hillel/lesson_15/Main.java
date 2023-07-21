package com.hillel.lesson_15;

import java.util.Scanner;

public class Main extends LoginUtils{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter login:");
        String login = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();
        System.out.println("Confirm password");
        String confirmpassword = sc.nextLine();
        System.out.println(validateLoginInfo(login, password, confirmpassword));
    }
}
