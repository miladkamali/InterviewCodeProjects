
package ir.fanap.questions.question1.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class CreationDateTime {

    @SerializedName("dateTimeLong")
    @Expose
    private Long dateTimeLong;
    @SerializedName("dayDate")
    @Expose
    private DayDate dayDate;
    @SerializedName("dayTime")
    @Expose
    private DayTime dayTime;
    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("null")
    @Expose
    private Boolean _null;

    public Long getDateTimeLong() {
        return dateTimeLong;
    }

    public void setDateTimeLong(Long dateTimeLong) {
        this.dateTimeLong = dateTimeLong;
    }

    public DayDate getDayDate() {
        return dayDate;
    }

    public void setDayDate(DayDate dayDate) {
        this.dayDate = dayDate;
    }

    public DayTime getDayTime() {
        return dayTime;
    }

    public void setDayTime(DayTime dayTime) {
        this.dayTime = dayTime;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Boolean getNull() {
        return _null;
    }

    public void setNull(Boolean _null) {
        this._null = _null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreationDateTime that = (CreationDateTime) o;
        return Objects.equals(dateTimeLong, that.dateTimeLong) &&
                Objects.equals(dayDate, that.dayDate) &&
                Objects.equals(dayTime, that.dayTime) &&
                Objects.equals(time, that.time) &&
                Objects.equals(_null, that._null);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTimeLong, dayDate, dayTime, time, _null);
    }

    @Override
    public String toString() {
        return "CreationDateTime{" +
                "dateTimeLong=" + dateTimeLong +
                ", dayDate=" + dayDate +
                ", dayTime=" + dayTime +
                ", time=" + time +
                ", _null=" + _null +
                '}';
    }
}
