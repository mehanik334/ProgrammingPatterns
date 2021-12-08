package com.Denisenko.behavioral.memento;

import java.util.Date;

public class SaveState {

    private final String version;
    private final Date date;

    public SaveState(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
