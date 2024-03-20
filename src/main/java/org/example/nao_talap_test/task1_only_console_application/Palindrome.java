package org.example.nao_talap_test.task1_only_console_application;

public class Palindrome {

//    /* Проверка правильности метода

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome("radar")); // true
        System.out.println(new Palindrome().isPalindrome("level")); // true
        System.out.println(new Palindrome().isPalindrome("Radar")); // false
    }

//     */

    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^\\p{L}]", "");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
