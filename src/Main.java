import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Daugintojas daug = new Daugintojas();

        List<String> firstErrors = new ArrayList<>();
        Thread t1 = new WorkThread(daug, 100, firstErrors);
        t1.start();

        List<String> secondErrors = new ArrayList<>();
        Thread t2 = new WorkThread(daug, 100, secondErrors);
        t2.start();

        t1.join();
        t2.join();

        if(firstErrors.isEmpty()) {
            System.out.println("First thread has not get any errors");
        } else {
            System.out.println("First thread gotten a few errors: " + firstErrors.size());

            for(var error : firstErrors) {
                System.out.println(error);
            }
        }

        if(secondErrors.isEmpty()) {
            System.out.println("Second thread has not get any errors");
        } else {
            System.out.println("Second thread gotten a few errors: " + secondErrors.size());

            for(var error : secondErrors) {
                System.out.println(error);
            }
        }
    }
}

