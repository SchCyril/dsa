
/*
Queue = FIFO data structure. (First-In, First-Out)
Designed for Holding element prior to processing
Linear data Structure

Dequeue (remove)
Enqueue (add)

Uses of Queue ?
1. Keyboard Buffer ( letters should apêar on the screen in the order they're pressed )
2. Printer Queue ( Job should be completed in order )
3. Used in LinkedLists, PriorityQueues, Breadth-First search

*/

void main() {
    Queue<String> queue = new LinkedList<>();

    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    // To look at the first/next in the queue
    System.out.println(queue.peek());

    // Remove the first/next element in the queue
    queue.poll();
    System.out.println(queue);

    // Queue extend Collection :
    // Check if the queue is empty
    System.out.println(queue.isEmpty());

    // check the size of the queue
    System.out.println(queue.size());

    // check if the queue contains element
    System.out.println(queue.contains("Steve"));

}
