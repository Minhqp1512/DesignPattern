package AbstractFactoryPattern;

import FactoryMethodPattern.Animal;
import FactoryMethodPattern.Cat;
import FactoryMethodPattern.Dog;
import FactoryMethodPattern.Pig;

public class PetFactory extends AbstractFactory{
    @Override
    public Animal getPet(String pet) {
        if(pet.equals(null)) return null;

        if(pet.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if(pet.equalsIgnoreCase("Cat")) {
            return new Cat();
        } else if(pet.equalsIgnoreCase("Pig")) {
            return new Pig();
        }
        return null;
    }

    @Override
    Human getHuman(String human) {
        return null;
    }
}
