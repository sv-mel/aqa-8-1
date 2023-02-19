package ru.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone ("1111111", "Samsung", 250);
        Phone phone2 = new Phone ("2222222", "Nokia");
        Phone phone3 = new Phone ();

        System.out.println(phone2.getNumber());
        phone1.setNumber(" +7 9091231212 ");

        System.out.println(phone1.getNumber());

        phone1.receiveCall();
        phone1.receiveCall("Вася");
        System.out.println(phone2.getNumber() + " " + phone2.weight);

        phone3.weight = 100;
        System.out.println(phone3.weight);
    }
}
