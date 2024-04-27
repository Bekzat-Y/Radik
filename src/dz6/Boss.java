package dz6;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss Name: " + getName() + ", Health: " + getHealth() + ", Weapon: " +
                (weapon != null ? weapon.getName() + " (" + weapon.getType() + ")" : "No weapon");
    }
}
