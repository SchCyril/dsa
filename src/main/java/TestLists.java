

void main() {

    List<Integer> linkedList = new LinkedList<>();
    List<Integer> arrayList = new ArrayList<>();

    long startTime;
    long endTime;
    long elapsedTime;

    for (int i = 0; i < 1_000_000; i++) {
        linkedList.add(i);
        arrayList.add(i);
    }

    // *************LinkedList*************
    startTime = System.nanoTime();

    // linkedList.getFirst();
    // linkedList.get(500_000)
    // linkedList.getLast();
    // linkedList.removeFirst();
    // linkedList.remove(500_000);
    linkedList.removeLast();

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("LinkedList : " + elapsedTime + " ns");

    // *************ArrayList*************

    startTime = System.nanoTime();

    // arrayList.getFirst();
    // arrayList.get(500_000);
    // arrayList.getLast();
    // arrayList.removeFirst();
     // arrayList.remove(500_000);
    arrayList.removeLast();

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("ArrayList : " + elapsedTime + " ns");

}
