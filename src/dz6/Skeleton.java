package dz6;

public class Skeleton extends Boss {
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return "Skeleton Name: " + getName() + ", Health: " + getHealth() + ", Weapon: " +
                (getWeapon() != null ? getWeapon().getName() + " (" + getWeapon().getType() + ")" : "No weapon") +
                ", Arrow Count: " + arrowCount;
    }
}
