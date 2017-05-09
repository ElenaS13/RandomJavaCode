public class HelloWorld
{
  public static void main(String[] args)
  {
    int[] ar = new int[] {4,2,1,5,3,32,12,0};
    
    //find the smallest array member 
    
    int val = ar[0];
    for(int i = 0; i<ar.length; i++){
    if(val>ar[i]){
    	val = ar[i];
    }
    
    }
    System.out.println(val);
  }
}
