package CreationalPattern.FactoryMethodPattern;

public class AnimalFactory {
    public Animal getAnimal(String animal){
        if(animal.equals(null)) return null;
        if(animal.equalsIgnoreCase("con cho")){
            return new Dog();
        }else if(animal.equalsIgnoreCase("con meo")){
            return new Cat();
        }else if(animal.equalsIgnoreCase("con lon")){
            return new Pig();
        }
        return null;
    }
}
