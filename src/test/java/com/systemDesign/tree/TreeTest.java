package com.systemDesign.tree;

import org.junit.jupiter.api.Test;

public class TreeTest {
    /*
                20
          10          40
        null  15   30  null
     */
    final Integer[] intList = {20, 10, 40, null, 15, 30};

    @Test
    public void testPrint() {
        /*
        How to print a binary tree on console?
        - initialize a tree from an array
        - in-order traversal
        - add indentation to nodes of different depths.
         */
        Tree tree = new Tree(intList);
        System.out.println(tree);
    }
}
