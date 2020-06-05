/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricies.adder;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MetriciesAdder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome press y to continue...");
        String enter = sc.next();
        if (enter.equalsIgnoreCase("y")) {

            for (int i = 0; i <= 1; i++) {

                Actions(sc);
                System.out.println("Do you want to do another calculation? If yes enter Y otherwise enter any character.");
                String conf = sc.next();
                if (conf.equals("Y") || conf.equals("y")) {
                    i--;

                } else {
                    i = 1;
                }
            }
        } else {
            System.exit(0);
        }

    }

    public static void Actions(Scanner sc) {
        System.out.println("Enter matrix data seperated with space( each matrix require 4 digit required).You should enter the digit from left to right");
        System.out.println("Matrix A:");
        int matrix1_1 = sc.nextInt();
        int matrix1_2 = sc.nextInt();
        int matrix1_3 = sc.nextInt();
        int matrix1_4 = sc.nextInt();
        System.out.println("Matrix B:");
        int matrix2_1 = sc.nextInt();
        int matrix2_2 = sc.nextInt();
        int matrix2_3 = sc.nextInt();
        int matrix2_4 = sc.nextInt();
//clear the console

        int pair1 = matrix1_1 + matrix2_1;
        int pair2 = matrix1_2 + matrix2_2;
        int pair3 = matrix1_3 + matrix2_3;
        int pair4 = matrix1_4 + matrix2_4;

        System.out.println("[ " + matrix1_1 + "+" + matrix2_1 + "=" + pair1 + ";" + matrix1_2 + "+" + matrix2_2 + "=" + pair2 + ";" + " ]");
        System.out.println("[ " + matrix1_3 + "+" + matrix2_3 + "=" + pair3 + ";" + matrix1_4 + "+" + matrix2_4 + "=" + pair4 + ";" + " ]");

        System.out.println("[" + pair1 + " " + pair2 + "]");
        System.out.println("[" + pair3 + " " + pair4 + "]");
    }
}
