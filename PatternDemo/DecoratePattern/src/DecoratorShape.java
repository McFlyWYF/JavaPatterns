public abstract class DecoratorShape implements Shape{

    protected Shape decoratorShape;

    public DecoratorShape(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    public void draw(){
        decoratorShape.draw();
    }
}
