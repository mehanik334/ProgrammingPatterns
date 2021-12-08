package com.Denisenko.behavioral.command;

public class Manager {

    private Command add;
    private Command improve;
    private Command show;
    private Command delete;

    public Manager(Command add, Command improve, Command show, Command delete) {
        this.add = add;
        this.improve = improve;
        this.show = show;
        this.delete = delete;
    }

    public void addOption() {
        add.execute();
    }

    public void improveOption() {
        improve.execute();
    }

    public void showOption() {
        show.execute();
    }

    public void deleteOption() {
        delete.execute();
    }
}
