package entities;

public class Student {
    public String name;
    public double nota1t;
    public double nota2t;
    public double nota3t;

    public double calculateAverage() {
        return nota1t + nota2t + nota3t;
    }

    public String passOrFailed() {
        if (calculateAverage() > 60) {
            return "PASS";
        } else return "FAILED";
    }

    public double missing() {
        if (passOrFailed() == "FAILED") {
            return Math.abs(calculateAverage() - 60);
        }
        return 0;
    }

    public String toString() {
        String result = "FINAL GRADE = " + String.format("%.2f", calculateAverage()) + "\n" +
                passOrFailed();
        if (passOrFailed().equals("FAILED")) {
            result += "\nMISSING " + String.format("%.2f", missing()) + " POINTS";
        }
        return result;
    }
}