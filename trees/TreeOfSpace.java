package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

class TreeOfSpace {
    static class TreeNode {
        String name;
        TreeNode parent;
        int ancestorCount;
        int descendantCount;
        int lockedBy;
        Boolean isLocked;

        ArrayList<TreeNode> children = new ArrayList<>();

        public TreeNode(String name, TreeNode parent) {
            this.name = name;
            this.parent = parent;
            this.ancestorCount = 0;
            this.descendantCount = 0;
            this.lockedBy = -1;
            this.isLocked = false;
        }
    }

    static Boolean lock(TreeNode node, int uid) {
        if (node.isLocked || node.ancestorCount > 0 || node.descendantCount > 0) {
            return false;
        }

        TreeNode curr = node.parent;
        while (curr != null) {
            curr.descendantCount++;
            curr = curr.parent;
        }

        updateDescAncestorCount(node, 1);

        node.isLocked = true;
        node.lockedBy = uid;

        return true;
    }

    static Boolean unlock(TreeNode node, int uid) {
        if (!node.isLocked || node.lockedBy != uid || node.ancestorCount > 0) {
            return false;
        }

        TreeNode curr = node.parent;
        while (curr != null) {
            curr.descendantCount--;
            curr = curr.parent;
        }

        updateDescAncestorCount(node, -1);

        node.isLocked = false;
        node.lockedBy = -1;

        return true;
    }

    static Boolean upgrade(TreeNode node, int uid) {
        if (node.isLocked || node.ancestorCount > 0 || node.descendantCount == 0) {
            return false;
        }

        List<TreeNode> lockedDesc = new ArrayList<>();
        for (TreeNode child : node.children) {
            if (!collectLockedDesc(child, lockedDesc, uid)) {
                return false;
            }

        }

        for (TreeNode desc : lockedDesc) {
            unlock(desc, uid);
        }

        lock(node, uid);

        return true;

    }

    static boolean collectLockedDesc(TreeNode node, List<TreeNode> lockedDesc, int uid) {
        if (node.isLocked) {
            if (node.lockedBy != uid)
                return false;
            lockedDesc.add(node);
        }

        for (TreeNode child : node.children) {
            if (!collectLockedDesc(child, lockedDesc, uid)) {
                return false;
            }
        }
        return true;
    }

    static void updateDescAncestorCount(TreeNode node, int val) {
        if (node == null)
            return;

        for (TreeNode child : node.children) {
            child.ancestorCount += val;
            updateDescAncestorCount(child, val);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();

        List<String> nodeNames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodeNames.add(sc.nextLine().trim());
        }

        Map<String, TreeNode> nameToNode = new TreeMap<>();

        TreeNode root = new TreeNode(nodeNames.get(0), null);
        nameToNode.put(root.name, root);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int idx = 1;
        while (!queue.isEmpty() && idx < n) {
            TreeNode curr = queue.poll();

            for (int j = 0; j < m && idx < n; j++) {
                TreeNode child = new TreeNode(nodeNames.get(idx), curr);
                curr.children.add(child);
                nameToNode.put(child.name, child);
                queue.offer(child);
                idx++;
            }
        }

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            String nodeName = sc.next();
            int userId = sc.nextInt();

            TreeNode node = nameToNode.get(nodeName);
            boolean result = false;

            if (type == 1) {
                result = lock(node, userId);
            } else if (type == 2) {
                result = unlock(node, userId);
            } else if (type == 3) {
                result = upgrade(node, userId);
            }

            System.out.println(result);
        }
    }
}
