package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHp(700);
	boss.setTaken(50);
	boss.setDefence(70);

	Warrior warrior = new Warrior();
	warrior.setHp(250);
	warrior.setTaken(30);
	warrior.setUltimate(80);

	Megical megical = new Megical();
	megical.setHp(250);
	megical.setTaken(30);
	megical.setUltimate(80);

	Mental mental = new Mental();
	mental.setHp(250);
	mental.setTaken(30);
	mental.setUltimate(80);

        System.out.println("The Game");
        System.out.println("Boss Hp = " + boss.getHp() + ";" + "boss taken" + boss.getTaken() + "," );
        System.out.println("warrior Hp = " + warrior.getHp() + ";" + "Warrior taken" + warrior.getTaken() + "," );
        System.out.println("Megical Hp = " + megical.getHp() + ";" + "Megical taken" + megical.getTaken() + "," );
        System.out.println("Mental Hp = " + mental.getHp() + ";" + "Mental taken" + mental.getTaken() + "," );
    }
}
