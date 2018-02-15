/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author yhuynh
 */
public class Weapon {

    int attack_strength;
    int durability;
    int damage;
   
    public static Weapon getWeapon(ItemList item) {
         ArrayList<Item> array = new ArrayList<Item>();        
        Weapon weapon = new Weapon();
        return weapon;
    }

    private void initItems() {
        Item shotgun = new Item("Shotgun");
        Item bow = new Item("Bow");
        Item gun = new Item("Gun");

    }

    public String getDescription(String gun) {
        return "A weapon with a really high damage rate";
    }

    public int currentAmmo = 15;

    public Bullet fire() {
        Bullet bullet = createBullet();

        currentAmmo--;
        return null;
    }

    private Bullet createBullet() {
        int bullet;

        return null;
    }

    private static void Giveplayer_weapon(boolean hasWeapon, int w) {
        hasWeapon = true;
    }

    public void consume() {

    }

    public String toString() {
        return "";
    }

    private static class Bullet {

        public Bullet() {
        }
    }

}

class Potion extends Item {

    public Potion(String health) {
        super(health);
    }
    int health;

    public void consume() {

    }

    public String getName() {
        return "Health potion";
    }

    public String getDescription() {
        return " This potion will heal 2% of your health every 30 seconds ";
    }
}

class Armour extends Item {

    public Armour(String sword) {
        super(sword);
    }

    public void consume() {

    }
}
