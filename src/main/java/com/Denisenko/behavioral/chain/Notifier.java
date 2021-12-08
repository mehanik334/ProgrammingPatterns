package com.Denisenko.behavioral.chain;

public abstract class Notifier {
    private int priority;
    private Notifier next;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNext(Notifier next) {
        this.next = next;
    }

    public void notifyUser(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (next != null) {
            next.notifyUser(message, level);
        }
    }

    public abstract void write(String message);
}
