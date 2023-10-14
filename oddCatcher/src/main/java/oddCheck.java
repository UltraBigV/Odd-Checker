/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vidorgurovich
 */
import java.util.*;
public class oddCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int randNum1=0, randNum2=0,result,amountOfRuns=1;
        int choice = 0;
        
        System.out.println("Please select an operation below to preform on the randomly generated numbers: ");
        System.out.println("1. '+'");
        System.out.println("2. '-'");
        System.out.println("3. '*'");
        System.out.println("4. '/'");
        choice = scan.nextInt();
        
        switch(choice){
            case 1:
                int x = 0;
                while(x==0){
                    randNum1 = rand.nextInt(10);
                    randNum2 = rand.nextInt(10);
                    result = randNum1 + randNum2;
                    if(result%2==0){
                        amountOfRuns+=1;
                    }
                    else{
                        x=1;
                        System.out.println("Number of runs are: "+amountOfRuns);
                        System.out.println("The value of the odd number that stopped the program is: "+result);
                    }
                }
                break;
                
            case 2:
                int y = 0;
                while(y==0){
                    randNum1 = rand.nextInt(10);
                    randNum2 = rand.nextInt(10);
                    result = randNum1 - randNum2;
                    if(result%2==0){
                        amountOfRuns+=1;
                    }
                    else{
                        y=1;
                        System.out.println("Number of runs are: "+amountOfRuns);
                        System.out.println("The value of the odd number that stopped the program is: "+result);
                    }
                }
                break;
                
            case 3:
                int z = 0;
                while(z==0){
                    randNum1 = rand.nextInt(10);
                    randNum2 = rand.nextInt(10);
                    result = randNum1 * randNum2;
                    if(result%2==0){
                        amountOfRuns+=1;
                    }
                    else{
                        z=1;
                        System.out.println("Number of runs are: "+amountOfRuns);
                        System.out.println("The value of the odd number that stopped the program is: "+result);
                    }
                }
                break;
                
            case 4:
                int i = 0;
                while(i==0){
                    randNum1 = rand.nextInt(10);
                    randNum2 = 1+rand.nextInt(9);
                    result = randNum1 / randNum2;
                    if(result%2==0){
                        amountOfRuns+=1;
                    }
                    else{
                        i=1;
                        System.out.println("Number of runs are: "+amountOfRuns);
                        System.out.println("The value of the odd number that stopped the program is: "+result);
                    }
                }
                break;
        }
        
        
        
        
            
        
        
    }
    
}
