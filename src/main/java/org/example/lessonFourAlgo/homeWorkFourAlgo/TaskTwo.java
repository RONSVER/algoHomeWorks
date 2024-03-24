package org.example.lessonFourAlgo.homeWorkFourAlgo;

public class TaskTwo {
    public static void main(String[] args) {
        String input = "poiuytrewqlkjhgfdsamnbvcxz";
        String sortedString = sortString(input);
        System.out.println(sortedString);
    }

    public static String sortString(String str) {
        if (str.length() <= 1) {
            return str.toUpperCase();
        }

        int mid = str.length() / 2;
        String leftHalf = str.substring(0, mid);
        String rightHalf = str.substring(mid);

        leftHalf = sortString(leftHalf);
        rightHalf = sortString(rightHalf);

        return merge(leftHalf, rightHalf);
    }

    public static String merge(String left, String right) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0, j = 0;

        while (i < left.length() && j < right.length()) {
            if (left.charAt(i) < right.charAt(j)) {
                stringBuilder.append(left.charAt(i));
                i++;
            } else {
                stringBuilder.append(right.charAt(j));
                j++;
            }
        }

        while (i < left.length()) {
            stringBuilder.append(left.charAt(i));
            i++;
        }

        while (j < right.length()) {
            stringBuilder.append(right.charAt(j));
            j++;
        }

        return stringBuilder.toString().toUpperCase();
    }
}
