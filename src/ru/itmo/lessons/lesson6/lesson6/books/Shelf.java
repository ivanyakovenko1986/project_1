package ru.itmo.lessons.lesson6.lesson6.books;

public class Shelf {
    private String color = "white";//цвет полки
    //книги
    private Book[] books = new Book[10];

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i += 1) {
            if (books[i] == null) {
                books[i] = book;
                return;

            }
        }
        System.out.println("нет места");

    public void addBook(Book... books) {
        for (int i = 0)
        }
    }
}
