public class JuiceFactoryDemo {

    public static void main(String[] args) {

        Juice appleJuice = JuiceFactory.createJuice("Apple");
        Juice orangeJuice = JuiceFactory.createJuice("Orange");

        appleJuice.getName();
        orangeJuice.getName();
    }
}
