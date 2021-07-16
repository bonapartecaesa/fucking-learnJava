/**
 * @Classname BillPughSingleton
 * @Description
 * @Date 2021/7/16
 * @Created by Meng
 */
public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}

