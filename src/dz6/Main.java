package dz6;

public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.SWORD);
        bossWeapon.setName("Excalibur");

        Boss boss = new Boss();
        boss.setName("Dark Lord");
        boss.setHealth(1000);
        boss.setWeapon(bossWeapon);

        System.out.println("Boss Info:");
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Skeleton Archer");
        skeleton1.setHealth(50);
        skeleton1.setWeapon(bossWeapon);
        skeleton1.setArrowCount(20);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Skeleton Warrior");
        skeleton2.setHealth(100);
        skeleton2.setWeapon(null);
        skeleton2.setArrowCount(0);

        System.out.println("\nSkeleton 1 Info:");
        System.out.println(skeleton1.printInfo());

        System.out.println("\nSkeleton 2 Info:");
        System.out.println(skeleton2.printInfo());
    }
}
