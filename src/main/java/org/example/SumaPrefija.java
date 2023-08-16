package org.example;

public class SumaPrefija {
    public static void main(String[] args) {
        int sumP = 0;
        System.out.println("==============================");
        System.out.println("NUMEROS SIN SUMAR");
        for (String ar: args) {
            System.out.println(ar);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("SUMA PREFIJA");

        for (String ar: args) {
            int Arg = Integer.parseInt(ar);
            sumP = sumP + Arg;
            System.out.println(sumP);
        }
        System.out.println("==============================");
    }
}
