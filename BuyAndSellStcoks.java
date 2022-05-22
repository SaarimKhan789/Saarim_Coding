import java.util.*;
public class BuyAndSellStcoks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        int ans=BestTime(arr,n);
        System.out.println(ans);

    }
    public static int BestTime(int[]arr,int n){

        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
    
        for(int i=0;i<arr.length;i++){
            
            minprice=Math.min(minprice,arr[i]);
            int profit=arr[i]-minprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        
        return maxprofit;
    }
}
