/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; 

/*
@author kylliefurukawa
*/
public class Menu {
    
    Scanner sc = new Scanner(System.in); 
    Player new_player; 
    
    Menu(Player new_player){
        this.new_player = new_player; 
    }
    
    //function to type in commands
    public String input_command() { 
        String input_command = sc.nextLine();        
        return input_command; 
    }
    
    //function to type in a numbered selection
    public int input_selection() {       
        String input_selection = sc.nextLine();
        //convert String input_selection to integer
        Integer result = Integer.valueOf(input_selection);
        return result; 
    }
    
   
    //main menu commands, in addition to certain submenu commands
    public void main_menu() {
        System.out.println(" \nWhat would you like to do? (Type 'HELP' for a list of commands)\n"); 
        
        String selection = input_command(); 
        
        //displays help menu
        if (selection.equalsIgnoreCase("HELP")) {
            System.out.println("\nTo view inventory: 'INVENTORY'");
            System.out.println("To move: 'MOVE'"); 
            main_menu(); 
        }
        
        //leads to inventory menu
        else if (selection.equalsIgnoreCase("INVENTORY")) {
            System.out.println("\nHere is your inventory: "); 
            System.out.println(new_player.toString()); 
            inventory_action(new_player);
        }
        
        //leads to move menu
        else if (selection.equalsIgnoreCase("MOVE")) {
            move_menu(); 
        }
        
        //allows player to drop an item if inventory has items
        else if (selection.equalsIgnoreCase("DROP ITEM")) {
             if (new_player.inventory.isEmpty()) {
                System.out.println("Your inventory is empty. You have no items to drop.");
                main_menu(); 
            }
             
            else {
                drop_item_menu(new_player);    
            }
        }
        
        //allows player to use a potion
        else if (selection.equalsIgnoreCase("USE POTION")) {
            System.out.println("A potion has been used.");
           
            //basic health count where health +1 
            raise_health(new_player); 
            System.out.println("Health: " + new_player.health_count());
            main_menu(); 
        }
        
        //rejects any other commands player attempts to input
        else {
            System.out.println ("That is not a valid command."); 
            main_menu(); 
        }

    }
    
    //movement menu
    public void move_menu() {
        
        System.out.println("\nWould you like to move 'FOWARD', 'BACKWARDS', or 'ENTER ROOM'?\n"); 
        
        String selection = input_command(); 
        
        //move foward
        if (selection.equalsIgnoreCase("FOWARD")) {
            //player position++
        }
        
        //move backwards
        if (selection.equalsIgnoreCase("BACKWARDS")) {
            //player position--           
        }
        
        //enter room
        if (selection.equalsIgnoreCase("ENTER ROOM")) {
            //check if room
            //call room 
        }
    }
    
    //allows player to select a weapon for battle
    public Item weapon_selection(Player new_player) {
        
        System.out.println("\nSelect what weapon you want to use: (Input number next to item)" );
        
        Item selected = new Item(); 
        System.out.println(new_player.toString()); 
        int selection = input_selection(); 
        
        //select first item
        if (selection == 1) {
            System.out.println("you selected " + new_player.inventory.get(0).name() + ".");
            selected = new_player.inventory.get(0); 
        }  
        
        //select second item
        else if (selection == 2) {
            System.out.println("you selected " + new_player.inventory.get(1).name() + ".");
            selected = new_player.inventory.get(1); 
        }  
        
        //select third item
        else if (selection == 3) {
            System.out.println("you selected " + new_player.inventory.get(2).name() + ".");
            selected = new_player.inventory.get(3); 
        }  
        
        //select fourth item
        else if (selection == 4) {
            System.out.println("you selected " + new_player.inventory.get(3).name() + ".");
            selected = new_player.inventory.get(4); 
        }  
        return selected; 
    }
    
    //options menu for action with inventory
    public void inventory_action(Player new_player) {
        System.out.println("Would you like to 'DROP ITEM', 'USE POTION', or go 'BACK'?\n");        
        String selection = input_command(); 
        
        //allows player to drop an item if inventory has items
        if (selection.equalsIgnoreCase("DROP ITEM")) {
            if (new_player.inventory.isEmpty()) {
                System.out.println("Your inventory is empty. You have no items to drop.");
                inventory_action(new_player); 
            }
            else {
                drop_item_menu(new_player);    
            }
        }
        
        //allows player to use a potion
        else if (selection.equalsIgnoreCase("USE POTION")) {
            System.out.println("A potion has been used.");
           
            //basic health count where health +1 
            raise_health(new_player); 
            System.out.println("Health: " + new_player.health_count());
            main_menu(); 
        }
        
        //goes back to main menu
        else if (selection.equalsIgnoreCase("BACK")) {
            main_menu(); 
        }
        
        //rejects any other commands player attempts to input
        else {
            System.out.println("That is an invalid command.");
            inventory_action(new_player);
        }
    }
    
    //menu to drop an item 
    public void drop_item_menu(Player new_player) {
        
        System.out.println("\nWhich item would you like to drop? (Input number next to item)");
        new_player.toString(); 
            
        int selection = input_selection(); 
        
        //allows player to select a number to drop item
        switch (selection) {
            case 1:
                new_player.remove_item(0);
                break;
            case 2:
                new_player.remove_item(1);
                break;
            case 3:
                new_player.remove_item(2);
                break;
            case 4:
                new_player.remove_item(3);
                break;
            default:
                System.out.println("That is an invalid command.");
                break; 
        }
        
        System.out.println("\nHere is your new inventory: ");
        new_player.toString(); 
        
        main_menu();    
    }   
    
    //basic raise health by 1 
    public int raise_health(Player new_player) {        
        new_player.health ++; 
        int health = new_player.health;  
        return health;
    }
}
