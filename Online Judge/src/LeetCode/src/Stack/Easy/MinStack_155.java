// Accepted in second attempt.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/dGJ2v7rXKX/
// Helpful discuss: https://leetcode.com/problems/min-stack/discuss/49010/Clean-6ms-Java-solution


package Stack.Easy;

public class MinStack_155
{
    class MinStack
    {
        private Node head;

        public void push(int x)
        {
            if (head == null)
                head = new Node(x, x);
            else
                head = new Node(x, Math.min(x, head.min), head);
        }

        public void pop()
        {
            head = head.next;
        }

        public int top()
        {
            return head.value;
        }

        public int getMin()
        {
            return head.min;
        }

        private class Node
        {
            int value, min;
            Node next;

            Node(int value, int min)
            {
                this.value = value;
                this.min = min;
            }

            Node(int value, int min, Node next)
            {
                this.value = value;
                this.min = min;
                this.next = next;
            }
        }
    }
}
