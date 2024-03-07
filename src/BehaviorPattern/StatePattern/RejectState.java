package BehaviorPattern.StatePattern;

public class RejectState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Rejected");
    }
}
