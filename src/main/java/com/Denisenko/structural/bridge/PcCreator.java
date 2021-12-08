package com.Denisenko.structural.bridge;

public class PcCreator {
    public static void main(String[] args) {
        PC[] computers = {new HomePC(new SimplePcAssembler()),
                          new ServerPC(new ProfPcAssembler())};
        for (PC computer : computers) {
            computer.assemblyComp();
        }
    }
}
