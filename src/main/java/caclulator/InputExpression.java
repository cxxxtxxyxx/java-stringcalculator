package caclulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputExpression {
    private final String expression;
    private final Delimeter delimeter;

    public InputExpression(String expression) {
        this.expression = expression;
        this.delimeter = new Delimeter(expression);
    }

    public Delimeter getDelimeter() {
        return delimeter;
    }

    @Override
    public String toString() {
        return expression;
    }
}
