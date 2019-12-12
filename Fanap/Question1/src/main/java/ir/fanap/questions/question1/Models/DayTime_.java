
package ir.fanap.questions.question1.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class DayTime_ {

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
        DayTime_ dayTime_ = (DayTime_) o;
        return Objects.equals(dayTime, dayTime_.dayTime) &&
                Objects.equals(hour, dayTime_.hour) &&
                Objects.equals(minute, dayTime_.minute) &&
                Objects.equals(second, dayTime_.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayTime, hour, minute, second);
    }

    @Override
    public String toString() {
        return "DayTime_{" +
                "dayTime=" + dayTime +
                ", hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
