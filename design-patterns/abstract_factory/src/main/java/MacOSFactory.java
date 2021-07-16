/**
 * @Classname MacOSFactory
 * @Description
 * @Date 2021/7/16
 * @Created by Meng
 */
public class MacOSFactory implements GUIFactory{
    public Button createButton() {
        return new MacOSButton();
    }

    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
