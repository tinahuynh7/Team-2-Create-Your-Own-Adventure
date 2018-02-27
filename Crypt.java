import java.util.ArrayList;
import java.util.Random;


public class Crypt {
    ArrayList<Tile> floorplan = new ArrayList<Tile>(); 
    ArrayList<Monster> monster_db = new ArrayList<Monster>();
    ArrayList<Desc> Desc_db = new ArrayList<Desc>();
    public void genWorld(){
        this.fill_cat();
        this.fill_Rcat();
        for (int i = 0; i < 10; i++){
            Random rand = new Random();
            int r = rand.nextInt(10);
            Tile new_tile = new Tile();

            Monster m = null;
            if (r<6){
                m = this.monster_db.get(r);
                

            }  
            new_tile.addMonster(m);
            r = rand.nextInt(10);
            if (r<7) {
            
            }
            else if (r<9){
            int tf = rand.nextInt(2);
            if(tf==0){
                new_tile.RoomL= this.Desc_db.get(r);
            }
            else {
                new_tile.RoomR= this.Desc_db.get(r);
            }
            }
            else{
            new_tile.RoomL=this.Desc_db.get(r);
            new_tile.RoomR=this.Desc_db.get(r);
            }
            floorplan.add(new_tile);
        }
    }
    public void fill_cat(){
        for (int i = 0; i<10; i++){
            Skeleton skeleton = new Skeleton();
            this.monster_db.add(skeleton);
        }
    }
    
    public void fill_Rcat(){
    for (int i = 0; i<10; i++){
            EmptyRoom BlankRoom = new EmptyRoom();
            this.Desc_db.add(BlankRoom);
        }
    }
    public void printMap(){
    for (int i = 0; i<this.floorplan.size(); i++){
            Tile tile = this.floorplan.get(i);
            System.out.println(tile);
        }
}
}
