package DataStructures.StackLinkedListDecToRep;

public class Main {
    public static void main(String[] args) {
        decToRep(255, 2);
        decToRep(4096, 2);
        // Resutl:
        // | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
        // | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
        decToRep(512, 8);
        decToRep(511, 8);
        // resutl
        // | 1 | 0 | 0 | 0 |
        // | 7 | 7 | 7 |
    }

    public static void decToRep(int decimalCode, int rep) {
        if (decimalCode <= 0) return;
        StackLinkedList<Integer> mytack = new StackLinkedList<>();
        while (decimalCode > 0) {
            Integer binOctCode = Integer.valueOf(decimalCode % rep);
            mytack.push(binOctCode);
            decimalCode /= rep;
        }
        mytack.traverse();
    }

}