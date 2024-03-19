package org.example.nao_talap_test.task1_only_console_application;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        System.out.println("Введите числа:");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Число №" + (i + 1));
            sum += scanner.nextDouble();
        }
        double average = sum / n;
        System.out.println("Среднее значение: " + average);
    }
}
