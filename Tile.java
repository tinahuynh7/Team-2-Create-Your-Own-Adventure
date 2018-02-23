
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
        String RO = " ";
        if (RoomL != null){
        RO=RO+" || "+RoomL.Read;
        }
        if (RoomR!=null){
        RO=RO+" || "+RoomR.Read;
        }
        if (monster == null)
        {
        return "Blank" + "    " + RO;
        }
        else {
        return this.monster.name + " " +RO;
        }
        
        
    }

}
