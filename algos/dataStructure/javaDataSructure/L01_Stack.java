import java.util.Stack;

public class L01_Stack {
    public static void main(String[] args) {
//        Stack :
//        Last in first out
        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println(stack);

        System.out.println("pop -- take the last out");
        stack.pop();
        System.out.println(stack);
        System.out.println("the one that is pop() can be used");
        System.out.println(stack.pop());
        System.out.println("and that is gone");
        System.out.println(stack);
        System.out.println("to get the top value without pop it out, use peek()");
        System.out.println(stack.peek());
        System.out.println("the value still remain");
        System.out.println(stack);
        System.out.println("search() is use to get the position");
        System.out.println("Note 1.. start with 1 not 0. \nNote 2.. the last one added is 1");
        System.out.println(stack.search("c"));
        System.out.println("if the value is not found, it will return '-1'");
        System.out.println(stack.search("1"));
    }
}
