package ru.innopolis.bootcamp22.day2.rxjava.types;

public class Bookmark {
    @Override
    public String toString() {
        return "Bookmark{" + "id=" + id + ", offset=" + offset + '}';
    }

    public int id;
    public int offset;

    public Bookmark(int id, int offset) {
        this.id = id;
        this.offset = offset;
    }
}