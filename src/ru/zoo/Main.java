package ru.zoo;

public class Main {

    public static void main(String[] args) {

        Cats lion = new Cats("Кузя");
        Cats tiger = new Cats("Жора");
        Hypo hypo = new Hypo("Дося");
        Squirrels squirrelS = new Squirrels("Стрелка");
        Squirrels squirrelL = new Squirrels("Ловкач");
        System.out.println(lion.name + " " + tiger.name + " " + hypo.name + " " + squirrelS.name + " " + squirrelL.name);

        hypo.healthy = true;
        Vet vet = new Vet();
        vet.checkHealthy(hypo);

        vet.lunch();

        tiger.healthy = false;
        vet.checkHealthy(tiger);

        vet.hungry = true;
        vet.lunch();

        lion.bite(vet);
        vet.makeBandage();
        squirrelS.goOut();
        System.out.println("День в зоопарке завершен");
    }
}
