
public class Tile {

    boolean FTE = true;
    boolean Room;
    Monster monster;
    Player player;
    Item item;
    Desc RoomL;
    Desc RoomR;
    
    
    public void addMonster(Monster monster) {
        this.monster = monster;
    }
    
    public String toString()
    {
        String R="   ";
        String L="   ";
        if (RoomR != null){
        R="[ ]";
        }
        if (RoomL!=null){
        L="[ ]";
        }
        if (monster == null)
        {
        return L+"[ ]" + R;
        }
        else {
        return L+"[@]" +R;
        }
        
        
    }

}
