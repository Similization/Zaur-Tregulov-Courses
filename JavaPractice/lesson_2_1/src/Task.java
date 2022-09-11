import java.security.KeyPair;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;



enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private static int sum = 0;

    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {}

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private static long sum = 1;
    private final int STRANGE_CONST = 1_000_000_007;

    public int getResult() {
        return (int) sum;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor()==Color.RED) {
            sum = (sum * node.getValue()) % STRANGE_CONST;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor()==Color.RED) {
            sum = (sum * leaf.getValue()) % STRANGE_CONST;
        }
    }
}

class FancyVisitor extends TreeVis {
    private static long sum = 0;

    public int getResult() {
        return (int) Math.abs(sum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            sum -= node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            sum += leaf.getValue();
        }
    }
}

class Solution {

    public static Tree solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] integers = new int[n];
        Color[] colors = new Color[n];

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            integers[i] = val;
        }
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val == 0) {
                colors[i] = Color.RED;
                continue;
            }
            colors[i] = Color.GREEN;
        }


        ArrayList<Tree> treeNodes = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            treeNodes.add(null);
        }
        treeNodes.set(0, new TreeNode(
                integers[0],
                colors[0],
                0
        ));

        class Pair implements Comparator<Pair>, Comparable<Pair> {
            private final int x;
            private final int y;
            Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }
            int getFirst() {
                return x;
            }
            int getSecond() {
                return y;
            }

            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.x == o2.x) {
                    return o1.y - o2.y;
                }
                return o1.x - o2.x;
            }

            @Override
            public int compareTo(Pair o) {
                if (x == o.x) {
                    return y - o.y;
                }
                return x - o.x;
            }

            @Override
            public String toString() {
                return "Pair{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }
        }

        ArrayList<Pair> pairs = new ArrayList<>(n-1);
        HashSet<Integer> nodes = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            int first = scanner.nextInt() - 1;
            pairs.add(new Pair(first, scanner.nextInt() - 1));
            nodes.add(first);
        }
        Collections.sort(pairs);
        // System.out.println(pairs);

        for (int i = 0; i < n - 1; i++) {
            int x = pairs.get(i).x;
            int y = pairs.get(i).y;

            Tree node;
            if (nodes.contains(y)) {
                node = new TreeNode(
                        integers[y],
                        colors[y],
                        treeNodes.get(x).getDepth() + 1
                );
            } else {
                node = new TreeLeaf(
                        integers[y],
                        colors[y],
                        treeNodes.get(x).getDepth() + 1
                );
            }
            treeNodes.set(y, node);
            ((TreeNode)(treeNodes.get(x))).addChild(node);


        }
        // System.out.println(treeNodes);

        return treeNodes.get(0);

    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);


    }
}

public class Task { }
