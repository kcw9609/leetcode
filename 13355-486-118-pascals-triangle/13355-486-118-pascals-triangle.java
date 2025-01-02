class Solution {
    public List<List<Integer>> generate(int numRows) {
        // 1 + 이전 배열의 두 수가 합쳐짐 + 1

        // set
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        List<Integer> prev = new ArrayList<Integer>();

        if (numRows <= 0)  return output;
        
        prev.add(1);
        output.add(prev);

        for(int i = 1 ; i < numRows ; i ++ ) { 
            List<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            // 중간값 계산
            for(int j = 0 ; j <prev.size() - 1 ; j ++ ) {
                cur.add(prev.get(j) + prev.get(j + 1));

            }
            cur.add(1);

            output.add(cur);
            prev = cur;


        }
        return output;
        
        
        
    }
}