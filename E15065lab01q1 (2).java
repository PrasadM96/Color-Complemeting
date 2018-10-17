


import java.util.*;

public class E15065lab01q1{

    public static void main(String[] args) {
        
        boolean big=false,weird=false,special=false; //delacre variables
        
        Scanner sc=new Scanner(System.in); //creating an object in Scanner 
        
        System.out.print("Enter a number: ");
        int num=sc.nextInt(); //get value for num form the user
        
        //conditions
        special=(num%15==0); 
        weird=(((num%5)==0)&&((num%6)==0)&&((num%18)!=0));
        big=(num>999);
        
        //check for possibilities and print to the screen
        if(!special && !big && !weird){
              System.out.println(num+" is not scary.");
        }else if(!special && !big && weird){
              System.out.println(num+" is weird, scary, but not big.");
        }else if(!special && big && !weird ){
              System.out.println(num+" is big, scary, but not weird.");
        }else if(!special && big && weird){
              System.out.println(num+" is big, weird, scary.");
        }else if(special && !big && !weird){
              System.out.println(num+" is special, but not scary.");
        }else if(special && !big && weird){
              System.out.println(num+" is special, weird, scary, but not big.");
        }else if(special && big && !weird){
              System.out.println(num+" is special, big, scary, but not weird.");
        }else{
              System.out.println(num+" is special, big, weird, scary.");
        }
        
    }
    
}
