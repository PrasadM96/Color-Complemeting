//importing libraries
import static java.lang.Math.abs;
import java.util.*;

public class E15065lab01q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create object in Scanner class

        int []val = new int[3];  //declare the array
        int temp,count=0; 

        System.out.print("Enter the color: "); //get inputs from the user
        for(int i=0;i<3;i++){
            val[i]=sc.nextInt();
                        if(val[i]>255 && val[i]<0){
                                System.out.println("Not a color.");
                                return;
                        }
                        temp=255-val[i];
                        if(abs(temp-val[i])<=32){    //check color is grey or not
                                count++;
                        }
        }

        System.out.print("The complement: ");
        //complementing process
        for(int i=0;i<3;i++){
            if(count==3){
                if(val[i]+128>=255){
                        val[i]=val[i]-128;
                }else{
                        val[i]=val[i]+128;
                }
            }else{
                        val[i]=255-val[i];
            }
        }
        
        //print final answer to the screen
        for(int i=0;i<3;i++){
            System.out.print(val[i]+ " ");
        }
         System.out.println();  

    }
    
}





