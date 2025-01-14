class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seenSet = new HashSet<>();
        
        for (int num : arr) {
            // Check if the current number has a matching double or half in the set
            if (seenSet.contains(num * 2) || (num % 2 == 0 && seenSet.contains(num / 2))) {
                return true;
            }
            // Add the current number to the set
            seenSet.add(num);
        }
        
        return false;
    }
}
