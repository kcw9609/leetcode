class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // set
        int left = 0, right = arr.length -k;


        // sort
        // 반복
        // 이진 탐색
        while(left < right) {
            int mid = (left + right) /2;
            if(x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        // Arrays.stream(A, left, left + k) 배열 A로부터 지정된 범위의 원소를 포함하는 스트림 생성
        // .boxed() 스트림의 각 기본 타입 원소를 래퍼 클래스인 INTEGER 객체로 변환 이유: Collercors.toList는 객체만 처리 가능
        return Arrays.stream(arr, left, left + k).boxed().collect(Collectors.toList());
        


        
    }
}