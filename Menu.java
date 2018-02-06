/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw;
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
    
    
}
