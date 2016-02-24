package dcll.bsai;

/**
 * Created by benjaminsaint-sever on 24/02/2016.
 */
public class MyStack implements SimpleStack{

    private int maxSize;
    private Item[] stackArray;
    private int top;
    public MyStack(int s) {
        maxSize = s;
        stackArray = new Item[maxSize];
        top = -1;
    }
    public void push(Item item) {
        stackArray[++top] = item;
    }
    public Item pop() {
        return stackArray[top--];
    }
    public Item peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public int getSize(){
        return top;
    }
}
