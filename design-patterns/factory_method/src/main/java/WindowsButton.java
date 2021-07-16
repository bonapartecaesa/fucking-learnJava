/**
 * @Classname WindowsButton
 * @Description
 * @Date 2021/7/16
 * @Created by Meng
 */
public class WindowsButton implements  Button{
    public void render() {
        System.out.println("WindowsButton");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
