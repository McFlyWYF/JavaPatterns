public class JuiceFactory {

    public static Juice createJuice(String name) {

        Juice juice = null;

        if (name.equals("Apple")) {
            juice = new AppleJuice();
        } else if (name.equals("Orange")) {
            juice = new OrangeJuice();
        }

        return juice;
    }
}
