package BehaviorPattern.ChainOfResponsibilityPattern;

public enum LogLevel {
    NONE(0), INFO(1), DEBUG(2),ERROR(8), WARNING(4),FATAL(16),ALL(32);
    private int level;
    private LogLevel(int level){
        this.level=level;
    }
    public int getLevel(){
        return level;
    }
}
