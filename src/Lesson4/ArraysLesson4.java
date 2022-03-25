package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLesson4 {
    public static void main(String[] args) {
        //примитивные типы данных
        //ссылочные типы данных
       /*
        int a = 78;
        int b = a;
        a = 100;

        Scanner scanner = new Scanner(System.in);
        Scanner in = scanner;
        */
        int[] ints1 = new int[7];//квадратные скобки (число это размер масива на количество элементов)после типа данных более правильное отображенеи при создании массива
        //int ints1[] =
        System.out.println(ints1);
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = {6, -90, 56, 12, 0, -44} //в фигурных скобках создается массив со знанением
        System.out.println(Arrays.toString(ints2));
        ints2 = new int[3]
        System.out.println(Arrays.toString(ints2));

        //ints2 = {34, 78, 12}; при создании новых размеров масива нельзя присвоить ему новые значения, только изменить размер квадратными скобками
        //ints2 = new int[] {34, 78, 12}; правильное изменение массива. при этом ссылка на старые масивы инст2 становятся мусором
                //длина массива - положительное знанчение типа инт
        int len = 10;
        int[] ints3 = new int[len];
        int[] ints4 = new int[len + 5]; //длина массива стала 15
        System.out.println(Arrays.toString(ints4));

        System.out.println(ints4.length); //15

        //доступ к элементам масива через кв скобки
        System.out.println(ints4[3]); //0 так как массив пока состоит из 0
        int arrElem = ints4[3];
        ints4[2] = 56;
        System.out.println(Arrays.toString(ints4))

                //многомерный массив
        // [ [0.0.0.0], [0,0,0,0], [0,0,0,0] ]
        int[][] ints5 = new int[3][4];
        //вывод многомерного масива
        System.out.println(Arrays.deepToString(ints5));

        // [ [0,0], [0,0,36], [0,90,0,0] ]
        int[][] inst6 = new int[3][]; //[null, null, null]
        inst6[0] =new int[2]; //[0,0], null, null]
        inst6[1] =new int[3]; //[0,0], [0,0,0], null]
        inst6[2] =new int[4]; //[0,0], [0,0,0], [0,0,0,0]]
        System.out.println(Arrays.deepToString(inst6));
        inst6[2][1] = 90;
        inst6[1][2] = 36;

        int[] ints7 = {3, -6, 12, 0, 4};
        //for позволяет изменить значение элемента массива
        for (int i = 0; i < ints7.length; i = 1) {
            ints7[i]  *= ints7[i]; // ints7[i] = ints7[i] * ints7[i];
        }
            // найти сумму элементов массива inst7

        int s = 0;
            for (int i = 0; i < ints7.length; i = 1) {
                s += ints7[i];
                System.out.println(s);

        s = 0;
        //не предоставляет доступа к индексам
                //не дает возможность изменить значение элементов массива
                for (int element: ints7) {
                    System.out.println(element);
                    s += element;

                    // найти и вывести консоль миимальное значение массива ints8
                    double[] ints8 = {3.7, -6.2, 12.9, 0.4, 4.1};
                    double minValue = ints8[0];

                    for (double elem: ints8) {
                        if (minValue > elem) minValue = elem;
                        System.out.println(minValue);
                    }
                    Arrays.sort(ints8);
                    System.out.println(Arrays.toString(ints8));
                    int element = Arrays.binarySearch(ints8, key 3.7);
                    System.out.println(element); // 2

                    //копирование массива

                    double[] ints9 = {3.7, -6.2, 12.9, 0.4, 4.1};
                    //double[] ints10 = ints9; //так массивы не копируются
                    double[] cloneInts9 = ints9.clone();

                    double[] copyInts9 = Arrays.copyOf(ints9, newLegth: 3);
                    System.out.println(Arrays.toString(copyInts9));

                    double[] newDoubles = new double[10];
                    System.arraycopy(ints9, 1, newDoubles, 3, 2);
                    //[]






                }



            }
    }
}
