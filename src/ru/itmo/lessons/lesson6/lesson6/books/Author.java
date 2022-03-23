package ru.itmo.lessons.lesson6.lesson6.books;

import ru.itmo.lessons.lesson6.lesson6.books.Book;
import ru.itmo.lessons.lesson6.lesson6.books.Shelf;

public class Author {
    public String name; //если паблик, то можно обратится из любой точки программы
    public String surname;
    //свойства, характеристики, поля, атрибуты
    //String name;
   // String surname;

    //методы

    public  void printFullName() { //void не возвращает ничего, просто выполняет инструкции
        System.out.println(name + " " + surname);

        public String getFullName(){
            return name + " " + surname;
        }

        Book book1 = new Book();
                book1.setTitle("Книга");
        System.out.println(book1.getTitle());
        book1.setPageCount(22);

        Book book1 = new Book();

        Shelf shelf = new Shelf();
        shelf.addBook(book1);
        shelf.addBook(book1, book1, book1);






    }


}
