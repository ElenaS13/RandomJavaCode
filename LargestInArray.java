public class HelloWorld{

     public static void main(String []args){
         //find largest member of the array
         
         int[] data = {2,0,42,45,1};
         int var = data[0];
         
         for(int i =0; i<data.length; i++) {
             if(var<data[i]){
                 
                 var = data [i];
             }
             
             
             
             
             
         }
        System.out.println(var);
     }
}
