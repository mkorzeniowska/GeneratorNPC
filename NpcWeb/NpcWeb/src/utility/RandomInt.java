package utility;

public class RandomInt{
	private int result;
	
	public RandomInt(int min, int max) {
	  int range = (max - min) + 1;    
	  result = (int)(Math.random() * range) + min;
	}
	   
    public static int rand(int min, int max){
        int range = (max - min) + 1;    
        return (int)(Math.random() * range) + min;
    }
    
    public int getResult() 	{	return result;	}
    
}