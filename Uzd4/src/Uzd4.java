
/*
Isti nesapratu ko uzdevuma veidotaji grib.
Pienemu ka tie ir domati ka binarie skaitli.
Parvertu heksadecimalaja vertiba

 */
public class Uzd4 {
    public static void main(String[] args) {
        int[][] tabula = new int[10][10];// var izveleties ari citas para skaitla vertibas ;)
        String[] tabulasVert = new String[10];
        tabula=print1(tabula);
        printArray(tabula); // izprinteju tabulu
        for (int i =0;i<tabula.length;i++){ //iegust vertibas
            String binary ="";
            for (int j=0;j<tabula[i].length;j++){
                binary+=tabula[i][j];
            }
            tabulasVert[i]=binaryToHex(binary);
        }
        System.out.println("Tabulas skaitli(pienemot ka tie ir binarie skaitli) parversti heksadecimalajos");
        for (int c =0;c<tabula.length/2;c++){ // izvada 5 vertibas (parejie atkartosies)
            System.out.println(tabulasVert[c]);
        }
    }
    public static String binaryToHex (String a){ // parvers heksadecimalaja skaitli
        return Long.toHexString(Integer.parseInt(a,2));
    }

    public static int[][] print1 ( int[][] a){ // uzbuve tabulu
        int ones = a.length/5; // with [10][10] 2
        int zeros = (a.length-ones)/2; // with [10][10] 4
        for (int i =0;i<a.length/2;i++){
            for(int j =zeros;j<a[i].length-zeros;j++){
                a[i][j]=1;
                a[(a.length-1)-i][j]=1;
            }
            zeros--;
            ones*=2;
        }
        return a;
    }
    public static void printArray ( int[][] a){ // izprinte tabulu
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                if (a[i].length - 1 == j) System.out.println(a[i][j]);
                else System.out.print(a[i][j] + " ");
            }
    }
}
/*
Rezultata piemers :
0 0 0 0 1 1 0 0 0 0
0 0 0 1 1 1 1 0 0 0
0 0 1 1 1 1 1 1 0 0
0 1 1 1 1 1 1 1 1 0
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
0 1 1 1 1 1 1 1 1 0
0 0 1 1 1 1 1 1 0 0
0 0 0 1 1 1 1 0 0 0
0 0 0 0 1 1 0 0 0 0
Tabulas skaitli(pienemot ka tie ir binarie skaitli) parversti heksadecimalajos
30
78
fc
1fe
3ff
 */

