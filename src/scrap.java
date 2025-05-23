import java.util.ArrayList;

// Stack class
class MyStack {
    private int length;
    private final ArrayList<Character> items;

    public MyStack(){
        this.length = 0;
        this.items = new ArrayList<Character>();
    }

    // Insert a character to the top (end) of the stack
    public void push(char character){
        this.items.add(character);
        this.length++;
    }

    // Remove and return the top character from the stack
    public void pop(){
        char popped = this.items.get(this.length);
        this.items.remove(this.length);
        this.length--;
    }

    // Show the top character in the stack
    public char peak(){
        return this.items.get(this.length);
    }

    public int size(){
        return this.length;
    }
}

class Solution {
    public boolean isValid(String input) {
        MyStack stack = new MyStack();
        for(int i=0; i < input.length(); i++){
            if(input.charAt(i) == '(' || input.charAt(i)  == '{' || input.charAt(i)  == '['){
                stack.push(input.charAt(i));
            }
            else if(input.charAt(i)  == ')' || input.charAt(i)  == '}' || input.charAt(i)  == ']'){
                if(stack.size() == 0){
                    return false;
                }
                else{
                    stack.pop();
                }
            }


        }

        if(stack.size() == 0){
            return true;
        } else{
            return false;
        }
    }
}