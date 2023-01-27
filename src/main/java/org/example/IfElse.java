package org.example;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько ам осталось работать");
        int a = scanner.nextInt();

        if (a > 65) {
            System.out.println("Сиди пей пиво");
        } else {
            System.out.println("Иди работай");
        }
    }
}
