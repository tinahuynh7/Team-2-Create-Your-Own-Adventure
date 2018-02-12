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
            inventory();
        }
        
        else if (selection.equalsIgnoreCase("MOVE")) {
            move_menu(); 
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
    public void weapon_selection() {
        
        System.out.println("Select your primary weapon:" );
        
        System.out.println(new_player.toString()); 
        int selection = input_selection(); 
        
        if (selection == 1) {
            System.out.println("you selected " + new_player.inventory.get(0).name() + ".");
        }        
    }
    
    public void inventory() {
        System.out.println("Would you like to 'DROP ITEM', 'USE POTION', or go 'BACK'?");
        
        String selection = input_command(); 
        if (selection.equalsIgnoreCase("DROP ITEM")) {
            if (new_player.inventory.isEmpty()) {
                System.out.println("Your inventory is empty. You have no items to drop.");
                inventory(); 
            }
            else {
                drop_item_menu();    
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
            inventory();
        }
    }
    
    public void drop_item_menu() {
        
        System.out.println("Which item would you like to drop? (Input number next to item)");
        new_player.toString(); 
            
        int selection = input_selection(); 
        
        if (selection == 1) {
            new_player.remove_item(0);
        }
        
        else if (selection == 2) {
            new_player.remove_item(1); 
        }
        
        else if (selection == 3) {
            new_player.remove_item(2); 
        }
        
        else if (selection == 4) {
            new_player.remove_item(3); 
        }
        
        else {
            System.out.println("That is an invalid command."); 
        }
        
        System.out.println("Here is your new inventory: ");
        new_player.toString(); 
        
        main_menu();    
    }   
}
