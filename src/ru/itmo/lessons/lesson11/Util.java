package ru.itmo.lessons.lesson11;

public class Util {
    public static int max;
    public static int min;
    public final static Double Pi;
    //статический блок для инициализации статистических свойств (переменных)
    // инструкции выполняются только один раз при загрузке класса
    static { //статический блок. источник выполнит только один раз при загрузке класса. в нем можно вызывать стат свойства и методы
        Pi = 3.14;
    }
    public static int random(int min, int max){
        //из татических методов нельзя обратится к не статическим методам и свойствам
        //нельзя обратиться к this
        return (int) (min + Math.random() * (max - min));
    }
}
