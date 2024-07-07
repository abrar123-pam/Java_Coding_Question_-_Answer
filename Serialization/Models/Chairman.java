package Serialization.Models;

import java.io.Serializable;

public class Chairman implements Serializable {
    private final static long serialVersionUID = 1L;

    private String name;
    private String stYear;
    private String endYear;

    Chairman(String name,String stYear, String endYear){
        this.name = name;
        this.stYear = stYear;
        this.endYear = endYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStYear() {
        return stYear;
    }

    public void setStYear(String stYear) {
        this.stYear = stYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }
}
