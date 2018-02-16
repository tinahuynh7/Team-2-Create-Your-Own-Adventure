/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList; 
/**
 *
 * @author kylliefurukawa
 */
public class Player {
    
    int position = 0; 
    int health = 100;
    ArrayList <Item> inventory = new ArrayList <Item>(); 
    
    
    Player(){  
    }
    
    //add item
    public void add_item(Item item) {
        inventory.add(item); 
    }
       
    //remove item
    public void remove_item(int i) {
        inventory.remove(i); 
    }
    
    //health
    public int health_count() {
        return health; 
    }
    
    //print inventory
    public String toString() {
        
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i+1) + ".) " + inventory.get(i).name()); 
        }
        
        //print "empty" if empty
        if (inventory.size() == 0) {
            System.out.println("(empty)"); 
        }
        
        return "\n"; 
    }
     
}
