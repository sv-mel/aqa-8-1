package ru.phone;

//1. Создайте класс Phone, который содержит переменные (атрибуты) number, model и weight
//2. Создайте три экземляра этого класса (три объекта)
//3. Выведите на консоль значения их переменных
//4. Добавить в класс Phone методы: receiveCall, имеет один параметр - имя звонящего. Выводит на консоль сообщение
// "Звонит {name}". Метод getNumber - возвращае номер телефона. Вызвать эти методы
//5. Добавить конструктор в класс Phone, который принимает на вход три парамера для инициализации переменных класса: number, model и weight
//6. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса: number, model
//7. Добавить конструктор без параметров
//8. Вызвать из конструктора с тремя параметрами конструктор с двумя параметрами
//9. Добавить перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер

import java.util.Random;

public class Phone {
    private String number;
    private String model;
    int weight;

    //обращение к методу с параметрами из кода без параметров, переиспользование кода
    public void receiveCall () {
        String [] names = {"Маша", "Толя", "Катя"};
        Random r = new Random();

        receiveCall(names[r.nextInt(0, names.length)]);
    }

    public void receiveCall (String name) {
        System.out.println("Звонит "+ name);
    }

    public String getNumber() {
        return number.trim();
    }

    public void setNumber(String number) {
        this.number = number;
    }
    //конструктор
    public Phone (String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone (String number, String model) {
//        this.number = number;
//        this.model = model;
//        weight = 500;
        this(number, model, 2000);
    }

    public Phone () {

    }


}
