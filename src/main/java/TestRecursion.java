
/*

    Recursion = Apply the result of a procedure, to a procedure.
                A recursive method call itself. Can be a  substitute for iteration
                Divide a problem into a sub problems of the sale type as the original
                Commonly used with advanced sorting algorithms and navigating trees

                Advantages :
                1. easier du read / write
                2. easier to debug

                Disadvantages
                1. Sometimes slower
                2. Uses more memory

 */

void main() {


//    walkIteration(5);
    System.out.println("-------------------------");
//    walkRecursion(5);
    System.out.println("-------------------------");
    System.out.println(factorial(7));

}

private int factorial(int num) {

    if(num < 1 ) return 1; // base case
    return num * factorial(num - 1); // recursive


}


// Iteration
//private void walkIteration(int steps) {
//    for (int i = 0; i < steps; i++) System.out.println("Tou take a step in iteration");
//}

// recursion
//private void walkRecursion(int steps) {
//
//    if(steps < 1) return; // base case
//    System.out.println("You take a step in recursion");
//    walkRecursion(steps - 1); // recursive
//}
