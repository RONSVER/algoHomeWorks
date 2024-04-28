package org.example.lessonFiveAlgo.homeWorkFiveAlgo.taskSecond;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskTwoMain {
/*
    Дан односвязный список. Написать функцию или блок схему, определяющую,
    образуют ли его элементы симметричную последовательность. Для решения задачи использовать стек и очередь.
    Функция будет возвращать значение true, если список является симметричным, false – в противном случае.

    По определению пустой список является симметричным. Поэтому, если список пуст, то возвращаем значение true.

    Для проверки симметричности списка нужно проверить на равенство все пары элементов,
    равноотстоящих от середины списка.
    Каждая пара содержит один элемент из первой половины списка и один – из второй.
    Элементы первой половины списка последовательно заносятся в очередь, второй половины в стек.
    Если количество элементов списка будет нечетным,
    то серединный элемент будет симметричен сам себе и не будет помещен ни в очередь, ни в стек.
*/

    public static void main(String[] args) {
        LinkedList<String> arrSym = new LinkedList<>(Arrays.asList("A", "B", "C", "C", "B", "A")); // true
        LinkedList<String> arrNonSym = new LinkedList<>(Arrays.asList("X", "Y", "Z", "W")); // false

        LinkedList<String> arrOddSym = new LinkedList<>(Arrays.asList("X", "Y", "Z", "Y", "X")); // true
        LinkedList<String> arrOddNonSym = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G")); // false

        System.out.println("arrSym: " + isSym(arrSym));
        System.out.println("arrNonSym: " + isSym(arrNonSym));
        System.out.println("arrOddSym: " + isSym(arrOddSym));
        System.out.println("arrOddNonSym: " + isSym(arrOddNonSym));
    }

    public static boolean isSym(LinkedList<String> list) {
        if (list.isEmpty()) {
            return true;
        }

        int mid = list.size() / 2;
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < mid; i++) {
            queue.add(list.get(i));
        }

        if (mid % 2 != 0) {
            mid++;
        }

        for (int i = mid; i < list.size(); i++) {
            stack.add(list.get(i));
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }
}
