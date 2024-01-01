package com.kshitiz.assignments;

import java.util.Scanner;

public class Volumes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true){
            System.out.println("Enter the number to find volume: ");
            System.out.println("1.Cone 2.Prism 3.Cylinder 4.Sphere 5. Pyramid");
            int num = in.nextInt();
            switch (num){
                case 1:
                    System.out.print("Enter the height of cone: ");
                    float hcone = in.nextFloat();
                    System.out.print("Enter the radius of cone: ");
                    float rcone = in.nextFloat();
                    double vcone = (float) ((0.33)*3.14*rcone*rcone*hcone);
                    System.out.println("Volume of cone is "+vcone);
                    break;

                case 2:
                    System.out.println("Enter the base area: ");
                    float bprism = in.nextFloat();
                    System.out.println("Enter the height : ");
                    float hprism = in.nextFloat();
                    double vprism = bprism*hprism;
                    System.out.println("Volume of prism is:"+ vprism);
                    break;

                case 3:
                    System.out.println("Enter the radius of the cylinder: ");
                    float rcylin = in.nextFloat();
                    System.out.println("Enter the height of the cylinder");
                    float hcylin = in.nextFloat();
                    double vcylin = 3.14*rcylin*rcylin*hcylin;
                    System.out.println("Volume of the cylinder is "+vcylin);
                    break;

                case 4 :
                    System.out.println("Enter the radius of the sphere: ");
                    float rsph = in.nextFloat();
                    double vsph = 0.75* 3.14*rsph*rsph*rsph;
                    System.out.println("Volume of the Sphere is "+vsph);
                    break;

                case 5:
                    System.out.println("Enter the base area of the pyramid: ");
                    float bpyr = in.nextFloat();
                    System.out.println("Enter the height of the cylinder");
                    float hpyr = in.nextFloat();
                    double vpyr = 0.33*hpyr*bpyr;
                    System.out.println("Volume of the pyramid is "+vpyr);
                    break;

                default:
                    System.out.println("Enter the correct operation");

            }
        }
    }
}
