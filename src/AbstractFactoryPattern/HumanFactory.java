package AbstractFactoryPattern;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.Human;
import FactoryMethodPattern.Animal;

public class HumanFactory extends AbstractFactory {
    @Override
    Human getHuman(String human){
        if (human.equals(null)) return null;

        if (human.equalsIgnoreCase("chILd")) {
            return new Child();
        } else if (human.equalsIgnoreCase("adult")) {
            return new Adult();
        } else if (human.equalsIgnoreCase("elDeR")) {
            return new Elder();
        }
        return null;
    }
    @Override
    Animal getPet(String pet){
        return  null;
    }
}
