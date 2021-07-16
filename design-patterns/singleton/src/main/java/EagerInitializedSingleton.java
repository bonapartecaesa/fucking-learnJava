/**
 * @Classname EagerInitializedSingleton
 * @Description
 * @Date 2021/7/16
 * @Created by Meng
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
