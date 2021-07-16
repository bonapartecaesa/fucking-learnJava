/**
 * @Classname factory
 * @Description
 * @Date 2021/7/16
 * @Created by bignox
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();

}
