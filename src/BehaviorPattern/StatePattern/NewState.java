package BehaviorPattern.StatePattern;

public class NewState implements State{
    @Override
    public void handleRequest() {
        System.out.println("create a new document");
    }
}
