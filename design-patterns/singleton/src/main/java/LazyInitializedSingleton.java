/**
 * @Classname LazyInitializedSingleton
 * @Description
 * @Date 2021/7/16
 * @Created by Meng
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
