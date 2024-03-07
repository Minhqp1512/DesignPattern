package CreationalPattern.AbstractFactoryPattern;
import CreationalPattern.FactoryMethodPattern.Animal;

public abstract class AbstractFactory {
      abstract Animal getPet(String pet);
      abstract Human getHuman(String human);

}
