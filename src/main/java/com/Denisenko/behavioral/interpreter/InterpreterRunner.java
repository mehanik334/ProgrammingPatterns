package com.Denisenko.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isAlgebra = getMathExpression();
        Expression isHighMath = getHighMathExpression();

        System.out.println("Does student know Algebra: " + isAlgebra.interpret("Algebra"));
        System.out.println("Does student know High math: " + isHighMath.interpret("High math"));
    }

    public static Expression getMathExpression() {
        Expression algebra = new TerminalExpression("Algebra");
        Expression geometry = new TerminalExpression("Geometry");
        return new OrExpression(algebra,geometry);
    }

    public static Expression getHighMathExpression() {
        Expression algebra = new TerminalExpression("Algebra");
        Expression highMath = new TerminalExpression("High math");
        return new AndExpression(algebra,highMath);
    }
}
