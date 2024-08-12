package object;

import enums.Direction;

public abstract class Character {
	public int speed = 3;
	public int screenX;
	public int screenY;
	public int x;
	public int y;
	public Direction direction;
	
	public abstract void update();
	
	public abstract void draw();
}
