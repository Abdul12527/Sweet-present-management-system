package org.example;

public class Main {
    public static void main(String[] args) {

        Sweet Candy=new Candy();
        Candy.setSugarWeight((double)100);
        Sweet Lollipop=new Lollipop();
        Lollipop.setSugarWeight((double)200);

        Present present=new Present();
        present.addSweet(Lollipop);
        present.addSweet(Candy);
        System.out.println(present.filterBySugarRange((double)50,(double)150));
    }
}