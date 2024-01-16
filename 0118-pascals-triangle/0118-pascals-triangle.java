class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        
        dfs(result, 0, numRows);
        
        return result;
    }
    
    public void dfs(List<List<Integer>> result, int depth, int numRows) {
        if(depth == numRows) {
            return;
        }
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i <= depth; i++) {
            if(i == 0 || i == depth) {
                temp.add(1);
            } else {
                temp.add(result.get(depth-1).get(i-1) + result.get(depth-1).get(i));
            }
        }
        result.add(temp);
        dfs(result, depth+1, numRows);
    }
}