/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/** 
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int[] array = IntStream.rangeClosed(1, n).toArray();
        
        int left = 0;
        int right = array.length - 1 ;
        boolean current = isBadVersion(array[n/2]);
        int index = 0;

        if(n==1)return 1;

        while (left <= right) {
        int mid = (left + right) / 2; // 매번 mid를 재계산
        boolean midValue = isBadVersion(array[mid]); // mid의 상태 확인

        if (midValue != current) { 
            if(midValue == true) return array[mid];
            return array[index]; 
        }

        if (midValue) {
            right = mid - 1; 
        } else {
            left = mid + 1; 
        }
        current = isBadVersion(array[mid]);
        index = mid;
    }

    return -1; 
}
}*/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int firstBad = -1;
        int left = 1;
        int right = n;

        while( left <= right ) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) { // bad
               firstBad = mid;
               right = mid - 1;

            }else {
                left = mid + 1;
            }
        } 

        return firstBad; 
}
        
    }





















