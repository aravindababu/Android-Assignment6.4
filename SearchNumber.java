/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchnumber;

/**
 *
 * @author user2
 */
public class SearchNumber {
    //Declaring an integer variable NOT_FOUND and assigning the value -1 
    //to return when the number we are looking for is not found in the array
    public static final int NOT_FOUND=-1;
    
    //Decaring a static method BinarySearch and initializing the method with an array and target value 
    public static int BinarySearch(int[] x,int target){
        
        //Declaring the integer Variable min,max 
           int min=0;
           int max=x.length-1; 
           
           //When minimum value is less than maximum
           while(min < max){
               //Defining the middle integer of the array
               int mid = (min+max)/2;
               //When target is less than the middle value
               //The number we are looking for will be towards the Left side of the array
               //that is it should be less than the middle value
               if(target < x[mid]){
                   max = mid;
               }
               //When target is more than the middle value
               //The number we are looking for will be towards the Right side of the array
               //that is it should be more than the middle value
               else if(target > x[mid]){
                   min = mid+1;
               }
               //if both the above cases are false than the number we are searching for
               //will be the middle element
               else{
                   return mid;
               }
           }
           //If element is not in the array return not found in the array
           return NOT_FOUND;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating an array of x
        int[] x = {2,4,6,8,10,12,14};
        //Seraching for number and printing the position of the number in the array
        int element = BinarySearch(x,10);
        System.out.println("Index of Element is: "+element);
        
        //Search Array if number is not there in the array print not found
        int notFound = BinarySearch(x,7);
        System.out.println("Element Not Found: "+notFound);
        
       
    }
    
}
