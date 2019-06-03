/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ankita
 */
public class NewClass {

//      billing system by using of arraylist 
    public ArrayList<Integer> prize = new ArrayList<>();
    int j = 0;
    public int amount = 0;
    public ArrayList<Integer> total = new ArrayList<>();
    public String s1[] = {"milk", "butter", "coco"};
    public ArrayList<Integer> rate = new ArrayList<>();
    public String sin;
    public ArrayList<Integer> q1 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    ArrayList<String> s = new ArrayList<>();

    void product2() {
        System.out.println("Enter product from   milk , coco , butter");

        for (int i = 0; i <= j + 1; i++) {

            System.out.print("enter product :  ");

            s.add(i, sc.next());
            switch (s.get(i)) {
                case "milk":
                    System.out.print("enter quantity : ");
                    q1.add(i, sc.nextInt());
                    rate.add(i, 30);
                    total.add(i, q1.get(i) * 30);
                    break;

                case "butter":
                    System.out.print("enter quantity : ");
                    q1.add(i, sc.nextInt());
                    rate.add(i, 40);
                    total.add(i, q1.get(i) * 40);
                    break;

                case "coco":
                    System.out.print("enter quantity : ");
                    q1.add(i, sc.nextInt());
                    rate.add(i, 50);
                    total.add(i, q1.get(i) * 50);
                    break;
            }
            System.out.println("complete?  ---> 'y' or 'n'");
            sin = sc.next();
            if (sin.equalsIgnoreCase("y")) {
                System.out.println("\n");
                break;
            } else if (sin.equalsIgnoreCase("n")) {
                j++;
            }

        }
    }

    void total() {

        float cgst, sgst, gst;

        for (int i = 0; i <= j; i++) {
            amount += total.get(i);
        }
        gst = (float) (amount * 0.18);
        cgst = gst / 2;
        sgst = cgst;
        float paid = amount + gst;

        System.out.println("-------------------------------------");
        System.out.println("Item name     Rate     Qty    Amount");
        System.out.println("-------------------------------------");
        for (int i = 0; i <= j; i++) {
            System.out.println(s.get(i) + "\t       " + rate.get(i) + "\t" + q1.get(i) + "\t" + total.get(i));
        }
        System.out.println("-------------------------------------");
        System.out.println("                   SUB TOTAL     " + amount + "\n");
        System.out.println("                   GST 18%       " + gst);
        System.out.println("                   CGST 9%       " + cgst);
        System.out.println("                   SGST 9%       " + sgst);
        System.out.println("-------------------------------------");
        System.out.println("Amount to pay incl. all taxes = " + paid + "\n\n");
    }
}
