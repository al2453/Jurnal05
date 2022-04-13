package Soal1.jurnal05;

public class Stack {
    private final char[] dataStack;
    private int top;

    public Stack(int batas) {
        dataStack = new char[batas];
        top = 0;
    }

    public void push(char A) {
        dataStack[++top] = A;
    }

    public char pop() {
        return dataStack[top--];
    }

    public boolean isEmpty() {
        return (top == 0);
    }

}
