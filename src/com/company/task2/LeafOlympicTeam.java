package com.company.task2;

public class LeafOlympicTeam implements OlympicTeam {
    public String name;
    public int numberOfAthletes;
    public int numberOfGoldMedals;

    public LeafOlympicTeam(String name, int numberOfAthletes, int numberOfGoldMedals) {
        this.name = name;
        this.numberOfAthletes = numberOfAthletes;
        this.numberOfGoldMedals = numberOfGoldMedals;
    }

    @Override
    public void getAthletes() {
        String response = "     Team: " + name + ", Number of Athletes: " + numberOfAthletes;
        System.out.println(response);
    }

    @Override
    public void getGoldMedals() {
        String response = "     Team: " + name + ", Number of Gold Medals: " + numberOfGoldMedals;
        System.out.println(response);
    }
}
