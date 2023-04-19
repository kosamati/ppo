package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

public class Ticket {
    private Boolean isChecked;
    private ZonedDateTime buyTime;
    private ZonedDateTime checkTime;
    private ZonedDateTime endTime;

    public Ticket(Boolean isChecked, ZonedDateTime buyTime, ZonedDateTime checkTime, ZonedDateTime endTime) {
        this.isChecked = isChecked;
        this.buyTime = buyTime;
        this.checkTime = checkTime;
        this.endTime = endTime;
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }

    public ZonedDateTime getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(ZonedDateTime buyTime) {
        this.buyTime = buyTime;
    }

    public ZonedDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(ZonedDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }
}
