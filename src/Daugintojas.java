/**
 * Daugintojas multiplies two numbers
 */
public class Daugintojas {
    private  int aNumber;
    private int bNumber;

    public Daugintojas() {
        this.aNumber = 0;
        this.bNumber = 0;
    }

    /**
     * Saves two number for further processing
     * @param  aNumber  first number
     * @param  bNumber second number
     */
    public void put(int aNumber, int bNumber) {
        this.aNumber = aNumber;
        this.bNumber = bNumber;
    }

    /**
     * Multiplies two saved numbers and returns result
     *
     * @return      Result
     */
    public int process() {
        return aNumber * bNumber;
    }
}
