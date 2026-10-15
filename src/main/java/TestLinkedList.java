


void main() {

    // LinkedList have acces to List<E>, Deque<E>, Cloneable, java.io.Serializable méthodes

    LinkedList<String> linkedList = new LinkedList<>();

    // push() == addFirst
    /* linkedList.push("A");
    linkedList.push("B");
    linkedList.push("C");
    linkedList.push("D");
    linkedList.push("F");*/

    // offer() == addLast
    linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    linkedList.offer("F");

    // remove the next / first element
    //    linkedList.pop();

    // insert the element at the index
    linkedList.add(4, "E");


    // remove the element
    linkedList.remove("B");

    // Search an element
    System.out.println(linkedList.indexOf("F"));

    // Get the first element
    System.out.println(linkedList.peekFirst());

    // Get the last element
    System.out.println(linkedList.peekLast());

    // Add an element at the beginning
    linkedList.addFirst("0");

    // Add an element at the end
    linkedList.addLast("Z");

    // Remove the first element
    //linkedList.removeFirst();

    // remove the last element
    //linkedList.removeLast();

     IO.println(linkedList);
}
