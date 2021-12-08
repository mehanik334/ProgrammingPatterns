package com.Denisenko.structural.bridge;

public class HomePC extends PC{

    public HomePC(PcAssembler collector) {
        super(collector);
    }

    @Override
    public void assemblyComp() {
        System.out.println("HomePC building in progress");
        collector.createPC();
    }
}
