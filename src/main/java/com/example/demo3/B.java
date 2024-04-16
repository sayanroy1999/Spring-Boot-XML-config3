package com.example.demo3;

public class B {
    private int y;

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }

    public B() {
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
