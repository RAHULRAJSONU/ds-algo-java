package datastructure.stack;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        while (!stack.isEmpty()){
            int val = stack.pop();
            System.out.println(val);
        }

        System.out.println("-----Generic Stack------");
        GenericStack<String> gs = new GenericStack<String>(String.class,10);
        gs.push("first");
        gs.push("second");
        gs.push("third");
        gs.push("fourth");
        gs.push("fifth");
        gs.push("sisth");
        while (!gs.isEmpty()){
            String val = gs.pop();
            System.out.println(val);
        }
    }


}
