package SingletonPattern;

public class StaticBlockSingleton {
    //1 private static
    private static StaticBlockSingleton instance;
    //1 constructor
    private StaticBlockSingleton(){}

    static {
        try{
            instance= new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Eception occured in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
