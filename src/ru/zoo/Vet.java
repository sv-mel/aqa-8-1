package ru.zoo;

public class Vet extends Human {

    public Vet() {
        profession = "Ветеринар";
    }

    @Override
    void lunch() {
        if (hungry) {
            System.out.println("Ветеринар пообедал");
            hungry = false;
        } else {
            System.out.println("Ветеринар ещё не голоден");
        }
    }
    @Override
    void makeBandage() {
        if (hurt) {
            System.out.println("Ветеринар наложил себе повязку");
            hurt = false;
        } else {
            System.out.println("Ветеринара не кусали");
        }
    }

    public void checkHealthy (Animal animal) {
        if (!animal.healthy) {
            animal.cage = "отправлен на карантин";
            System.out.println("животное " + animal.name + " " + animal.cage);
        }
        else {
            System.out.println("животное " + animal.name + " " + animal.cage);
        }
    }
}
