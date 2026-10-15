/*
Priority Queue : A FIFO data sstructure that serves elements with the hightes priority first
before element with lower priority
 */

void main() {

    Queue<String> queue = new PriorityQueue<>(/*Collections.reverseOrder()*/); // affiche dans l'odre croissant | faire un comparator pour décroisant

   /* queue.offer(3.0);
    queue.offer(2.5);
    queue.offer(4.5);
    queue.offer(1.5);
    queue.offer(2.0);*/

    queue.offer("B");
    queue.offer("C");
    queue.offer("A");
    queue.offer("F");
    queue.offer("D");
    queue.offer("G");

    while(!queue.isEmpty()) {
        System.out.println(queue.poll());
    }

}
