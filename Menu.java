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
    
    Menu(){
    }
    
    public String input_selection() { 
    
        String input_selection = sc.nextLine();
        
        return input_selection; 
    }
    
    public void main_menu() {
        System.out.println("What would you like to do? (Type 'HELP' for a list of commands)"); 
        
        String selection = input_selection(); 
        
        if (selection.equalsIgnoreCase("HELP")) {
            System.out.println("to view inventory: 'INVENTORY'");
            System.out.println("to move: 'MOVE'"); 
            main_menu(); 
        }
        
        if (selection.equalsIgnoreCase("INVENTORY")) {
            System.out.println("test inventory ");
        }
        
        if (selection.equalsIgnoreCase("MOVE")) {
            //move function 
        }

    }
    public void weapon_selection() {
        
        System.out.println("Select your weapon" );
        
        
        String selection = input_selection(); 
        
        
    }
    
    
}
