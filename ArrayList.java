import java.util.*;
import java.io.*;

public class HelloWorld{
    
    
    public static ArrayList<String> CombineAllCarsILookedAt(String[] a, String[] b) {
        ArrayList<String> allCarsILookedAt = new ArrayList<String>();
        
        for(String w: a) allCarsILookedAt.add(w);
        for(String w: b) allCarsILookedAt.add(w);
        
        return allCarsILookedAt;
        
    }
    

     public static void main(String []args){
         
         String[] okWith = {"2010 vw", "2014 Prius", "2009 BMW"};
         String[] rejected = {"2009 VW", "2010 corolla", "2011 BMW"};
         System.out.println("Here is the list of all cars that I looked at: "+ CombineAllCarsILookedAt(okWith, rejected ) );
        
     }
}
