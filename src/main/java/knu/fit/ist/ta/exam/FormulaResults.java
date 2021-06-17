package knu.fit.ist.ta.exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FormulaResults {

    public List<Double> args;
    public static List<Double> results;

    public FormulaResults() {
        args = new LinkedList<Double>();
        results = new LinkedList<Double>();
    }

    public FormulaResults(int length) {
        args = new LinkedList<Double>();
        results = new LinkedList<Double>();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            args.add((double) random.nextInt(100));
        }
    }

    public void SetArgs(double[] args) {
        this.args.clear();
        for (int i = 0; i < args.length; i++) {
            this.args.add(args[i]);
        }
    }

    public String Calculate() {
        results.clear();
        int length = args.size();

        for (int i = 0; i < length; i++) {
            results.add(Calculator.Calculate(args.get(i)));
        }

        return results.toString();
    }

    public String GetArgs() {
        return args.toString();
    }
}
