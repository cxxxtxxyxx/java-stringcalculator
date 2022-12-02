package caclulator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Delimeter {

    private static final int DEFAULT_DELIMETER_SIZE = 2;
    private final List<String> delimeters;
    public Delimeter(String expression) {
        delimeters = new ArrayList<String>(Arrays.asList(",", ":"));
        if (expression.contains("//")) {
            delimeters.add(Character.toString(expression.charAt(2)));
        }
    }


    public String getDelimeterFormat() {
        return delimeters.stream().reduce((prev, curr) -> {
            prev += "|" + curr;
            return prev;
        }).get();
    }

    public void addDelimeter(InputExpression expression) {
        if (expression.toString().contains("//")) {
            delimeters.add(Character.toString(expression.toString().charAt(2)));
        }
    }

    public boolean containsCustom() {
        return delimeters.size() == DEFAULT_DELIMETER_SIZE;
    }
}
