
package ir.fanap.questions.question1.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class DayTime {

    @SerializedName("dayTime")
    @Expose
    private Long dayTime;
    @SerializedName("hour")
    @Expose
    private Long hour;
    @SerializedName("minute")
    @Expose
    private Long minute;
    @SerializedName("second")
    @Expose
    private Long second;

    public Long getDayTime() {
        return dayTime;
    }

    public void setDayTime(Long dayTime) {
        this.dayTime = dayTime;
    }

    public Long getHour() {
        return hour;
    }

    public void setHour(Long hour) {
        this.hour = hour;
    }

    public Long getMinute() {
        return minute;
    }

    public void setMinute(Long minute) {
        this.minute = minute;
    }

    public Long getSecond() {
        return second;
    }

    public void setSecond(Long second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayTime dayTime1 = (DayTime) o;
        return Objects.equals(dayTime, dayTime1.dayTime) &&
                Objects.equals(hour, dayTime1.hour) &&
                Objects.equals(minute, dayTime1.minute) &&
                Objects.equals(second, dayTime1.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayTime, hour, minute, second);
    }

    @Override
    public String toString() {
        return "DayTime{" +
                "dayTime=" + dayTime +
                ", hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
