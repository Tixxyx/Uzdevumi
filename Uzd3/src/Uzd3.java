import java.util.Scanner;

public class Uzd3 {
    public static void main(String[] args) {
        String result = "";
        Scanner reader = new Scanner(System.in);
        System.out.println("Ievadiet heksadecimalo skaitli: ");
        String a = reader.nextLine();
        if (a.length() > 256) {
            System.out.println("Parsniedz noradito garumu");
        } else {
            for (int i = 0; i < a.length(); i++) {
                int c = Integer.parseInt(""+a.charAt(i),16); // iegust 1 simbolu
                String buffer = Integer.toBinaryString(c); // parvers binaraja sistema
                while(buffer.length()<4){ // ievada nulles ja iegutais binarais skaitlis ir mazaks par 4
                    buffer = "0"+buffer;
                }
                if (a.length()-1==i){ // izprinte pedejo bez atstarpes
                    result+=buffer;
                } else result+=buffer+" ";
            }
        }
        System.out.println(result);
    }
}
/*
Rezultata piemers;
Ievadiet heksadecimalo skaitli:
ABC
1010 1011 1100
 */

