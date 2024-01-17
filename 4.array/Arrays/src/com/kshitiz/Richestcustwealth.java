package com.kshitiz;

public class Richestcustwealth {
    public static void main(String[] args) {
     int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}}  ;
     int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
//        int sum1 = 0;
//        int sum2 =0;
//        int sum3=0;
//        for (int i=0; i<accounts.length;i++){
//            for (int j=0; j<accounts[i].length; j++){
//                if (i==0){
//                sum1 = sum1 + accounts[i][j];
//                } else if (i==1) {
//                    sum2 = sum2 + accounts[i][j];
//                } else if (i==2) {
//                    sum3 = sum3 + accounts[i][j];
//                }
//            }
//        }
//        System.out.println("1st customer has wealth = "+sum1);
//        System.out.println("2n customer has wealth = "+sum2);
//        System.out.println("3rd customer has wealth = "+sum3);
//        if (sum1==sum2 || sum2==sum3){
//            System.out.println("All customer are considered richest with a wealth of "+sum1);
//            return sum1;
//        } else if (sum1>sum2 && sum2>sum3) {
//            System.out.println("1st customer has wealth = "+sum1);
//            return sum1;
//        } else if (sum1>sum2 && sum3>sum2) {
//            System.out.println("1st customer has wealth = "+sum1);
//            return sum1;
//        } else if (sum2>sum1 && sum1>sum3) {
//            System.out.println("2nd customer has wealth = "+sum2);
//            return sum2;
//
//        } else if (sum2>sum3 && sum3>sum1) {
//            System.out.println("2nd customer has wealth = "+sum2);
//            return sum2;
//        }else {
//            System.out.println("3rd customer has wealth = "+ sum3);
//            return sum3;
//        }
        int res = 0;
        for(int i =0;i<accounts.length;i++){
            int temp = 0;
            for(int j = 0;j<accounts[i].length;j++){
                temp+=accounts[i][j];
            }
            res = Math.max(res,temp);
        }
        return res;
    }
}
