public class Main {
    public static void main(String[] args) throws InterruptedException {
        Experiment test = new Experiment(0);
        Experiment expected = new Experiment(0);

        for(int i = 0; i < 10000; i++) {
            expected.grow();
            expected.grow();
        }

        Thread t1 = new GrowThread(test, 10000);
        t1.start();

        Thread t2 = new GrowThread(test, 10000);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Got: " + test.getNumber() + " Expected: " + expected.getNumber());
    }
}

