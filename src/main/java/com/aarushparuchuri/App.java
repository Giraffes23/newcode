package com.aarushparuchuri;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        System.out.println( "Hello World! 2 check-in" );

        int i=10;
        int e=20;
        int sum=i+e;
        System.out.println(sum);

        int d=32;
        int j=29;
        int h=77;
        int o=84;
        int y=29;
        int w=34;
        int c=90;
        int u=93;
        int b=74;
        int v=42;
        int sum1=d+j;
        int sum2=h+o;
        int sum3=y+w;
        int sum4=c+u;
        int sum5=b+v;
        System.out.println(sum1 + "," + sum2 + "," + sum3 + "," + sum4 + "," + sum5);

        sum(32, 29);
        sum(77, 84);

    }

    public static void sum(int a , int b) {

        int sum = a + b;
        System.out.println(sum);

    }
}
