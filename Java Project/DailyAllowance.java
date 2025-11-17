interface AllowanceCalculator {
    double calculate(double myAllowance);
}
class MyOwnAllowance implements AllowanceCalculator {
    @Override
    public double calculate(double myAllowance) {
        return myAllowance * 54;
    }
}
interface SemesterAllowance {
    double calculate(double initialAllowance, int semesters);
}

class AllowanceTracker implements AllowanceCalculator, SemesterAllowance {
    @Override
    public double calculate(double myAllowance) {
        return myAllowance * 54;
    }
    
    @Override
    public double calculate(double initialAllowance, int semesters) {
        for (int i = 2; i <= semesters; i += 2) initialAllowance *= 1.03;
        return initialAllowance * 18 * 6;
    }
}

public class DailyAllowance {
    public static void main(String[] args) {
        AllowanceTracker allowance = new AllowanceTracker();
        System.out.println("Total daily allowance until April 30: $" + allowance.calculate(250.0));
        System.out.println("Total allowance for 6 semesters: $" + allowance.calculate(250.0 * 6 * 18, 6));
    }
}
