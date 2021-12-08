package com.Denisenko.creational.factoryMethod;

public class ManageCompany {
    public static void main(String[] args) {
        DirectorFactory directorFactory = createDirectorByManage("sales");
        Director director = directorFactory.createDirector();

        director.manage();
    }

    static DirectorFactory createDirectorByManage(String manage) {
        if(manage.equalsIgnoreCase("commercial")) {
            return new CommercialDirectorFactory();
        }else if (manage.equalsIgnoreCase("sales")) {
            return new SalesDirectorFactory();
        }else {
            throw new RuntimeException();
        }
    }
}
