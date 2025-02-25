class GrowThread extends Thread {
    private int count;
    private Experiment test;

    public GrowThread(Experiment test, int count) {
        this.count = count;
        this.test = test;
    }

    public void run() {
        for (int j = 0; j < count; ++j) {
            test.grow();
        }
    }
}
