import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String [] args){
	World Lorien = new World();
	Location ulikejazz = new Location(8, 8);
	Location noob = new Location(8, 3);
	Bug barry = new Bug();
	Bug b = new Bug();
	Flower flowey = new Flower(Color.YELLOW);
	Lorien.show();
	Lorien.add(noob, b);
	Lorien.add(ulikejazz, barry);
	b.turn();
	b.turn();
	barry.turn();
	barry.turn();
	barry.setColor(Color.BLUE);
	for(int i=0; i < 10; i++){
	for(int j=0; j < 10; j++){
		Lorien.add(new Location(i, j), flowey);
	}
	}
}
}