package Aplikasi;

import java.util.Date;

public class Schedule {
    private String title;
    private String prioritas;
    private Date tanggal;

    public Schedule(String title, String prioritas, Date tanggal) {
        this.title = title;
        this.prioritas = prioritas;
        this.tanggal = tanggal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrioritas(){
        return prioritas;
    }

    public void setPrioritas(String prioritas){
        this.prioritas = prioritas;
    }

    public Date getTanggal(){
        return tanggal;
    }

    public void setTanggal(Date tanggal){
        this.tanggal = tanggal;
    }
}
