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



#####Scope

```
class Difference {

  private int elements;
  public int maximumDifference;
  
  Difference(int[]a) {
    
    elements = a;
    maximumDifference = 0;
  }
  
  public void computeDifference() {
  
    int n = elements.length;
    
    for(int i=0; i<n; i++){
      for(int j = i+1; j<n; j++){
        int diff = elements[i]-elements[j]
        
        if(dif<0){
          diff =-dif;
        }
        
        if(dif> maximumDifference) {
          maximumDifference = diff;
          
        }
      }
      }
  
  }
}


public class Solution {
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int[] a = new int[n]; 
    
    for(int i =0; i<n; i++){
      a[i]= scanner.nextInt();
    }
    
    scanner.close();
    
    Difference difference = new Difference(a);
    
    difference.computeDifference;
    
    System.out.println(difference.maximumDifference);
  
 }
}

```



#####Interfaces


```
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

//Write your code here
class Calculator implements AdvancedArithmetic {
	public int divisorSum(int n){
		int sum = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum+=i;
		    }
	    } 
    return sum;
    }
}

class HelloWorld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = scan.nextInt();
		scan.close();
		
		AdvancedArithmetic myCalculator = new Calculator(); 
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
		System.out.println(sum);
	}
}



import java.io.*;
import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int swaps = 0;
        System.out.println("Enter num");
        if()int n = scan.nextInt();
        int[] arr = new int[n];
    
        for(int i = 0; i < n;i++){
            arr[i] = scan.nextInt();
            
        }
        
            for(int j = 0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;
                
                    swaps++;
                }
            }
            
        
        
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n-1]);
    }
}



```
