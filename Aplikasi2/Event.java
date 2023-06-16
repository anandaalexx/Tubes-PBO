package Aplikasi2;

import java.util.Date;

public class Event extends Schedule{
    private String location;
    private Date startDate;
    private Date endDate;

    public Event(String title, Date date, String location, Date startDate, Date endDate) {
        setTitle(title);
        setDate(date);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
