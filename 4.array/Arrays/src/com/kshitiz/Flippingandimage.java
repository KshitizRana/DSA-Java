package com.kshitiz;
//https://leetcode.com/problems/flipping-an-image/description/
public class Flippingandimage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flip = new int[image[0].length][image.length];

        for (int row = 0;row<image.length;row++){
            int  k =0;
            for (int col = image[row].length-1; col>=0;col--){
                flip[row][k++]=image [row][col];
            }
        }
        for (int i=0;i<flip.length;i++){
            for (int j=0;j<image[i].length;j++){
                if (flip[i][j]==1) {
                    flip[i][j]=0;
                }
                else if (flip[i][j]==0) {
                    flip[i][j]=1;
                }
            }
        }
        return flip;
    }
}
