/**
 * @Classname WindowsDialog
 * @Description
 * @Date 2021/7/16
 * @Created by bignox
 */
public class WindowsDialog extends  Dialog{
    public Button createButton() {
        return new WindowsButton();
    }
}
