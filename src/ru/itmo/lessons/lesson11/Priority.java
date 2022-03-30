package ru.itmo.lessons.lesson11;
//enum может создаваться со свойствами, конструкторами, методами
public enum Priority {
    HIGH(10), MIDLE(5), LOW(1);
    // если встроке только элементы, то точку с запятой можно не ставить.
    // если не только перечисление, то ; ставить обязательно
    private int code;
    Priority(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    //метод доступен всем элементам перечисления согласно модфикаторам доступа

    public void setCode(int code) {
        this.code = code;
    }

}
