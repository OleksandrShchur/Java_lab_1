public class ComputerAudienceBuilder implements Builder  {

    private ComputerAudience computerAudience;

    @Override
    public void setNumberOfAudience(int number) {
        this.computerAudience.number_of_audience = number;
    }

    @Override
    public void setFloor(int floor) {
        this.computerAudience.floor = floor;
    }


    @Override
    public void setSquare(float square) {
        this.computerAudience.square = square;
    }

    @Override
    public void setLessons(boolean[] lessons) {
        for (int i = 0; i < this.computerAudience.lessons.length && i < lessons.length; i += 2) {
            this.computerAudience.lessons[i] = lessons[i];
        }
    }

    @Override
    public void addTables(int tables) {
        if (tables <= this.computerAudience.max_count_of_stud && tables >= this.computerAudience.countOfComputer) {
            this.computerAudience.countOfTable += tables;
        }
    }

    @Override
    public void addChairs(int chairs) {
        if (this.computerAudience.countOfTable >= chairs) {
            this.computerAudience.countOfChair += chairs;
        }
    }

    @Override
    public void setProjector(boolean projector) {
        this.computerAudience.haveProjector = projector;
    }

    public void addComputer(int addComputer) {
        if (this.computerAudience.countOfTable > addComputer + this.computerAudience.countOfComputer
                && this.computerAudience.countOfChair > addComputer + this.computerAudience.countOfComputer) {
            this.computerAudience.countOfComputer += addComputer;
        }
    }

    public void setInteractiveBlackBoard(boolean blackBoard) {
        this.computerAudience.interactiveBlackBoard = blackBoard;
    }

    public ComputerAudience getComputerAudience() {
        return this.computerAudience;
    }
}
