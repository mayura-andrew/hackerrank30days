
package Car;
import java.util.Random;

public class CointToss {
	
	public String tossACoin() {
		Random rand = new Random();
		
		int toss = Math.abs(rand.nextInt()) % 2;
		
		if (toss == 0) {
			return "HEAD";
			
		} else {
			return "TAILS";
		}
		
	}
	
	public static void main(String[] args) {
		CointToss game = new CointToss();
		
		System.out.println(game.tossACoin());
	}

}
