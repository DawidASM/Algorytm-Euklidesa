package com.kodilla.algorytmeuklidesa;

public class AlgorytmEuklidesa {
        public static void main (String[] args) {

            int a = 169;
            int b = 13;

            boolean find = false;

            if( a >= b){

                while(!find) {

                    if( a % b == 0){

                        find = true;

                    } else {

                        a -= b;
                        b = a % b;
                    }
                }
            }

            if( b > a){

                while(!find) {

                    if( b % a == 0){

                        find = true;

                    } else {

                        b -= a;
                        a = b % a;
                    }
                }
            }

            System.out.println("Highest divisior is: " + b);


        }

}
