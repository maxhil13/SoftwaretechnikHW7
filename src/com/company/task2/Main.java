package com.company.task2;

public class Main {
    public static void main(String[] args) {

        // asia
        // china

        LeafOlympicTeam teakwondo = new LeafOlympicTeam("Women's Teakwondo", 25, 3);
        LeafOlympicTeam waterpolo = new LeafOlympicTeam("Women's Waterpolo", 22, 2);
        LeafOlympicTeam artisticGymnastics = new LeafOlympicTeam("Women's Artistic Gymnastics", 10, 6);

        CompositeOlympicTeam womenChina = new CompositeOlympicTeam("Women");
        womenChina.add(teakwondo);
        womenChina.add(waterpolo);
        womenChina.add(artisticGymnastics);

        LeafOlympicTeam shooting = new LeafOlympicTeam("Men's Shooting", 10, 1);

        CompositeOlympicTeam menChina = new CompositeOlympicTeam("Men");
        menChina.add(shooting);


        CompositeOlympicTeam chinaTeam = new CompositeOlympicTeam("China");
        chinaTeam.add(womenChina);
        chinaTeam.add(menChina);

        CompositeOlympicTeam asiaTeam = new CompositeOlympicTeam("Asia");
        asiaTeam.add(chinaTeam);

        // europe
        //germany

        LeafOlympicTeam cycling = new LeafOlympicTeam("Women's Cycling", 55, 10);
        LeafOlympicTeam tennis = new LeafOlympicTeam("Women's Tennis", 32, 4);

        CompositeOlympicTeam womenGermany = new CompositeOlympicTeam("Women");
        womenGermany.add(cycling);
        womenGermany.add(tennis);

        LeafOlympicTeam tableTennis = new LeafOlympicTeam("Men's Table Tennis", 15, 7);
        LeafOlympicTeam footballGermany = new LeafOlympicTeam("Men's Football", 68, 10);

        CompositeOlympicTeam menGermany = new CompositeOlympicTeam("Men");
        menGermany.add(tableTennis);
        menGermany.add(footballGermany);

        CompositeOlympicTeam germanyTeam = new CompositeOlympicTeam("Germany");
        germanyTeam.add(womenGermany);
        germanyTeam.add(menGermany);

        // italy

        LeafOlympicTeam alpineSki = new LeafOlympicTeam("Women's Alpine Ski", 35, 11);

        CompositeOlympicTeam womenItaly = new CompositeOlympicTeam("Women");
        womenItaly.add(alpineSki);

        LeafOlympicTeam footballItaly = new LeafOlympicTeam("Men's Football", 78, 8);
        LeafOlympicTeam swimming = new LeafOlympicTeam("Men's Swimming", 45, 12);

        CompositeOlympicTeam menItaly = new CompositeOlympicTeam("Men");
        menItaly.add(footballItaly);
        menItaly.add(swimming);

        CompositeOlympicTeam italyTeam = new CompositeOlympicTeam("Italy");
        italyTeam.add(womenItaly);
        italyTeam.add(menItaly);


        CompositeOlympicTeam europeTeam = new CompositeOlympicTeam("Europe");
        europeTeam.add(germanyTeam);
        europeTeam.add(italyTeam);

        // olympic team

        CompositeOlympicTeam olympicTeam = new CompositeOlympicTeam("Olympic Team");
        olympicTeam.add(asiaTeam);
        olympicTeam.add(europeTeam);

        // --------------------------------------------------------------------------------------------------------------

        System.out.println("------------------------------------------------------------------");
        System.out.println("Germany - Men - Athletes");
        menGermany.getAthletes();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Germany - Men - Gold Medals");
        menGermany.getGoldMedals();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Asia - Gold Medals");
        asiaTeam.getGoldMedals();

        System.out.println("------------------------------------------------------------------");
        System.out.println("All Teams - Athletes");
        olympicTeam.getAthletes();

        System.out.println("------------------------------------------------------------------");

    }
}
