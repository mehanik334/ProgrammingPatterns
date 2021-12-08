package com.Denisenko.behavioral.memento;

import java.util.Date;

public class Modification {

    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public SaveState save() {
        return new SaveState(version);
    }

    public void load(SaveState saveState) {
        version = saveState.getVersion();
        date = saveState.getDate();
    }

    @Override
    public String toString() {
        return "Modification{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
