import java.util.List;
import java.util.Random;

class WorkThread extends Thread {
    private Daugintojas daugintojas;
    private Random randomGenerator;
    private int iterations;
    private List<String> errors;

    public WorkThread(Daugintojas daugintojas, int iterations, List<String> errors) {
        this.daugintojas = daugintojas;
        this.randomGenerator = new Random();
        this.iterations = iterations;
        this.errors = errors;
    }

    public void run() {
        for (int j = 0; j < iterations; ++j) {
            int randomNumberA = randomGenerator.nextInt(50);
            int randomNumberB = randomGenerator.nextInt(50);

            int expected = randomNumberA * randomNumberB;
            int value = 0;

            // BEGIN

            // synchronized (daugintojas) {
                daugintojas.put(randomNumberA, randomNumberB);
                value = daugintojas.process();
            // }

            // END

            if(expected != value) {
                errors.add("Expected " + expected + " but got " + value);
            }
        }
    }
}
