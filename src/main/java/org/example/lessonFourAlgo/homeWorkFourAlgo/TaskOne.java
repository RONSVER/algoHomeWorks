package org.example.lessonFourAlgo.homeWorkFourAlgo;

public class TaskOne {
    public static void main(String[] args) {
//        1 уровень сложности: Составить блок схему следующей задачи:
//
//        Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
//
//
//                Массив 1 - 100 112 256 349 770
//        Массив 2 - 72 86 113 119 265 445 892
//        к = 7
//        Вывод : 256


        TaskOne taskOne = new TaskOne();

        int[] arrOne = {100, 112, 256, 349, 770};
        int[] arrTwo = {72, 86, 113, 119, 265, 445, 892};
        int ind = 7;


        System.out.println(taskOne.indTwoArrays(arrOne, arrTwo, ind));

    }

    public int indTwoArrays(int[] arrOne, int[] arrTwo, int index) {
        int i = 0, j = 0, count = 0;

        while(i < arrOne.length && j < arrTwo.length) {
            if (arrOne[i] < arrTwo[j]) {

                count++;

                if (count == index) {
                    return arrOne[i];
                }

                i++;

            } else {

                count++;

                if (count == index) {
                    return arrTwo[j];
                }

                j++;
            }
        }

        while (i < arrOne.length) {

            count++;

            if (count == index) {
                return arrOne[i];
            }

            i++;
        }

        while (j < arrTwo.length) {


            count++;

            if (count == index) {
                return arrTwo[j];
            }



            j++;
        }

        return -1;
    }
}
