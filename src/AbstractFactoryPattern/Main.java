package AbstractFactoryPattern;

import FactoryMethodPattern.Animal;

public class Main {
    public static void main(String[] args) {
        AbstractFactory humanFactory = FactoryProducer.getFactory("Human");
        AbstractFactory petFactory = FactoryProducer.getFactory("Pet");

        Human human = humanFactory.getHuman("Child");
        human.feedPet();

        Animal pet = petFactory.getPet("Dog");
        pet.eat();

        Human human2 = humanFactory.getHuman("Elder");
        human2.feedPet();

        Animal pet2 = petFactory.getPet("Pig");
        pet2.eat();

        Human human1= humanFactory.getHuman("Adult");
        human1.feedPet();
    }
}
