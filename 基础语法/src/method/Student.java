package method;

public class    Student {
    String name;
    int javaScore;
    int sqlScore;

    public int getSum() {
        return (javaScore + sqlScore);
    }

    public double getAvg() {
        return getSum() / 2.0;
    }
}
