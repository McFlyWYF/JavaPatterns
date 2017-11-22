public class WriteDecorateAnimal extends DecorateAnimal{


    public WriteDecorateAnimal(Animal decorateAnimal) {
        super(decorateAnimal);
    }

    public void kinds(){
        decorateAnimal.kinds();
        SetColor(decorateAnimal);
    }

    public void SetColor(Animal decorateAnimal){
        System.out.println("Color: Write");
    }
}
