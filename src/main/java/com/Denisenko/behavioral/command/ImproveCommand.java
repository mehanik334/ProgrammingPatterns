package com.Denisenko.behavioral.command;

public class ImproveCommand implements Command {

    private AutoСonfigurator autoСonfigurator;

    public ImproveCommand(AutoСonfigurator autoСonfigurator) {
        this.autoСonfigurator = autoСonfigurator;
    }

    @Override
    public void execute() {
        autoСonfigurator.improveOption();
    }
}
