package day4Snake;

public class SnakeNLadderUc3 {

	public static void main(String[] args) {
		int playerPosition=0;
		System.out.println("Start position of players is :" +playerPosition);
        System.out.println("rolls the dice to get number");
      
        int num=1+(int)Math.floor(Math.random()*6);
        int option=(int)Math.floor(Math.random()*3);
        	if(option==0) {
        	System.out.println("No Play");
        	System.out.println("players position is :" +playerPosition);
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