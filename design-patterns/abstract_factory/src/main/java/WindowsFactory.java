/**
 * @Classname WindowsFactory
 * @Description
 * @Date 2021/7/16
 * @Created by Meng
 */
public class WindowsFactory implements  GUIFactory{
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
