package src;

public class OrExpression implements Expression {

    private Expression epr1 = null;
    private Expression epr2 = null;

    public OrExpression(Expression epr1,Expression epr2){
        this.epr1 = epr1;
        this.epr2 = epr2;
    }

    @Override
    public boolean interpret(String context) {
        return epr1.interpret(context) || epr2.interpret(context);
    }
}
