package mali.springtwo.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GameConsole{
	public void up() 
	{
		System.out.println("PC jump");
	}
	public void down() 
	{
		System.out.println("PC down into a hole");
	}
	public void left() 
	{
		System.out.println("PC stop");
	}
	public void right() 
	{
		System.out.println("PC accelerate");
	}


}
