package com.kshitiz;

public class Matrixdiasum {
    public static void main(String[] args) {
        int []
    }
    static int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if (i==j){
                    sum = sum + mat[i][j];
                }
            }
        }
        for (int i=0;i<mat.length;i++){
            for (int j=mat[0].length-1;j>=0;j--){
                if (i+j==(mat[i].length-1)){

                    sum = sum + mat[i][j];
                }

            }
        }

        return sum;
    }
}
