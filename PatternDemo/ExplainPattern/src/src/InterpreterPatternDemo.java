package src;

public class InterpreterPatternDemo {

    public static Expression getMaleExpression(){
        Expression Jhon = new TerminalExpression("Jhon");
        Expression James = new TerminalExpression("James");
        return new OrExpression(Jhon,James);
    }

    public static Expression getMarriedWomanExpression(){
        Expression Mick = new TerminalExpression("Mick");
        Expression married = new TerminalExpression("married");
        return new AddExpression(Mick,married);
    }

    public static void main(String[] args){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Is Jhon a Male? " + isMale.interpret("Jhon"));
        System.out.println("Mick is a married woman? " + isMarriedWoman.interpret("Mick married"));
    }
}
