/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author c0655987
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
    }
    
        public static int numberOfAs(String input){
         
          
            int sum=0;
            for(char c: input.toCharArray()){
                if(c=='A'){
                    sum++;
                    
                }
            }
                return sum;
            
        }
    
}
