# JavaAnagram

```
public class Anagram {

  public static void main(String[] args) {
    char[] firstWord;
    char[] secondWord;
    String name;
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter First Word: " );
    
    firstWord = myScanner.nextLine().toCharArray();
    
    System.out.println("Enter Second Word: ");
    
    secondWord = myScanner.nextLine().toCharArray();
    
    Arrays.sort(firstWord);
    Arrays.sort(secondWord);
    
    if(Arrays.equals(firstWord, secondWord)) {
      System.out.println("Anagram!");
    } else {
      System.out.println("Not anagram");
    }
    
    System.out.println("Done");
   
}

```
