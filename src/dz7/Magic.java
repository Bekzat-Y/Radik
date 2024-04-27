package dz7;

public class Magic extends Hero {
    public Magic() {
        super(100, 20, "MAGIC_SPELL");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + getSuperAbilityType());
    }
}

 class Medic extends Hero {
    private int healPoints;

    public Medic() {
        super(120, 15, "HEALING");
        this.healPoints = 50;
    }

    public void increaseExperience() {
        healPoints += (int) (healPoints * 0.1);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + getSuperAbilityType());
    }
}

 class Warrior extends Hero {
    public Warrior() {
        super(150, 30, "CRITICAL_DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + getSuperAbilityType());
    }
}
