package com.Denisenko.structural.bridge;

public abstract class PC {

    protected PcAssembler collector;

    protected PC(PcAssembler collector) {
        this.collector = collector;
    }

    public abstract void assemblyComp();
}
