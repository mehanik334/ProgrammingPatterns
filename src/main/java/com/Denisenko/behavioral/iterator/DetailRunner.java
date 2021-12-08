package com.Denisenko.behavioral.iterator;

public class DetailRunner {
    public static void main(String[] args) {
        String[] subDetail = {"transistor","cash","capacitor"};
        Detail detail = new Detail("CPU",subDetail);

        Iterator iterator = detail.getIterator();
        System.out.println("Detail: " + detail.getName());
        System.out.println("Subdetail:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
