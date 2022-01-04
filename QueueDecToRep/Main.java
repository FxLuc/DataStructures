package DataStructures.QueueDecToRep;

public class Main {
    public static void main(String[] args) {
        decToRep(256, 2);
        decToRep(255, 2);

        //Output:
        // | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
        // | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
    }

    private static void decToRep(int decimalCode, int rep) {
        if (decimalCode <= 0) return;
        QueueLinkedList<Integer> queueList = new QueueLinkedList<>();
        while (decimalCode > 0) {
            Integer binOctCode = Integer.valueOf(decimalCode % rep);
            queueList.add(binOctCode);
            decimalCode /= rep;
        }
        queueList.traverseReverse();
    }
}