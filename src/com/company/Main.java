package com.company;

import com.company.user.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vartotojo registracija:");
        System.out.print("Tel. +370 ");
        int phoneNo = scanner.nextInt();
        String email = scanner.next();

        User user = new User(phoneNo, email);

        System.out.println(user.toString());
    }
}
