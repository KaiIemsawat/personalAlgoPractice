package leetcode;

public class Leet1342_NumberOfSteps {
    public static void main(String[] args) {
        int input = 14;

        System.out.println(numberOfSteps(input));
    }

    public static int numberOfSteps(int num) {
        if (num == 0) return num;

        int count = 0;
        while (num > 0) {
            if (num%2 != 0) {
                num--;
            } else {
                num/=2;
            }
            count++;
        }
        return count;
    }

//    public static int numberOfSteps(int num) {
//        return recursiveReduce(num, 0);
//    }
//
//    private static int recursiveReduce(int num, int count) {
//        if (num == 0)  return count ;
//
//        if (num%2 == 0) {
//            num/=2;
//        }else{
//            num--;
//        }
//        return recursiveReduce(num, ++count);
//    }
}
