import java.util.*;

public class QueueProcessor {
    // Метод для копирования элементов из очереди L1 в очередь L2 в обратном порядке
    public void reverseQueue(Queue<Integer> L1, Queue<Integer> L2) {
        Stack<Integer> stack = new Stack<>();  // Используем стек для инвертирования порядка

        // Переносим все элементы из L1 в стек
        while (!L1.isEmpty()) {
            stack.push(L1.poll());
        }

        // Переносим элементы из стека в L2
        while (!stack.isEmpty()) {
            L2.offer(stack.pop());
        }
    }
}