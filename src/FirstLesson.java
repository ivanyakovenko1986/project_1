public class FirstLesson {
    //coment
    //однострочный коментарий
    /*
    многострочный
    коментарий
     */



    public static void main(String[] args) {
        //sout
        System.out.println("Информация для вывода в консоль");

        //типДанных имяПеременной
        int size; // бъявили переменную size типа int
        size = 56;
        int count = 71899;

        count = 800_000; //деление чисел нижним подчеркиванием для удобства
        System.out.println(count);

        long veryBig = 67_000_000_000L;

        //деление целых чисел на 0
        //System.out.println(count / 0);

        double price = 56.7;
        float temp = -78.3F;

        //деление целых чисел на 0
        System.out.println(price / 0); //Infinity
        System.out.println(temp / 0);  //-Infinity

        //double price = 34; //двух переменных с одинаковыми именами не может быть объявленно в рамках одной

        count = 8700; // int 8700
        //автоматическое приведение типов
        price = count; //double 8700.0
        System.out.println(price);

        //явное проведение типов используется как с примитивными так и с сылочными типами
        byte small = (byte) count;
        System.out.println(small); //-4

        // операторы
        int a = 9, b = 4;
        int c = a / b;
        System.out.println(c);

        byte x = 6, y = 12;
        byte z = (byte) (x + y); //18
        System.out.println(z);

        //операторы присваивания

        int num = 10; // "=" "+=" "-=" "*=" "/=" "%=" оператор присваивнаия
        num += 10; // num = num + 10;
        num -= 10; // num = num - 10;
        num *= 10; // num = num * 10;
        num /= 10; // num = num / 10;
        num %= 10; // num = num % 10;

        //тернарный оператор

        int start = 3, end = 5000;
        int res = start > end ? end - start : 0;
        System.out.println(res);
















    }

}
