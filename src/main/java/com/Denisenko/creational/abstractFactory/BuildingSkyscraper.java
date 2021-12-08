package com.Denisenko.creational.abstractFactory;

public class BuildingSkyscraper {
    public static void main(String[] args) {
        BuildingСompany buildingСompany = new SkyscraperBuildingCompany();
        Builder builder = buildingСompany.getBuilder();
        Foreman foreman = buildingСompany.getForeman();

        System.out.println("Building skyscraper:");
        builder.build();
        foreman.manageBuilding();
    }
}
