class Solution {
    public int findChampion(int n, int[][] edges) {
        // 한번도 진적 없는 노드가 이김
        int[] inDegree = new int[n];
        int answer = -1;
        int count = 0;
        for(int[] e : edges ) {
            inDegree[e[1]] ++;
        }
        // 0인거 찾기
        for(int i = 0 ; i < n ; i ++) {
            if(inDegree[i] == 0) {
                count += 1;
                answer = i;

            }
            
       
        
    }
    // 챔피언 후보가 두 개 이상이거나 없을 경우
        if(count == 1) return answer;
        return -1;

        // 두개 이상의 우승 노드가 나옴 -> -1
}
}
