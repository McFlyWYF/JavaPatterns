import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> cricleMap = new HashMap<>();

    public static Shape getCricle(String color) {
        Cricle cricle = (Cricle) cricleMap.get(color);

        if (cricle == null) {
            cricle = new Cricle(color);
            cricleMap.put(color, cricle);
            System.out.println("Creating of color : " + color);
        }
        return cricle;
    }
}