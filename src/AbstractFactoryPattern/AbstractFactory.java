package AbstractFactoryPattern;
import FactoryMethodPattern.Animal;
import jdk.jshell.DeclarationSnippet;

import java.time.Period;

public abstract class AbstractFactory {
      abstract Animal getPet(String pet);
      abstract Human getHuman(String human);

}
