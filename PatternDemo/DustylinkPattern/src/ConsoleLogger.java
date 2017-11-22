//创建扩展该记录器类的实体类
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Consale Logger: " + message);
    }
}
