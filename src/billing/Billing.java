/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

import java.util.Scanner;

/**
 *
 * @author ankita
 */
public class Billing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass n = new NewClass();
        Scanner sc = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i <= j + 1; i++) {
            System.out.println("customer " + (i + 1));
            n.product2();   
            n.total();
            System.out.println("you want to enter new bill press y else n");
            String s = sc.next();
            if (s.equals("y")) {
                j++;
            } else {
                break;
            }

        }
    }

}
