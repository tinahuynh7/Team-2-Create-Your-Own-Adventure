import java.util.ArrayList;
import java.util.Random;
public class Crypt {
ArrayList<Tile> floorplan = new ArrayList<Tile>(); 
ArrayList<Monster> monster_db = new ArrayList<Monster>();
    public void genWorld(){
    for (int i = 0; i < 10; i++){
        Tile new_tile = new Tile();
        Crypt.fill_cat();
        Random rand = new Random();
        int r = rand.nextInt(10)+1;
            if (r<6){
                Monster m = this.monster_db.get(r);
                new_tile.monster = m;
                floorplan.add(new_tile);
            }    
        }
    }
    public static void fill_cat(){
    for (int i = 0; i<10; i++){
        Skeleton skeleton = new Skeleton();
    monster_db.add(skeleton);
    }
    }
}
