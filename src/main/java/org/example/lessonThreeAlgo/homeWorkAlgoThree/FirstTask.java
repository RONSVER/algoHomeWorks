package org.example.lessonThreeAlgo.homeWorkAlgoThree;

public class FirstTask {

    /*
    Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
    Операцией возведения в степень пользоваться нельзя!


    Ввод 8
    Вывод: YES
    Ввод 3
    Вывод: NO
    */

//    Дано натуральное число N. Вычислите сумму его цифр.
//    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
//
//
//    Ввод 179
//    Вывод 17
//
//
//    Ввод 985
//    Вывод  22


    public static void main(String[] args) {
        System.out.println(isStage(2));
        System.out.println(allNum(16));
    }

    public static String isStage(int num) {
        if (num <= 0) {
            return "NO";
        }


        while (num > 1) {
            if (num % 2 != 0) {
                return "NO";
            }

            num /= 2;
        }

        return "YES";
    }

    public static int allNum(int sum) {
        if (sum == 0) {
            return 0;
        }

        return sum % 10 + allNum(sum / 10);
    }

}