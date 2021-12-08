package com.Denisenko.creational.abstractFactory;

public class SkyscraperBuildingCompany implements BuildingСompany{
    @Override
    public Builder getBuilder() {
        return new BuilderSkyscraper();
    }

    @Override
    public Foreman getForeman() {
        return new ForemanSkyscraper();
    }
}
