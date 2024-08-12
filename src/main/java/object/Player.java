package object;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import enums.Direction;

public class Player extends Character implements KeyListener {

	@Override
	public void update() {
		System.out.println("update");
		this.move();
	}

	@Override
	public void draw() {
		System.out.println("draw");
	}
	
	private void move() {
		switch (this.direction) {
		case UP:
			this.y -= this.speed;
			break;
		case RIGHT:
			this.x += this.speed;
			break;
		case DOWN:
			this.y += this.speed;
			break;
		case LEFT:
			this.x -= this.speed;
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_W) {
			this.direction = Direction.UP;
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			this.direction = Direction.RIGHT;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			this.direction = Direction.DOWN;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			this.direction = Direction.LEFT;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
