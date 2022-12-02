package caclulator;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        InputExpression inputExpression = new InputExpression(input);
        System.out.println(StringCalculator.calculate(inputExpression));
    }
}
