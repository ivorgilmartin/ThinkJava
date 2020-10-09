/**
 * Time class with efficient increment method.
 * @author ivorgilmartin
 */
public class Time {

    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
    }

    /**
     * Efficient version of increment method.
     */
    public void increment(double seconds) {
        double prev = (this.hour * 3600) + (this.minute * 60) + this.second;
        double total = prev + seconds;
        this.second = total % 60;
        this.hour = (int) (total / 3600);
        this.minute = (int) (total % 3600) / 60;

    }

}
