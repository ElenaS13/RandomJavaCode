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


#####Abstract Class 

```
import java.util.Scanner;
abstract class Book {

  String title;
  String author;
  
  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }
  
  abstract void display();
}

class MyBook extends Book {

  int price1;
  
  MyBook(String title, String author, int price){
  
    super(title, author);
    price1 = price;
  }
  
  void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price1);
  }
}


public class HelloWorld {
      public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Title: ");
  String title = scanner.nextLine();
  System.out.println("Author: ");
  String author = scanner.nextLine();
  System.out.println("Price: ");
  int price = scanner.nextInt();
  
  //scanner.close();
  
  Book book = new MyBook(title, author, price);
  book.display();
 
  }
}
```












```
