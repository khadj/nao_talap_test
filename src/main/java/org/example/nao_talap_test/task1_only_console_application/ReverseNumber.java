package org.example.nao_talap_test.task1_only_console_application;

public class ReverseNumber {
//    /* Проверка правильности метода

    public static void main(String[] args) {
        System.out.println(new ReverseNumber().reverseNumber(123)); // 321
        System.out.println(new ReverseNumber().reverseNumber(-123)); // -321
        System.out.println(new ReverseNumber().reverseNumber(120)); // 21
    }

//    */

    public int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
