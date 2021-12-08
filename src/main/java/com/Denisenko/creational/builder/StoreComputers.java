package com.Denisenko.creational.builder;

public class StoreComputers {
    public static void main(String[] args) {
        SellerComputer sellerComputer = new SellerComputer(new HomeComputer());
        Computer computer = sellerComputer.buildComputer();
        System.out.println(computer);
    }
}
