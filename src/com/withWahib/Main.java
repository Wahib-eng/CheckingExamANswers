package com.withWahib;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        // إجابات الطلاب في الاختبار
        int studentCount=0;
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // الاجابات الصحيحة
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // تقيمم الاجابات
        for (int i = 0; i < answers.length; i++) {
            // تقييم طالب واحد
            int countCorrect = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    countCorrect++;

            }
            studentCount++;
            System.out.println(" الطالب رقم "+ studentCount +" يمتلك "+ countCorrect+" إجابات صحيحة. ");
        }
    }
}