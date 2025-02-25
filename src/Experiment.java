public class Experiment {
    private int number;

    public Experiment(int number) {
        this.number = number;
    }

    public synchronized void grow() {
        number++;
    }

    /*
    public void grow() {
        number++;
    }
    */

    public int getNumber() {
        return number;
    }
}
