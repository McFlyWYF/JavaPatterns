public class DecorateAnimalDemo {

    public static void main(String[] args) {

        Animal dog = new Dog();

        Animal writedog = new WriteDecorateAnimal(new Dog());
        Animal writecat = new WriteDecorateAnimal(new Cat());

        System.out.println("normal Animal");
        dog.kinds();

        System.out.println("\nWriteDog");
        writedog.kinds();

        System.out.println("\nWriteCat");
        writecat.kinds();
    }
}
