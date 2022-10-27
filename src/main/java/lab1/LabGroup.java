package lab1;

public class LabGroup {
    private int count;
    private int[] grades;

    public LabGroup setCount(int count) {
        this.count = count;

        return this;
    }

    public LabGroup setGrades(int[] grades) {
        this.grades = grades;

        return this;
    }

    public double getAverage() {
        double sum = 0;

        for (int grade : this.grades) {
            sum += grade;
        }

        return sum / this.count;
    }

    public int[] getRandomGrades() {
        int[] grades = new int[this.count];

        for (int i = 0; i < this.count; i++) {
            grades[i] = (int) (Math.random() * 100);
        }

        return grades;
    }
}
