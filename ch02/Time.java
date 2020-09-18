public class Time {

    public static void main(String[] args) {
        System.out.println("Starting with a small working program.");

        int hour = 16;
        int minute = 4;
        int second = 30;

        int secondsSinceMidnight = (hour*60*60) + (minute*60) + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int secondsInDay = 24*60*60;
        int remainingSeconds = secondsInDay - secondsSinceMidnight;
        System.out.println("Remaining seconds: " + remainingSeconds);

        double percentagePassed = ((double)secondsSinceMidnight/secondsInDay)*100;
        System.out.println("Percentage passed: " + percentagePassed);

        int temp = secondsSinceMidnight;
        hour = 16;
        minute = 24;
        second = 31;
        secondsSinceMidnight = (hour*60*60) + (minute*60) + second;
        int timeElapsed = secondsSinceMidnight - temp;
        System.out.println("Time elapsed: " + timeElapsed);


    }

}
