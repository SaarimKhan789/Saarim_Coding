import java.util.*;
public class SumOfAllSubsetsXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=SumOfXorSubsets(arr,n);
        System.out.println(ans);
    }
    public static int SumOfXorSubsets(int []arr,int n){

        int sum=0;

        for(int i=0;i<n;i++){
            sum |=arr[i];
        }

        int ans=sum*(int)Math.pow(2,n-1);
        return ans;
    }
}
