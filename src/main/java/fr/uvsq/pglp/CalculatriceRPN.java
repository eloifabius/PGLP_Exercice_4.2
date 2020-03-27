package fr.uvsq.pglp;

import java.util.Scanner;

import static fr.uvsq.pglp.MoteurRPN.evaluate;

public class CalculatriceRPN {
    public static void main( String[] args )
    {
        System.out.println("Postfix calculator with memory by Carissa Gabilheri");
        Scanner scan = new Scanner(System.in);
        System.out.print("% ");
        while(scan.hasNextLine()) {
            String s = scan.nextLine();
            evaluate(s);
            System.out.print("% ");
        }
    }
}
