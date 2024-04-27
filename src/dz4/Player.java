package dz4;

import java.util.Random;

class Player {
    protected String name;
    protected int health;
    protected boolean isAlive;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.isAlive = true;
    }

    public void receiveDamage(int damage) {
        if (isAlive) {
            health -= damage;
            if (health <= 0) {
                isAlive = false;
                System.out.println(name + " погибает.");
            }
        } else {
            System.out.println(name + " уже мертв.");
        }
    }

    public void heal(int amount) {
        if (isAlive) {
            health += amount;
            System.out.println(name + " получает лечение: +" + amount + " здоровья.");
        } else {
            System.out.println(name + " мертв и не может быть вылечен.");
        }
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void roundEndHealing(int amount) {
    }
}

class Medic extends Player {
    private Player[] team;

    public Medic(String name, int health, Player[] team) {
        super(name, health);
        this.team = team;
    }

    @Override
    public void roundEndHealing(int amount) {
        if (isAlive) {
            for (Player player : team) {
                if (player.getHealth() < 100 && player.isAlive()) {
                    player.heal(amount);
                    break;
                }
            }
        }
    }
}


 class Main  {
    public static void main(String[] args) {
        Random random = new Random();
        Player[] team = new Player[]{
                new Player("Warrior", 100),
                new Player("Mage", 80),
                new Player("Archer", 120)
        };
        Medic medic = new Medic("Healer", 90, team);

        medic.roundEndHealing(10);

        int bossDamage = 30;
        for (Player player : team) {
            player.receiveDamage(bossDamage);
        }
    }
}

