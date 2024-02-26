package org.example.algoHomeWorkTwo;

public class Algo {
    public static void main(String[] args) {

    }



//    1. сложность этого алгоритма ровна O(1)
    void test1(int n) {
        if (n==1) {
            return;
        }
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("*");
                break;
            }
        }
    }

//    2. сложность этого алгоритма ровна O(n^2)
    void test2(int n) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                a = a + i + j;
            }
        }
    }

//    3. общая сложность этого алгоритма ровна O(n log n) если откинуть неважную сложность тогда O(n)
    void test3(int n)
    {
        int i, j, a = 0;
        for (i = n/2; i <=n; i++)
            for (j = 2; j <=n; j=j*2)
                a=a+n/2;

    }

    //    4. сложность этого алгоритма ровна O(log n)
    void test4(int n)
    {
        int a = 0, i = n;
        while (i > 0) {
            a += i;
            i /= 2;
        }
    }

}
