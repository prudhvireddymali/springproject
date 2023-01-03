package mali.springtwo.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GameConsole{
	public void up() 
	{
		System.out.println("sp jump");
	}
	public void down() 
	{
		System.out.println("sp down into a hole");
	}
	public void left() 
	{
		System.out.println("sp stop");
	}
	public void right() 
	{
		System.out.println("sp accelerate");
	}


}
