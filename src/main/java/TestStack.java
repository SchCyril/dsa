/*stack : LIFO (Last-in, First-out) data structure
        stores objetcs into a sort of " vertical tower"


Uses of Stacks ?
1. undo / redo features in text editors
2. moving back/forward through browser history
3.*/

void main() {
    Stack<String> stack = new Stack<>();

    stack.push("HS");
    stack.push("GTAV");
    stack.push("CS2");
    stack.push("WoW");
    stack.push("FIFA");

    // check if the stack is empty
    //System.out.println(stack.isEmpty());

    //remove the last element from the stack
    stack.pop();
    IO.println(stack);

    // just add the last element into a new variable by deleting from the stack
    String myFavGame = stack.pop();
    IO.println(myFavGame);

    // just view the last element from the stack
    IO.println(stack.peek());

    // Search the index from the top of the stack | return -1 if the object does not exists
    IO.println(stack.search("CS2"));


}
