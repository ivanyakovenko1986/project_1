package ru.itmo.lessons.lesson6.lesson6;

import ru.itmo.lessons.lesson6.lesson6.books.Book;
import ru.itmo.lessons.lesson6.lesson6.books.Author;



//полное имя пакета + имя класса, например ru.itmo.lessons.lesson6
public class Application {
    public static void main(String[] args) {
        //объект, экземпляр класса Author
        //если лассы находятся в разных пакетах их нужно импортировать
        Author author1 = new Author();
        //обращение к свойствам
        author1.name = "tom";//доступ к свойствам объекта осуществляется через точку
        author1.surname = "Crowed";
        Author author2 = new Author();
        author2.name = "Mike";
        author2.surname = "Thompson";

        //вызов метода
        author1.printFullName();
        author2.printFullName();

       String fullName = author1.getFullName();
       System.out.println(fullName);

        // класс - способ описания сущности, определяющий ее сосотояние и поведение
        // класс - набор свойств и методов будущих объектов

        // на основе класса создаются объекты (экземпляры данного класса) - представители
        // данного класса имеющие конкретное состояние и поведение, определенное в классе

    }
}
