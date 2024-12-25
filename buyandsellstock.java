public class buyandsellstock {
    public static int buyandsellstock (int arr[]) {
        int buyprice = Integer.MAX_VALUE ;
        int maxprofit = 0 ;
        for (int i =0 ; i<arr.length ; i++){
            if (buyprice < arr[i]) {
                int profit = arr[i] - buyprice ;
                maxprofit = Math.max(maxprofit, profit);
            }else {
                buyprice = arr [i];
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int arr [] = {7,6,4,3,1} ;
        int maxprofit = buyandsellstock(arr);
        System.out.println("max profit is : " + maxprofit);
    }
    
}
