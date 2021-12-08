package com.Denisenko.behavioral.command;

public class DeleteCommand implements Command {

    private AutoСonfigurator autoСonfigurator;

    public DeleteCommand(AutoСonfigurator autoСonfigurator) {
        this.autoСonfigurator = autoСonfigurator;
    }

    @Override
    public void execute() {
        autoСonfigurator.deleteOption();
    }
}
