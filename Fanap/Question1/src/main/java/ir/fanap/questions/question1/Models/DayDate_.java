
package ir.fanap.questions.question1.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class DayDate_ {

    @SerializedName("dateTimeLong")
    @Expose
    private Long dateTimeLong;
    @SerializedName("year")
    @Expose
    private Long year;
    @SerializedName("month")
    @Expose
    private Long month;
    @SerializedName("day")
    @Expose
    private Long day;
    @SerializedName("valid")
    @Expose
    private Boolean valid;
    @SerializedName("date")
    @Expose
    private Long date;

    public Long getDateTimeLong() {
        return dateTimeLong;
    }

    public void setDateTimeLong(Long dateTimeLong) {
        this.dateTimeLong = dateTimeLong;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getMonth() {
        return month;
    }

    public void setMonth(Long month) {
        this.month = month;
    }

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayDate_ dayDate_ = (DayDate_) o;
        return Objects.equals(dateTimeLong, dayDate_.dateTimeLong) &&
                Objects.equals(year, dayDate_.year) &&
                Objects.equals(month, dayDate_.month) &&
                Objects.equals(day, dayDate_.day) &&
                Objects.equals(valid, dayDate_.valid) &&
                Objects.equals(date, dayDate_.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTimeLong, year, month, day, valid, date);
    }

    @Override
    public String toString() {
        return "DayDate_{" +
                "dateTimeLong=" + dateTimeLong +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", valid=" + valid +
                ", date=" + date +
                '}';
    }
}
