class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        
        generateRow(result, 0, numRows);
        
        return result;
    }
    
    public void generateRow(List<List<Integer>> result, int depth, int numRows) {
        if(depth == numRows) {
            return;
        }
        List<Integer> currentRow = new ArrayList<>();
        for(int i = 0; i <= depth; i++) {
            if(i == 0 || i == depth) {
                currentRow.add(1);
            } else {
                currentRow.add(result.get(depth-1).get(i-1) + result.get(depth-1).get(i));
            }
        }
        result.add(currentRow);
        generateRow(result, depth + 1, numRows);
    }
}