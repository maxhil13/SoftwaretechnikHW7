package com.company.task2;

import java.util.Vector;

public class CompositeOlympicTeam implements OlympicTeam {
    public String name;

    private final Vector<OlympicTeam> olympicTeams;

    public CompositeOlympicTeam(String name) {
        this.name = name;
        this.olympicTeams = new Vector<>();
    }

    public void add(OlympicTeam team) {
        olympicTeams.add(team);
    }

    public void remove(OlympicTeam team) {
        olympicTeams.remove(team);
    }

    @Override
    public void getAthletes() {
        for (OlympicTeam team : olympicTeams) {
            team.getAthletes();
        }
    }

    @Override
    public void getGoldMedals() {
        for (OlympicTeam team : olympicTeams) {
            team.getGoldMedals();
        }
    }
}
