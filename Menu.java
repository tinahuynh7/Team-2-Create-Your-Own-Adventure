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
    
    public String input_command() { 
    
        String input_command = sc.nextLine();
        
        return input_command; 
    }
    
    public int input_selection() {
        
        String input_selection = sc.nextLine();
        
        Integer result = Integer.valueOf(input_selection); 
        
        return result; 
    }
    
   
    //main menu commands, in addition to certain submenu commands
    public void main_menu() {
        System.out.println("What would you like to do? (Type 'HELP' for a list of commands)"); 
        
        String selection = input_command(); 
        
        if (selection.equalsIgnoreCase("HELP")) {
            System.out.println("to view inventory: 'INVENTORY'");
            System.out.println("to move: 'MOVE'"); 
            main_menu(); 
        }
        
        else if (selection.equalsIgnoreCase("INVENTORY")) {
            System.out.println("Here is your inventory: "); 
            System.out.println(new_player.toString()); 
            inventory(new_player);
        }
        
        else if (selection.equalsIgnoreCase("MOVE")) {
            move_menu(); 
        }
        
        else if (selection.equalsIgnoreCase("DROP ITEM")) {
             if (new_player.inventory.isEmpty()) {
                System.out.println("Your inventory is empty. You have no items to drop.");
                main_menu(); 
            }
            else {
                drop_item_menu(new_player);    
            }
        }
        
        else if (selection.equalsIgnoreCase("USE POTION")) {
            System.out.println("used potion");
            //for future
        }
        
        else {
            System.out.println ("That is not a valid command."); 
            main_menu(); 
        }

    }
    
    public void move_menu() {
        
        System.out.println("Would you like to move 'FOWARD', 'BACKWARDS', or 'ENTER ROOM'?"); 
        
        String selection = input_command(); 
        
        if (selection.equalsIgnoreCase("FOWARD")) {
            //player position++
        }
        
        if (selection.equalsIgnoreCase("BACKWARDS")) {
            //player position--           
        }
        
        if (selection.equalsIgnoreCase("ENTER ROOM")) {
            //check if room
            //call room 
        }
    }
    
    public Item weapon_selection(Player new_player) {
        
        Item selected = new Item(); 
        
        System.out.println("Select what weapon you want to use: (Input number next to item)" );
        
        System.out.println(new_player.toString()); 
        int selection = input_selection(); 
        
        if (selection == 1) {
            System.out.println("you selected " + new_player.inventory.get(0).name() + ".");
            selected = new_player.inventory.get(0); 
        }  
        
        else if (selection == 2) {
            System.out.println("you selected " + new_player.inventory.get(1).name() + ".");
            selected = new_player.inventory.get(1); 
        }  
        
        else if (selection == 3) {
            System.out.println("you selected " + new_player.inventory.get(2).name() + ".");
            selected = new_player.inventory.get(3); 
        }  
        
        else if (selection == 4) {
            System.out.println("you selected " + new_player.inventory.get(3).name() + ".");
            selected = new_player.inventory.get(4); 
        }  
        
        return selected; 
    }
    
    public void inventory(Player new_player) {
        System.out.println("Would you like to 'DROP ITEM', 'USE POTION', or go 'BACK'?");
        
        String selection = input_command(); 
        if (selection.equalsIgnoreCase("DROP ITEM")) {
            if (new_player.inventory.isEmpty()) {
                System.out.println("Your inventory is empty. You have no items to drop.");
                inventory(new_player); 
            }
            else {
                drop_item_menu(new_player);    
            }
        }
        
        else if (selection.equalsIgnoreCase("USE POTION")) {
            System.out.println("used potion");
            //for future
        }
        
        else if (selection.equalsIgnoreCase("BACK")) {
            main_menu(); 
        }
        
        else {
            System.out.println("That is an invalid command.");
            inventory(new_player);
        }
    }
    
    public void drop_item_menu(Player new_player) {
        
        System.out.println("Which item would you like to drop? (Input number next to item)");
        new_player.toString(); 
            
        int selection = input_selection(); 
        
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
        
        System.out.println("Here is your new inventory: ");
        new_player.toString(); 
        
        main_menu();    
    }   
}
