//使用 NameRepository 来获取迭代器，并打印名字。
public class ItertorPatternDemo {

    public static void main(String[] args) {

        NameRespository nameRespository = new NameRespository();

        for (Iterator iterator = nameRespository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
