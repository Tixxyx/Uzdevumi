import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Uzd8 {
    public static void main(String[] args){
        try{
            BufferedReader dati1 = new BufferedReader(new FileReader("uzd8.in"));
            BufferedWriter dati2 = new BufferedWriter(new FileWriter("uzd8.out"));
            String info = dati1.readLine();
            int rindas = info.charAt(0)-'0';
            int vietasRinda = info.charAt(2)-'0';

            if (rindas<1||rindas>100|vietasRinda<1||vietasRinda>100){
                System.out.println("Bad input. Numbers too small/large ");
            } else {
                String[] vietas = new String[rindas];
                for (int i = 0; i < rindas; i++) {
                    vietas[i] = dati1.readLine();
                }
                int c = brivs(vietas);
                dati2.write(Integer.toString(c));
                dati1.close();
                dati2.close();
            }
        } catch (Exception e){
            System.out.println("Cant read the file. Error: " + e.getMessage());
            return;
        }
    }
    public static void printArray(String[] a){
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static int brivs (String[] a){ // iegust cik vietas pec kartas ir brivas
        int max =0;
        for (int i =0;i<a.length;i++){ // gets rid of whitespaces
            a[i]=a[i].replaceAll("\\s","");
        }
        for (int j = 0; j<a.length;j++){ // rinda
            int buffer =0;
            for (int c = 0; c<a[j].length();c++){ // simbola cipars
                if (a[j].charAt(c)=='0'){
                    buffer++;
                } else {
                    if (buffer>max){
                        max=buffer;
                    }
                    buffer=0;
                }
                if (buffer>max) max=buffer;
            }
        }
        return max;
    }
}

