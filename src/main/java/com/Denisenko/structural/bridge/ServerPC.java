package com.Denisenko.structural.bridge;

public class ServerPC extends PC{

    public ServerPC(PcAssembler collector) {
        super(collector);
    }

    @Override
    public void assemblyComp() {
        System.out.println("Server PC building in progress....");
        collector.createPC();
    }
}
