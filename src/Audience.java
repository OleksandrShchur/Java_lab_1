import java.util.Arrays;
import java.util.Objects;

public abstract class Audience{

    protected int number_of_audience;
    protected int floor;
    protected float square = 0;
    protected int max_count_of_stud = 1;
    protected boolean[] lessons = new boolean[] {false, false, false, false, false, false, false, false};
    protected int countOfTable = 0;
    protected int countOfChair = 0;
    protected boolean haveProjector;


    public int getNumber_of_audience() {
        return this.number_of_audience;
    }

    public int getFloor() {
        return this.floor;
    }

    public float getSquare() {
        return this.square;
    }

    public int getMax_count_of_stud() {
        return this.max_count_of_stud;
    }

    public boolean checkAvailable(int numberOfLesson) {
        if (numberOfLesson > 0 && numberOfLesson < 9) {
            return this.lessons[numberOfLesson];
        }
        return false;
    }

    public void takeAddLesson(int numberOfLesson) {
        if (!this.checkAvailable(numberOfLesson)) {
            this.lessons[numberOfLesson] = true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Audience)) return false;
        Audience audience = (Audience) o;
        return number_of_audience == audience.number_of_audience &&
                floor == audience.floor &&
                Float.compare(audience.square, square) == 0 &&
                max_count_of_stud == audience.max_count_of_stud &&
                countOfTable == audience.countOfTable &&
                countOfChair == audience.countOfChair &&
                haveProjector == audience.haveProjector &&
                Arrays.equals(lessons, audience.lessons);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(number_of_audience, floor, square, max_count_of_stud, countOfTable, countOfChair, haveProjector);
        result = 31 * result + Arrays.hashCode(lessons);
        return result;
    }

    @Override
    public String toString() {
        return "Audience{" +
                "number_of_audience=" + number_of_audience +
                ", floor=" + floor +
                ", square=" + square +
                ", max_count_of_stud=" + max_count_of_stud +
                ", lessons=" + Arrays.toString(lessons) +
                ", countOfTable=" + countOfTable +
                ", countOfChair=" + countOfChair +
                ", haveProjector=" + haveProjector +
                '}';
    }

    public abstract int findMaxCountOfStudents();

}
