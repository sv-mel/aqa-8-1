package ru;

public class Main {

    public static void main(String[] args)
    {
        Car car1 = new Car("type1", 1999);
        Car car2 = new Car("type2", 2012);

        System.out.println("Присвоение значений параметрам!");
        System.out.println(car1.type);
        System.out.println(car2.year);
        System.out.println(car2.getColor());
    }
}