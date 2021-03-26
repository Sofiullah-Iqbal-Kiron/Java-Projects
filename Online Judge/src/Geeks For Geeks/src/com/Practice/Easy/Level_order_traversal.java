// Correct Answer
// This tutorial has helped me a lot: https://youtu.be/gcR28Hc2TNQ : Look at the link deeply.
// Execution time: 0.25 ms
// Gotta message from gfg: Your current score is 72. Score 28 more to get access to premium Jobs portal and stand a
// chance to get your dream placement.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/JbNZ2RMHZg/


package com.Practice.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Level_order_traversal {}

class Solution {
    static ArrayList<Integer> levelOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> levels = new LinkedList<>();
        levels.offer(node);

        while (!levels.isEmpty()) {
            if (levels.peek().left != null) levels.offer(levels.peek().left);
            if (levels.peek().right != null) levels.offer(levels.peek().right);
            if (levels.peek() != null) ans.add(levels.poll().data);
        }

        return ans;
    }
}