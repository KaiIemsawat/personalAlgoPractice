package HackerR.recursion;

import java.util.ArrayList;
import java.util.List;

public class ThePowerSum {
    public static void main(String[] args) {

        int input = 100, power = 2;

        System.out.println(powerSum(input, power));
    }

    public static int powerSum(int X, int N) {
        List<Integer> ans = new ArrayList<>();

        helper(X, 0, 1, N, ans);

        return ans.size();

    }

    static void helper(int x, int sum, int start, int n, List<Integer> ans ){
        if(sum == x){
            ans.add(1);
            return;
        }

        if(sum> x) return;

        for(int i = start; i*i<=x; i++){
            int val = (int)Math.pow(i,n);
            helper(x, sum + val,i+1,n, ans );
        }
    }
}
