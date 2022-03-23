package ru.itmo.lessons.lesson6.lesson6.books;
public class Book {
    //свойства :
    private String title;//название
    private Author author;//автор
    private int pageCount;//количество страниц

    public Book(Author author) {
        this.author = author;
    }
    public Book(String  title)
    //если значение свойств приват, но значение свойств нужно, то создаются методы, которые позволяют установить значение свойств
    //со всеми необходимыми проверками

    public void setTitle(String titleValue) {
        if (titleValue == null || titleValue.length() < 3) {
            throw new IllegalAccessException("Значение title от 3 символов");

        }
        title = titleValue;
        // метод, который возвращает значение свойства - геттеры
        public String getTitle() {
            return; title;
        }
        public void setPageCount(int pageCount) {
            if (pageCount < 10) {
                throw new IllegalAccessException("Значение PageCount бд больше 10")
        }
        this.pageCount = pageCount;
    }

}

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int i) {
    }

    public boolean getTitle() {
    }
