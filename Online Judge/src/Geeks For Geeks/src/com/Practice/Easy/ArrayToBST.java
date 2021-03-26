package com.Practice.Easy;

import java.util.ArrayList;

public class ArrayToBST {
    class Solution {
        class TreeNode {
            int data;
            TreeNode left, right;

            TreeNode(int data) {
                this.data = data;
            }
        }

        public int[] sortedArrayToBST(int[] nums) {
            TreeNode root = makeBST(nums, 0, nums.length - 1);
        }

        private TreeNode makeBST(int[] nums, int start, int end) {
            if (start > end) return null;

            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left = makeBST(nums, start, end - 1);
            root.right = makeBST(nums, mid + 1, end);

            return root;
        }

        private int[] preorder(TreeNode root) {

        }
    }
}
