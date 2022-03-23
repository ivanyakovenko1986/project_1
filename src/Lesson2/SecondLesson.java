package Lesson2;

public class SecondLesson {

    public static void main(String[] args) {
        //логические операторы (для объединения условий) типа если, то
        // логические операторы всегда тип boolen
        //&& оператор И
        // всегда работа с 2мя операндами. сначала отарбатывает первый с левым и правым. либо тру либо фол. потом работае т2й с левым и правым
        // если первый тру смотрит на 2 и возвращает тру. если фолс то сразу возвращает и не смотрит на 2й
        int x = 50, y = 100, z = 91;
        boolean res = (x % 2 == 0) && (y % 2 == 0) && (z % 2 == 0);
        //              true &&       true          &&  false
        //              true && false
        System.out.println(res); // false

        res = (x < z) && (y > z);

        //res = x < z <y //так не пишется. только через оператор &&
        System.out.println(res);

        // || опертор ИЛИ
        int code = 3333, age = 34;
        res = (code == 2222) || (code == 3333) || (code == 4444); //если один из операндов тру то тру, если оба фолс то фолс
        // res = (code == 2222) && (code == 3333) && (code == 4444); безполезный код, нет условий для оператора И
        System.out.println(res); // true

        res = (code != 3333) || (age < 18);
        // false || false
        System.out.println(res); // false

        //int x = 500;
        //int x;

        // ! оператор НЕ  - меняте значение на противоположное  было фолс стало тру, было тру стало фолс
        System.out.println(!res); //оператор НЕ пменял на противоположны от 25й строки (ТРУ)
        //System.out.println(!code);

        boolean isActive = false, isConnected = true;
        res = isActive || isConnected;
        //      true  ||  false
        System.out.println(res); // true

        res = !((code != 3333) || (age < 18));
        //          false || false
        //              !false
        System.out.println(res); // true


        int state = 1;
        //если state равен 0 вывест в консоль "закрытие приложения"
        //если state равен 1 вывест в консоль "Отрытие приложения"
        //если state равен 0 вывест в консоль "закрытие приложения"
        if (state == 0) {
            System.out.println("закрытие приложения");
        } else if (state == 1) {
            System.out.println("открытие приложения");
        } else {
            System.out.println("Ошибка статуса");

        }

        int month = 5;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11) {
           System.out.println(" Осень");
        }
        month = 5;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка");
        }

        int sum = 1000, saleCode = 7647;
        switch (saleCode) {
            case 4525:
                System.out.println(sum / 100*30);
            case  6424:
            case 7012:
                System.out.println(sum / 100*20);
            case 7647:
            case 9011:
            case 6612:
                System.out.println(sum / 100*10);
            default:
                System.out.println("Ошибка");
        }




    }


}

















