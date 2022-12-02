package caclulator;

import java.util.Arrays;

public class StringCalculator {
    static int calculate(InputExpression expression) {
        Delimeter delimeter = expression.getDelimeter();
        System.out.println(delimeter.toString());
        delimeter.addDelimeter(expression);

        String delimeterFormat = delimeter.getDelimeterFormat();
        if(delimeter.containsCustom()) {
            return Arrays.stream(expression.toString().substring(4).split(delimeterFormat))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        return Arrays.stream(expression.toString().split(delimeterFormat))
                .mapToInt(Integer::parseInt)
                .sum();
    }


}
