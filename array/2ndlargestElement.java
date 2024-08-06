class Solution {
    public int print2largest(List<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max1) {
                max1 = arr.get(i);
            }
        }

    
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max2 && arr.get(i) < max1) {
                max2 = arr.get(i);
            }
        }

        return max2;
    }

    
}
