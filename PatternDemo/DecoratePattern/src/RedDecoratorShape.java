
public class RedDecoratorShape extends DecoratorShape {

    public RedDecoratorShape(Shape decoratorShape){
        super(decoratorShape);
    }

    @Override
    public void draw(){
        decoratorShape.draw();
        setRed(decoratorShape);
    }

    public void setRed(Shape decorateShape){
        System.out.println("Color : Red");
    }
}
