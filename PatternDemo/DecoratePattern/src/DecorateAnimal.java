public class DecorateAnimal implements Animal{

    protected Animal decorateAnimal;

    public DecorateAnimal(Animal decorateAnimal){
        this.decorateAnimal = decorateAnimal;
    }

    @Override
    public void kinds() {
        decorateAnimal.kinds();
    }
}
