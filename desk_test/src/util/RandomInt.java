/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Grzegorz
 */
public class RandomInt {
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
