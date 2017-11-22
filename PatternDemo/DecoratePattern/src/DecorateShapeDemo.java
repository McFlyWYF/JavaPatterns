public class DecorateShapeDemo {

    public static void main(String[] args){

        Shape cricle = new Cricle();

        Shape redCricle = new RedDecoratorShape(new Cricle());
        Shape redRectangle = new RedDecoratorShape(new Rectangle());

        System.out.println("normal Shape:");
        cricle.draw();

        System.out.println("\nCricle of Red:");
        redCricle.draw();

        System.out.println("\nRectangle of Red:");
        redRectangle.draw();

    }
}
