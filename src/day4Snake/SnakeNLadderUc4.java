package day4Snake;

public class SnakeNLadderUc4 {
static final int WINNINGPOSITION=100;

	public static void main(String[] args) {
		int playerPosition=0,currentPosition=-1;
		System.out.println("Start position of players is :" +playerPosition);
        System.out.println("rolls the dice to get number");
        for( playerPosition=0;playerPosition<=WINNINGPOSITION;playerPosition++) {
      
        int num=1+(int)Math.floor(Math.random()*6);
        int option=(int)Math.floor(Math.random()*3);
        	if(option==0) {
        	System.out.println("No Play");
        	currentPosition=playerPosition;
        	System.out.println("players position is :" +currentPosition);
                    }
        	else if (option==1) {
        		System.out.println(" number on dice" +num);
        		System.out.println("Ladder");
        		playerPosition+=num;
        		System.out.println("players position is :" +playerPosition);
        		}
        	else
        	{
        		System.out.println(" number on dice" +num);
        		System.out.println("Snake");
        		playerPosition+=num;
        		System.out.println("players position is :" +playerPosition);
        	}
       
        }
        
        
	}
}