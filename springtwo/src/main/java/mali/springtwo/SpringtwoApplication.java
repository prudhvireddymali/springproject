package mali.springtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import mali.springtwo.game.GameConsole;
import mali.springtwo.game.GameRunner;
import mali.springtwo.game.MarioGame;
import mali.springtwo.game.PacmanGame;
import mali.springtwo.game.SuperContraGame;

@SpringBootApplication
public class SpringtwoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(SpringtwoApplication.class, args);
		//MarioGame game = new MarioGame();
		 //GameConsole  game=new  PacmanGame ();
		//SuperContraGame game = new  SuperContraGame();
	   // GameRunner runner = new GameRunner(game);
		GameRunner runner=context.getBean(GameRunner.class);
		runner.run();
	}

}
