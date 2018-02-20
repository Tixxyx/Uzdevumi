import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Uzd7 {
    public static void main(String[] args){
        try {
            BufferedReader dati1 = new BufferedReader(new FileReader("uzd7.in.txt"));
            BufferedWriter dati2 = new BufferedWriter(new FileWriter("uzd.7.out.txt"));
            String aploksne = dati1.readLine();
            String kartina = dati1.readLine();
            int[] size = new int[2];
            int[] size2 = new int[2];
            size[0] = aploksne.charAt(0)-'0';
            size[1]= aploksne.charAt(2)-'0';

            size2[0]=kartina.charAt(0)-'0';
            size2[1]= kartina.charAt(2)-'0';

            Arrays.sort(size);
            Arrays.sort(size2);

            if (size[0]>=size2[0]&&size[1]>=size2[1]){ // no dota piemera pienemu ka var but ari vienadas vetibas
                dati2.write("VAR");
            } else{ dati2.write("NEVAR");}
            dati1.close();
            dati2.close();
        } catch (Exception e){
            System.out.println("Cant read the file. Error: " + e.getMessage());
            return;
        }
    }
}

