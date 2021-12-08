package com.Denisenko.behavioral.command;

public class AutoConfiguratorRunner {
    public static void main(String[] args) {
        AutoСonfigurator autoСonfigurator = new AutoСonfigurator();
        Manager manager = new Manager(new AddCommand(autoСonfigurator),
                                      new ImproveCommand(autoСonfigurator),
                                      new ShowCommand(autoСonfigurator),
                                      new DeleteCommand(autoСonfigurator));

        manager.addOption();
        manager.improveOption();
        manager.showOption();
        manager.deleteOption();
    }
}
