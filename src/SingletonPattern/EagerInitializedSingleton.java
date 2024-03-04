package SingletonPattern;

public class EagerInitializedSingleton {
    //private static để đảm bảo rằng nó là duy nhất và chỉ được tạo ra trong class đó thôi
    private static  final EagerInitializedSingleton instance= new EagerInitializedSingleton();
    //Private Constructor của class để đảm bảo rằng class khác không thể truy cập vào constructor và tạo ra instance mới
    private EagerInitializedSingleton(){}
    //Để các class khác có thể truy cập vào instance của class này thì chúng ta cần tạo một Public static method trả về giá trị instance trên
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
