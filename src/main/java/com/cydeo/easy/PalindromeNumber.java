package com.cydeo.easy;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 12321;
        System.out.println("isPalindrome(num) = " + isPalindrome(num));
        System.out.println("isPalindrome2(num) = " + isPalindrome2(num));

    }

    public static boolean isPalindrome(int num){
        if(num<0) return false;
        int reversed = 0, reminder, original = num;
        while(num!=0){
            reminder = num%10; // reversed integer is stored in variable
            reversed = reversed * 10 + reminder;//multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            num /= 10; //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }

    public static boolean isPalindrome2(int num){
        if(num<0) return false;
        int reversed = 0, reminder,original = num;
        while(num !=0){
            reminder = num*10;
            reversed = reversed * 10 + reminder;
            original /= 10;
        }
        return original == reversed;
    }

}
