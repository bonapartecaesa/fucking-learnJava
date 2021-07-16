/**
 * @Classname Demo
 * @Description
 * @Date 2021/7/16
 * @Created by Meng
 */
public class Demo {
    private Button button;
    private Checkbox checkbox;

    public  Demo(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        Demo app;
        GUIFactory factory;
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Demo(factory);
        app.paint();
    }
}
