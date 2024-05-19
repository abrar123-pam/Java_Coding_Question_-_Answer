package Day7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void printStack(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.print(element + " ");
            tempStack.push(element);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        System.out.println();
    }

    public static void deleteFromStack(int num, Stack<Integer> stack){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (top != num) {
                tempStack.push(top);
            }
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    private static int searchFromStack(Stack<Integer> stack, int element) {
        Stack<Integer> tempStack = new Stack<>();
        int position = 1;
        boolean found = false;

        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (top == element) {
                found = true;
                break;
            }
            tempStack.push(top);
            position++;
        }

        // Restore the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return found ? position : -1;
    }

    public static void printQueue(Queue<Integer> queue) {
        for (Integer elem : queue) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void deleteFromQueue(int num, Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Queue<Integer> tempQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int front = queue.poll();
            if (front != num) {
                tempQueue.add(front);
            }
        }

        queue.addAll(tempQueue);
    }

    private static int searchFromQueue(Queue<Integer> queue, int element) {
        int position = 1;
        boolean found = false;

        for (Integer elem : queue) {
            if (elem == element) {
                found = true;
                break;
            }
            position++;
        }

        return found ? position : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        boolean mainFlag = true;

        while (mainFlag) {
            System.out.println("1. Stack Operation \n2. Queue Operation\n3. Exit");
            int get = sc.nextInt();

            if (get == 1) {
                boolean stackFlag = true;
                while (stackFlag) {
                    System.out.println("1. Insert\n2. Delete\n3. Check Empty\n4. Top\n5. Search\n6. Exit Stack Operations");
                    int n = sc.nextInt();

                    switch (n) {
                        case 1:
                            boolean check = true;
                            System.out.println("Enter numbers to insert (Enter 0 to stop):");
                            while (check) {
                                int ins = sc.nextInt();
                                if (ins == 0) {
                                    check = false;
                                } else {
                                    stack.push(ins);
                                }
                            }
                            break;

                        case 2:
                            printStack(stack);
                            System.out.println("Enter the number you want to delete:");
                            int del = sc.nextInt();
                            deleteFromStack(del, stack);
                            printStack(stack);
                            break;

                        case 3:
                            if (!stack.isEmpty()) {
                                System.out.println("Stack is not empty:");
                                printStack(stack);
                            } else {
                                System.out.println("Stack is empty");
                            }
                            break;

                        case 4:
                            if (!stack.isEmpty()) {
                                System.out.println("Top element: " + stack.peek());
                            } else {
                                System.out.println("Stack is empty");
                            }
                            break;

                        case 5:
                            System.out.println("Enter the element you want to search:");
                            int search = sc.nextInt();
                            int ans = searchFromStack(stack, search);
                            if (ans != -1) {
                                System.out.println("Element found at position: " + ans);
                            } else {
                                System.out.println("Element not found in the stack");
                            }
                            break;

                        case 6:
                            System.out.println("Exiting stack operations...");
                            stackFlag = false;
                            break;

                        default:
                            System.out.println("Enter a valid number");
                    }
                }
            } else if (get == 2) {
                boolean queueFlag = true;
                while (queueFlag) {
                    System.out.println("1. Insert\n2. Delete\n3. Check Empty\n4. Front\n5. Search\n6. Exit Queue Operations");
                    int n = sc.nextInt();

                    switch (n) {
                        case 1:
                            boolean check = true;
                            System.out.println("Enter numbers to insert (Enter 0 to stop):");
                            while (check) {
                                int ins = sc.nextInt();
                                if (ins == 0) {
                                    check = false;
                                } else {
                                    queue.add(ins);
                                }
                            }
                            break;

                        case 2:
                            printQueue(queue);
                            System.out.println("Enter the number you want to delete:");
                            int del = sc.nextInt();
                            deleteFromQueue(del, queue);
                            printQueue(queue);
                            break;

                        case 3:
                            if (!queue.isEmpty()) {
                                System.out.println("Queue is not empty:");
                                printQueue(queue);
                            } else {
                                System.out.println("Queue is empty");
                            }
                            break;

                        case 4:
                            if (!queue.isEmpty()) {
                                System.out.println("Front element: " + queue.peek());
                            } else {
                                System.out.println("Queue is empty");
                            }
                            break;

                        case 5:
                            System.out.println("Enter the element you want to search:");
                            int search = sc.nextInt();
                            int ans = searchFromQueue(queue, search);
                            if (ans != -1) {
                                System.out.println("Element found at position: " + ans);
                            } else {
                                System.out.println("Element not found in the queue");
                            }
                            break;

                        case 6:
                            System.out.println("Exiting queue operations...");
                            queueFlag = false;
                            break;

                        default:
                            System.out.println("Enter a valid number");
                    }
                }
            } else if (get == 3) {
                System.out.println("Exiting...");
                mainFlag = false;
            } else {
                System.out.println("Enter a valid option");
            }
        }
    }
}
