package day4Snake;

public class SnakeNLadderUc5 {
static final int WINNINGPOSITION=100;

	public static void main(String[] args) {
		int num=0, playerPosition=0,currentPosition=-1;
		System.out.println("Start position of players is :" +playerPosition);
        System.out.println("rolls the dice to get number");
        while(playerPosition<=WINNINGPOSITION) {
          num=1+(int)Math.floor(Math.random()*6);
        int option=(int)Math.floor(Math.random()*3);
        	if(option==0) {
        		currentPosition=playerPosition;
        	System.out.println("No Play");
        	
        	System.out.println("players position is :" +currentPosition);
                    }
        	else if (option==1) {
        		System.out.println(" number on dice" +num);
        		System.out.println("Ladder");
        		playerPosition+=num;
        		if(playerPosition > WINNINGPOSITION)
        		{
        			playerPosition = playerPosition - num;
        			System.out.println("current position is:"+playerPosition);
        		break;
        		}
        		System.out.println("players position is :" +playerPosition);
        		}
        	else
        	{
        		System.out.println(" number on dice" +num);
        		System.out.println("Snake");
        		playerPosition+=num;
        		if(playerPosition > WINNINGPOSITION)
        		{
        			playerPosition = playerPosition - num;
        			System.out.println("current position is:"+playerPosition);
        		break;
        		}
        		System.out.println("players position is :" +playerPosition);
        	}
       
        }
        
        
	}
}