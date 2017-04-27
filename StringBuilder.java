public class HelloWorld{
    
    public static String joinWords(String[] words) {
        
        
        StringBuilder sentence = new StringBuilder();
        for(String w: words) {
            
            sentence.append(w);
        }
        
        return sentence.toString();
    }

     public static void main(String []args){
        //System.out.println("Hello World");
        String[]words = {"car", "dog", "mac"};
        System.out.println("Result: " + joinWords(words));
        
        
     }
}
