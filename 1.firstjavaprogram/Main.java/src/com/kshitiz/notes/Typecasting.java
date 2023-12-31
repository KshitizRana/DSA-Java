package com.kshitiz;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        }
}
//When one type of data is assigned to another type of variable and automatic type conversion take place if conditions are met.
//        taking float but giving input an integer it automatically coverts into float if following conditions are met:
//        1. two data types should be compatible
//        2. Destination type should be greater than the source type.
//    Widening or Automatic Type conversion
/* this happens when we assign value of smaller datatype to bigger datatype & two data type must be compatible.
byte->short->int->long->float->double

Narrowing or Explicit conversion
converting larger datatype to smaller one
double -> float->long->int->short->byte

*/

/* Automatic Type Promotion in Expressions:
While evaluating expressions, the intermediate value may exceed the range of operands & hence the expression value will be promoted.
Conditions of type promotion are:
1. Java automatically promotes each byte, short , char to int when evaluating an expression
2. long ,float or double the whole expression is promotes o long, float or double.

for eg. (f*b ) + (i/c) - (d*s)
        float + int - double = double (converts to bigger one.

Explicit type casting:
If we want to store large value into small data type

eg. byte b=50
    b=byte(b*2); -> type casting int to byte.
*/