package ru.itmo.lessons.lesson11;

public enum Planet {
    SUN(5, 2), MARS(7, 14), EARTH(3, 8);
    private int w;
    private int r;
    Planet(int w, int r){
        this.w = w;
        this.r =r;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getW() {
        return w;
    }

    public int getR() {
        return r;
    }
}
