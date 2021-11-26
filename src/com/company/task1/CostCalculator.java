package com.company.task1;

public class CostCalculator implements Visitor {
    @Override
    public void visitGlass(Glass glass) {
        String name = glass.getName();
        double thickness = glass.getThickness();
        double length = glass.getLenght();
        double result = 0;

        if (thickness == 1) {
            result = (length / 100) * 2;
        } else if (thickness == 2) {
            result = (length / 100) * 1.2;
        } else if (thickness == 3) {
            result = (length / 100) * 0.7;
        } else {
            System.err.println("Invalid thickness!");
        }

        printResult(name, result);
    }

    @Override
    public void visitFurniture(Furniture furniture) {
        String name = furniture.getName();
        double weight = furniture.getWeight();
        double result = (weight / 20) * 5;

        printResult(name, result);
    }

    @Override
    public void visitElectronic(Electronic electronic) {
        String name = electronic.getName();
        double weight = electronic.getWeight();
        boolean fragile = electronic.getFragile();
        double result = 0;

        if (fragile) {
            result = (weight / 10) * 5;
        } else {
            result = (weight / 15) * 5;
        }

        printResult(name, result);
    }

    public void calculateCost(HouseholdItem householdItem) {
        householdItem.accept(this);
    }

    private void printResult(String name, double result) {
        System.out.println("Total Cost for " + name + " is: " + result + " Euros");
    }
}
