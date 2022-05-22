import java.util.*;
public class Leader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Leader(arr,n);
    }
    public static void Leader(int[]arr,int n){
        
        int max=arr[n-1];
        Stack<Integer> ans=new Stack<>();

        ans.push(max);

        for(int i=n-2;i>=0;i--){
            if(max<arr[i]){
            max=arr[i];
            ans.push(max);
            }   
        }

        while(ans.isEmpty()==false){
            System.out.print(ans.pop()+" ");
        }


    }

}
