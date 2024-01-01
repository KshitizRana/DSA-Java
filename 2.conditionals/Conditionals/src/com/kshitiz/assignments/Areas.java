package com.kshitiz.assignments;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number to print area");
            System.out.println("1.Circle 2.Triangle 3.Rectangle 4.Parallelogram 5.Rhombus 6.Equilateral triangle 7.CSA of cylinder 8.TSA of cube");
            int choice = in.nextInt();
            switch (choice){
                case 1 :
                    System.out.print("Enter Radius: ");
                    float rad = in.nextFloat();
                    double area = 3.14f*rad*rad;
                    System.out.println("Area of circle is "+area);
                    break;

                case 2:
                    System.out.print("Enter height: ");
                    float htria = in.nextFloat();
                    System.out.print("Enter base: ");
                    float btria = in.nextFloat();
                    double atri =0.5 * htria*btria;
                    System.out.println("Area of triangle is: "+atri);
                    break;

                case 3:
                    System.out.print("Enter length: ");
                    float lrect = in.nextFloat();
                    System.out.print("Enter breadth: ");
                    float brect = in.nextFloat();
                    float arect = lrect*brect;
                    System.out.println("Area of rectangle is: "+arect);
                    break;

                case 4:
                    System.out.print("Enter height: ");
                    float hpplgm = in.nextFloat();
                    System.out.print("Enter difference btw parallel sides: ");
                    float difp = in.nextFloat();
                    double apllgm =0.5 * hpplgm*difp;
                    System.out.println("Area of Parallelogram is: "+apllgm);
                    break;

                case 5:
                    System.out.print("Enter height: ");
                    float hrho = in.nextFloat();
                    System.out.print("Enter base: ");
                    float brho = in.nextFloat();
                    double arho = hrho*brho;
                    System.out.println("Area of Rhombus is: "+arho);
                    break;

                case 6:
                    System.out.print("Enter side: ");
                    float a = in.nextFloat();
                    double aequi = (float) ((float) ((Math.pow(3, 0.5)) / 4) * Math.pow(a, 2));
                    System.out.println("Area of triangle is: "+aequi);
                    break;

                case 7:
//                    System.out.println("CSA of Cylinder: ");
                    System.out.print("Enter the radius: ");
                    float rcylin= in.nextFloat();
                    System.out.println("Enter the height of the cylinder:");
                    float hcylin = in.nextFloat();
                    double acylin = (float) (2*3.14 *rcylin*hcylin);
                    System.out.println("Area of the cylinder is "+acylin);
                          break;

                case 8:
                    System.out.println("Enter the side of a square: ");
                    float scube=in.nextFloat();
                    double tsa=6*scube*scube;
                    System.out.println("TSA of cube is"+tsa);
                    break;
                default:
                    System.out.println("Enter the correct operation");

                }

            }
        }
}

