
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kylliefurukawa
 */
public class Item {

    String name;

    Item() {

    }

    public String name() {
        return name;
    }

    public void print_name() {

    }

    class Weapon extends Item {

        int durability;
        int attack_strength;
        int damage;

        public void attack() {

        }
    }

    class Potion extends Item {

        int health;
    }
}
