package ru.itmo.lessons.lesson11;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Article article1 = new Article("Путешествие по Австрали");
        article1.setCountry(Country.AUSTRALIA);
        System.out.println(article1.getCountry());

        Article article2 = new Article("Путешествие по Великобритании");
        article2.setCountry(Country.UK);
        System.out.println(article2.getCountry());

        //методы перечислений
        //получение массива констант
        Country[] countries = Country.values(); //метод вэлиос вернет в массив все элементы перечисления
        System.out.println(Arrays.toString(countries));

        System.out.println(Country.FRANCE.ordinal()); //метод ординал (только для перечислений) вызывает номер элемента в массиве. кантри.франс.ординал

        for (Country country : countries) {
            System.out.println("country" + country.name()); //метод name (только для перечислений) выводит названия в консоль. тоже самое что и tooString
        }
        Country country = Country.valueOf("UK");//тип перечисления. возвращает ссылку на элемент
        System.out.println(country);

        Priority low = Priority.LOW;
//        Priority low2 = Priority.LOW;
//        Priority low3 = Priority.LOW; //три ссылки на один объект ЛОУ
        System.out.println(low.getCode()); //1

        low.setCode(2);
        System.out.println(low.getCode()); //2

        Priority[] priorities = Priority.values();
        for (Priority value : Priority.values()){
            System.out.println(value.getCode());
        }

        int sumRes = Operation.SUM.action(2,3);
        System.out.println(sumRes);

        int multiRes = Operation.MULTI.action(2,3);
        System.out.println(multiRes);

        Planet[] planets = Planet.values();
        for (Planet planet : planets) {
            System.out.println(planet.name());
            System.out.println(planet.getR());
            System.out.println(planet.getW());
        }
    }
}
