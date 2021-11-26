package com.company.task1;

public class PackingCalculator implements Visitor {
    @Override
    public void visitGlass(Glass glass) {
        String name = glass.getName();
        int length = glass.getLenght() + 1;
        int width = glass.getWidth() + 1;
        int height = glass.getHeight() + 1;

        System.out.println(name + ":");
        System.out.print("Should be wrapped with bubble wraps and packed in a box with dimension: ");
        System.out.println(length + "x" + width + "x" + height);
    }

    @Override
    public void visitFurniture(Furniture furniture) {
        String name = furniture.getName();
        int length = furniture.getLenght();
        int width = furniture.getWidth();

        System.out.println(name + ":");
        System.out.print("Should be covered with waterproof covers with area of: ");
        System.out.println(length + "x" + width);
    }

    @Override
    public void visitElectronic(Electronic electronic) {
        String name = electronic.getName();
        int length = electronic.getLenght() + 1;
        int width = electronic.getWidth() + 1;
        int height = electronic.getHeight() + 1;

        System.out.println(name + ":");
        System.out.print("Should be covered with Polyethylene foam film and packed in a box with dimension: ");
        System.out.println(length + "x" + width + "x" + height);
    }

    public void calculatePacking(HouseholdItem householdItem) {
        householdItem.accept(this);
    }
}
