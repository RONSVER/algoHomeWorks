package org.example.lessonThreeAlgo.homeWorkAlgoThree;

public class SecondTask {
/*
    Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
*/


    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciFun(i) + " ");
            //        0 1 1 2 3 5 8 13 21 34
        }
        System.out.println();
        System.out.println(palindromesFun(" Шалаш "));

    }

    public static int fibonacciFun(int sum) {
        if (sum <= 1) {
            return sum;
        }

        return fibonacciFun(sum - 2) + fibonacciFun(sum - 1);
    }

    /*
    Напишите рекурсивный метод, который проверяет, является ли строка палиндромом
    */



    public static String palindromesFun(String str) {
        String strFilter = str.toLowerCase().replace(" ", "");

        if (strFilter.length() <= 1) {
            return "YES";
        }

        if (strFilter.charAt(0) != strFilter.charAt(strFilter.length() - 1)) {
            return "NO";
        }

        return palindromesFun(strFilter.substring(1, strFilter.length() - 1));
    }

}
