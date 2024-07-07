package Serialization.Models;

import java.io.Serializable;

public class Teachers implements Serializable {
    private final static long serialVersionUID = 1L;

    private String name;
    private String subject;
    private float saalry;

    public Teachers(String name, String subject, float saalry) {
        this.name = name;
        this.subject = subject;
        this.saalry = saalry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getSaalry() {
        return saalry;
    }

    public void setSaalry(float saalry) {
        this.saalry = saalry;
    }
}
