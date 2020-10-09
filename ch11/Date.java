/**
 * Date object type.
 * @author ivorgilmartin
 */
public class Date {

    private int year;
    private int month;
    private int day;

    public Date() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public Date(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return String.format("%02d-%02d-%04d\n", this.day, this.month, this.year);
    }

    public boolean equals(Date that) {
        return this.day == that.day && this.month == that.month && this.year == that.year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static void main(String[] args) {

        Date birthday = new Date(1, 6, 1882);
        System.out.println(birthday);

    }

}
