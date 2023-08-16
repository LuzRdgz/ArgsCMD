package org.example;

public class Suma_Igual_X {

    public static void main(String[] args) {

        String msjA = "SI existe...";
        String msjN = "NO existe...";
        int cant = args.length;
        int nums[] = new int[cant-1];
        int igualA = Integer.parseInt(args[0]);
        int suma;

        System.out.println("==============================");
        System.out.println("NUMEROS");

        for (int i = 1; i < cant; i++) {
            int Arg = Integer.parseInt(args[i]);
            nums[i-1] = Arg;
            System.out.println(nums[i-1]);
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("EXISTE una suma igual "+ igualA +"?");
        
            if ((nums[0]+nums[1]) == igualA ||(nums[0]+nums[2]) == igualA){
                System.out.println(msjA);
            } else if ((nums[0]+nums[3]) == igualA ||(nums[0]+nums[4]) == igualA) {
                System.out.println(msjA);
            }else if ((nums[1]+nums[0]) == igualA || (nums[1]+nums[2]) == igualA){
                System.out.println(msjA);
            } else if ((nums[1]+nums[3]) == igualA || (nums[1]+nums[4]) == igualA) {
                System.out.println(msjA);
            }else if ((nums[2]+nums[0]) == igualA || (nums[2]+nums[1]) == igualA){
                System.out.println(msjA);
            } else if ((nums[2]+nums[3]) == igualA || (nums[2]+nums[4]) == igualA) {
                System.out.println(msjA);
            }else if ((nums[3]+nums[0]) == igualA || (nums[3]+nums[1]) == igualA){
                System.out.println(msjA);
            } else if ((nums[3]+nums[2]) == igualA || (nums[3]+nums[4]) == igualA) {
                System.out.println(msjA);
            }else if ((nums[4]+nums[0]) == igualA || (nums[4]+nums[1]) == igualA){
                System.out.println(msjA);
            } else if ((nums[4]+nums[2]) == igualA || (nums[4]+nums[3]) == igualA) {
                System.out.println(msjA);
            } else {
                System.out.println(msjN);
            }
        System.out.println("==============================");
    }
}
