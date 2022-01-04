package DataStructures.HashTable;

import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> bookList01 = new Hashtable<>();
        Hashtable<Author, Hashtable<Integer, String>> htable = new Hashtable<>();
        bookList01.put(1, "Annabelle");
        bookList01.put(2, "Creation");
        bookList01.put(3, "Annabelle Comes Home");
        htable.put(new Author("A01", "Dauberman", false), bookList01);
        Hashtable<Integer, String> bookList02 = new Hashtable<>();
        bookList02.put(1, "The Conjuring 1");
        bookList02.put(2, "The Conjuring 2");
        bookList02.put(3, "The Conjuring 3");
        bookList02.put(4, "The Conjuring 4");
        htable.put(new Author("A02", " Chad Hayes", true), bookList02);
        traverse(htable);

        // Output:
        // {id='A01', name='Dauberman', male='false'}: {3=Annabelle Comes Home, 2=Creation, 1=Annabelle}
        // {id='A02', name=' Chad Hayes', male='true'}: {4=The Conjuring 4, 3=The Conjuring 3, 2=The Conjuring 2, 1=The Conjuring 1}
    }

    private static void traverse(Hashtable<Author, Hashtable<Integer, String>> htable) {
        for (Author key : htable.keySet()) {
            System.out.println(key + ": " + htable.get(key));
        }
    }
}
