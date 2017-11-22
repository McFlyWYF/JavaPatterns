public class FlyweightPatternDemo {

    private static final String colors[] = {"Red", "green", "Blue", "Black", "White"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Cricle cricle = (Cricle) ShapeFactory.getCricle(getRandomColor());

            cricle.setX(getRandomX());
            cricle.setY(getRandomY());
            cricle.setRadius(100);
            cricle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
