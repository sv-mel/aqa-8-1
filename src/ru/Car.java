package ru;

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
    private String color;
    String type;
    int year;

    public String getColor () { return color; }

    public Car (String type, int year) {
        color = "green";
        this.type = type;
        this.year = year;
    }
}
