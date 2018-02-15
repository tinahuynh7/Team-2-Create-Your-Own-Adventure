
public class Tile {

    boolean FTE = true;
    boolean Room;
    Monster monster;
    Player player;
    Item item;
    
    Tile(Monster monster) {
        this.monster = monster;
    }
    
    public String toString()
    {
        return this.monster.name;
    }

}
