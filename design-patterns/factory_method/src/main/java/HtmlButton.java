/**
 * @Classname HtmlButton
 * @Description
 * @Date 2021/7/16
 * @Created by Meng
 */
public class  HtmlButton implements Button{
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
