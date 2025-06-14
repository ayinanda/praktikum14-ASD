import java.util.TreeSet; // membuat class dan import (no.1)

public class TreeSetDemo09 {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
 // menambahkan data buah ke dalam TreeSet no (2)
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        for (String temp : fruits) {  // looping untuk mencetak data buah (no.3)
            System.out.println(temp);
        }

        System.out.println("First: " + fruits.first()); 
        System.out.println("Last: " + fruits.last()); 

        fruits.remove("Jeruk"); 
        System.out.println("Setelah remove: " + fruits);

        fruits.pollFirst();
        System.out.println("Setelah pollFirst: " + fruits);

        fruits.pollLast();
        System.out.println("Setelah pollLast: " + fruits);
    }
}
