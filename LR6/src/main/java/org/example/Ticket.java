package org.example;

public class Ticket {
    private String event;
    private int seatNumber;
    private double price;

    public Ticket(String event, int seatNumber, double price) {
        setEvent(event);
        setSeatNumber(seatNumber);
        setPrice(price);
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        if (seatNumber < 0) throw new IllegalArgumentException("Место не может быть отрицательным");
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Цена не может быть отрицательной");
        this.price = price;
    }

    public void print() {
        System.out.println("Билет на событие: " + getEvent() + " на место " + getSeatNumber() + ". Стоимость: " + getPrice());
    }

    public void appyDiscount(double percent) {
        setPrice(getPrice() - (getPrice() * percent / 100.0));
        System.out.println("Стоимость билета после скидки: " + getPrice());
    }
}
