package com.kshitiz.assignments;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            while (true){
                System.out.println("Enter the number to find perimeter: ");
                System.out.println("1.Circle 2.equilateral triangle 3.rectangle 4.Square");
                int num = in.nextInt();
                switch (num) {
                    case 1:
                        System.out.print("Enter the radius of circle: ");
                        float rcir = in.nextFloat();
                        double pcir = (float) (2 * 3.14 * rcir);
                        System.out.println("Perimeter of the circle is " + pcir);
                        break;

                    case 2:
                        System.out.println("Enter the side: ");
                        float tside = in.nextFloat();
                        double ptri = 3 * tside;
                        System.out.println("Perimeter of the triangle is" +
                                ":" + ptri);
                        break;

                    case 3:
                        System.out.println("Enter the length of rectangle: ");
                        float lrect = in.nextFloat();
                        System.out.println("Enter the breadth of the rectangle: ");
                        float brect = in.nextFloat();
                        double prect = 2 * (lrect + brect);
                        System.out.println("Perimeter of the rectangle is " + prect);
                        break;

                    case 4:
                        System.out.println("Enter the side of the square: ");
                        float ssqu = in.nextFloat();
                        double psspu = ssqu * ssqu;
                        System.out.println("perimeter of the square is " + psspu);
                        break;

                    default:
                        System.out.println("Enter the correct operation");
                }
            }
    }
}
