package mali.springtwo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole{
	public void up() 
	{
		System.out.println("jump");
	}
	public void down() 
	{
		System.out.println("down into a hole");
	}
	public void left() 
	{
		System.out.println("stop");
	}
	public void right() 
	{
		System.out.println("accelerate");
	}


}
