class StackFullException extends Exception {
  public StackFullException(String message) {
      super(message);
  }

  @Override
  public String toString() {
      return "StackFullException: " + getMessage();
  }
}

class StackEmptyException extends Exception {
  public StackEmptyException(String message) {
      super(message);
  }

  @Override
  public String toString() {
      return "StackEmptyException: " + getMessage();
  }
}

class Stack {
  private int[] stackArray;
  private int top;
  private int maxSize;

  public Stack(int size) {
      this.maxSize = size;
      this.stackArray = new int[size];
      this.top = -1;
  }

  public void push(int value) throws StackFullException {
      if (top == maxSize - 1) {
          throw new StackFullException("Stack is full. Cannot push " + value);
      }
      stackArray[++top] = value;
      System.out.println("Pushed " + value + " into stack.");
  }

  public int pop() throws StackEmptyException {
      if (top == -1) {
          throw new StackEmptyException("Stack is empty. Cannot pop.");
      }
      System.out.println("Popped " + stackArray[top] + " from stack.");
      return stackArray[top--];
  }
}

public class Demo3 {
  public static void main(String[] args) {
      Stack stack = new Stack(3);

      try {
          stack.push(10);
          stack.push(20);
          stack.push(30);
          stack.push(40);
      } catch (StackFullException e) {
          System.out.println(e);
      }

      try {
          stack.pop();
          stack.pop();
          stack.pop();
          stack.pop();
      } catch (StackEmptyException e) {
          System.out.println(e);
      }
  }
}
