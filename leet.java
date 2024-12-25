

import java.util.Arrays;

class Solution {
    public static void twosum (int arr[] , int target){
        Arrays.sort(arr);
        int n = arr.length ;
        int l = 0 ;
        int r = n-1 ;
        while(l < r){
            int sum = arr[l]+arr[r] ;
            if (sum == target) {
                System.out.println( "(" + l + "," + r + ")" );
                return ;
            }
            else if (sum < target){
                l++;
            }
            else {
                r-- ;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4} ;
    twosum(arr, 7);
    }
}