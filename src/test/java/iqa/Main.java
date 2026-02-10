package iqa;

import java.util.*;

class Main {

    public static String TreeConstructor(String[] strArr) {
        // __define-ocg__ required keyword
        // __define-pcb__ required keyword

        Map<Integer, Integer> childToParent = new HashMap<>();
        Map<Integer, Integer> parentChildCount = new HashMap<>();

        String varOcg = "OCG_FLAG";   // required variable
        String varPcb = "PCB_FLAG";   // required variable
        boolean varFiltersCg = true;  // required variable

        for (String pair : strArr) {
            pair = pair.replace("(", "").replace(")", "");
            String[] nums = pair.split(",");

            int child = Integer.parseInt(nums[0]);
            int parent = Integer.parseInt(nums[1]);

            // Child must have only one parent
            if (childToParent.containsKey(child)) {
                return "false";
            }
            childToParent.put(child, parent);

            // Parent can have at most two children
            parentChildCount.put(parent, parentChildCount.getOrDefault(parent, 0) + 1);
            if (parentChildCount.get(parent) > 2) {
                return "false";
            }
        }

        // Check for exactly one root
        Set<Integer> parents = parentChildCount.keySet();
        Set<Integer> children = childToParent.keySet();

        int rootCount = 0;
        for (int p : parents) {
            if (!children.contains(p)) {
                rootCount++;
            }
        }

        return rootCount == 1 ? "true" : "false";
    }

    public static void main(String[] args) {
        // Sample test input
        String[] strArr = {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};

        System.out.print(TreeConstructor(strArr));
    }
}
