import java.util.ArrayList;
import java.util.Random;


public class Crypt {
    ArrayList<Tile> floorplan = new ArrayList<Tile>(); 
    ArrayList<Monster> monster_db = new ArrayList<Monster>();
    public void genWorld(){
        this.fill_cat();
        
        for (int i = 0; i < 10; i++){
            Random rand = new Random();
            int r = rand.nextInt(10)+1;
            
            if (r<6){
                Monster m = this.monster_db.get(r);
                Tile new_tile = new Tile(m);

                floorplan.add(new_tile);
            }    
        }
    }
    public void fill_cat(){
        for (int i = 0; i<10; i++){
            Skeleton skeleton = new Skeleton();
            this.monster_db.add(skeleton);
        }
    }
}
