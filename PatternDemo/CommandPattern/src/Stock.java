//创建请求类
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("name:" + name + " quantity " + quantity + " buy");
    }

    public void sell() {
        System.out.println("name:" + name + " quantity " + quantity + " sold");
    }
}
