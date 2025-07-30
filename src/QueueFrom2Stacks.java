import java.util.Stack;

public class QueueFrom2Stacks {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public QueueFrom2Stacks() {
        this.inputStack = new Stack<>();
        this.outputStack = new Stack<>();
    }

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        if (this.outputStack.isEmpty()) {
            transfer();
        }
        return this.outputStack.pop();
    }

    public int peek() {
        if (this.outputStack.isEmpty()) {
            transfer();
        }
        return outputStack.peek();
    }

    public boolean empty() {
        return this.outputStack.isEmpty() && this.inputStack.isEmpty();
    }

    private void transfer() {
        while (!inputStack.isEmpty()) {
            // reverses the elements order
            outputStack.push(inputStack.pop());
        }
    }

}

/**
 * QueueFrom2Stacks obj = new QueueFrom2Stacks();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
*/
