package Lesson3;

import java.util.Scanner;

public class FirstLesson {
  //  public static void main(String[] args) {
    //    //пользовательский ввод
   //     Scanner in = new Scanner(System.in);
        System.out.println("Введте целое число");
        int userNum = in.nextInt();
        System.out.println(userNum * userNum);

        while (true) { //метод вилле условие тру
            System.out.println("Введите целое положительное число" + "или 0 для выхода из программы");
            userNum = in.nextInt();
            if (userNum == 0) break; //breake используется для выхода из текущего цикла (прерывание цикл)
            if (userNum < 0) continue; //переход на следующую итерацию
            System.out.println(userNum * userNum);

            do {
                System.out.println("DO WHILE: введите первое положительное число", "или 0 для выхода из программы");
                userNum = in.nextInt();
                if (userNum < 0) continue;
                System.out.println(userNum * userNum);
            } while (userNum != 0);

            int start = 1, end = 12;
            //вывести все четные числа от старт до энд
            while (start <= end) {
                if (start % 2 == 0) System.out.println(start);
                start += 1;
        }
        for ( start = 1, end = 12; //инициализация переменных ;
              start <= end;// булевое выражение условие ;
            start += 1)// обновление значений переменных )
            {
                if (start % 2 == 0) System.out.println(start);
            }


            for (int num = 90; num >= 0; num -= 5) {
                System.out.println(num);
            }
                for (int num = 2, count = 0;  count < 10; num += 2, count += 1) {
                    System.out.println(num);
                }

            Scanner scanner = new Scanner(System.in);
            System.out.println( "Введте количество тарелок");
            int plates = scanner.nextInt();
            System.out.println("Введте количество моющего средства");
            double fairy = scanner.nextInt();

            while (fairy > 0 && plates > 0);
            fairy -= 0,5;
            plates -= 1;
            System.out.println(fairy);
            System.out.println( plates);
            }





    }
    }
}
