package ru.itmo.lessons.lesson11;

import java.time.LocalDateTime; //хранит в себе время и дату //метод статический

public class Article {
    private String title;
    private String text;
    private LocalDateTime created;
    private  Country country; //null изначально, затем может ссылаться на одну из стран в кантри
    public Article (String title){
        this.title = title;
        created = LocalDateTime.now();

    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
