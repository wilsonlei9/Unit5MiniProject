public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Constructor creates a new instance of Time
     * @param h represents hours
     * @param m represents minutes
     * @param s represents seconds
     */
    public Time(int h, int m, int s)
    {
        hours = h;
        minutes = m;
        seconds = s;
    }

    /**
     * Adds 1 second to a time object. Minutes and hours are changed appropriately based on the seconds.
     */
    public void tick()
    {
        seconds++;
        if(seconds == 60)
        {
            minutes++;
            seconds = 0;
        }
        if(minutes == 60)
        {
            hours++;
            minutes = 0;
            seconds = 0;
        }
        if(hours == 24)
        {
            hours = 0;
        }
    }

    /**
     * Adds the amount of time in another Time object to the current Time object
     * @param time represents another time object
     */
    public void add(Time time)
    {
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours += time.hours;
        if (seconds >= 60)
        {
            seconds -= 60;
            this.minutes++;
        }
        if(minutes >= 60)
        {
            minutes -= 60;
            this.hours++;
        }
        if (hours > 24)
        {
            hours -= 24;
        }
        if (hours == 24)
        {
            seconds = 0;
            minutes = 0;
            hours = 0;
        }
    }

    /**
     * Returns a string with the information about the time
     * @return returns a string with the time formatted
     */
    public String toString()
    {
        String str = hours + ":" + minutes + ":" + seconds;
        if (seconds < 10)
        {
            str = hours + ":" + minutes + ":" + "0" + seconds;
        }
        if (minutes < 10)
        {
            str = hours + ":" + "0" + minutes + ":" + seconds;
        }
        if (hours < 10)
        {
            str = "0" + hours + ":" + minutes + ":" + seconds;
        }
        return str;
    }
}
