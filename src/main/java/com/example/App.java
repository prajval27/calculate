package com.devops;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result = " + (a + b)); break;
            case '-': System.out.println("Result = " + (a - b)); break;
            case '*': System.out.println("Result = " + (a * b)); break;
            case '/': System.out.println(b != 0 ? "Result = " + (a / b) : "Division by zero not allowed"); break;
            default: System.out.println("Invalid operator");
        }
    }
}
