package ru.car;

//Напишите программу с классом Car.
//- Создайте констуктор класса Car
//- Создайте атрибуты класса Car: color, type, year
//- Напишите 5 методов:
//1. запуск автомобиля
//2. отключение автомобиля
//3. присвоение автомобилю год выпуска
//4. присвоение автомобилю тип
//5. присвоение автомобилю цвета

public class Car {
    // атрибуты
    private String color;
    private String type;
    private int year;
    boolean started = false;

    static int count = 0;

    // конструктор
    public Car (String type, int year) {
        color = "green";
        this.type = type;
        this.year = year;
        countCar(); // считаем объекты, которые созданы от этого класса
    }

    //5 - метод чтения цвета автомобиля
    public String getColor () {
        return color.toUpperCase();
    }

    //5 - метод присвоения автомобилю цвета
    public void setColor(String color) {
        switch (color) {
            case "green":
            case "red":
                this.color = color; // this - обращение к атрибуту этого класса
            default:
                break;
        }

    }

    //4 - метод чтения типа автомобиля
    public String getType () { return type; }

    //4 - метод присвоения автомобилю типа
    public void setType(String type) {
        this.type = type;
    }

    //3 - метод чтения года автомобиля
    public int getYear () { return year; }

    //3 - метод присвоения автомобилю года
    public void setYear (int year) {
        this.year = year;
    }

    public void startCar (Car car) {
        if (car.started == true) {
            System.out.println("Автомобиль уже заведен");
        } else {
            System.out.println("Автомобиль заведен");
            started = true;
        }

    }

    public void stopCar () {
        System.out.println("Автомобиль загрушен");
        started = false;
    }

    public static void countCar () {
        count++;
    }

}
