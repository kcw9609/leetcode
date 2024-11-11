// class Solution {
//     public int maxProfit(int[] prices) {
//         // 매수일찾기
//             // 오른쪽에서 한칸씩 비교
//             // 두 포인터가 교차하면 오른쪽 포인터 한칸 왼쪽
//             // 오포가 위치가 0이되면 그만

//             // 나온 값을 비교하여 저장
//         int left =0;
//         int right = prices.length -1 ;
//         int profit = 0;
//         while(right !=0 ){
//             for(int i =0; i< right ; i ++ ) {
//                 if((prices[i] < prices[right]) && profit < (prices[right] - prices[i])) {
//                     profit = prices[right] - prices[i];
//                 }
//             }
//             right = right - 1;
//         }
//         return profit;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        // 매수일찾기
            // 오른쪽에서 한칸씩 비교
            // 두 포인터가 교차하면 오른쪽 포인터 한칸 왼쪽
            // 오포가 위치가 0이되면 그만

            // 나온 값을 비교하여 저장
        int buy = prices[0];
        int profit = 0;

            for(int i = 1; i< prices.length ; i ++ ) {
                if(prices[i] < buy) { // 다음게 산것보다 작으면 교체
                    buy = prices[i];
                    
                }else if((prices[i] - buy) > profit) { // 다음게 값이 크고 & 이윤이 높으면 교체
                        profit = prices[i] - buy;
                    }
            }

        return profit;
    }
}