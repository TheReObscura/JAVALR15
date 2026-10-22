package org.example;

public class Kvartira {
    String address;
    int rooms;
    double price;

    public Kvartira(String _a, int _r, double _p) {
        if (_r < 0) throw new IllegalArgumentException("Нельзя отрицательные комнаты");
        if (_p < 0) throw new IllegalArgumentException("Нельзя отрицательную цену");
        address = _a;
        rooms = _r;
        price = _p;
    }

    public void print() {
        System.out.println("Квартира расположена по адресу: " + address + ". В ней " + rooms + " комнат, и стоит она " + "%,.2f".formatted(price));
    }
}
