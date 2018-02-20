import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Uzd9 {
    public static void main(String[] args){
        try{
            BufferedReader dati1 = new BufferedReader(new FileReader("uzd9.in"));
            BufferedWriter dati2 = new BufferedWriter(new FileWriter("uzd9.out"));
            String x = dati1.readLine();

            int ezi1 = x.charAt(0)-'0';
            int alass = x.charAt(2)-'0';
            int[] alas = new int[alass];
            int[] ezi = createEzi(ezi1);

            x = dati1.readLine();
            x=x.replaceAll("\\s","");
            for (int j =0; j<x.length();j++){
                alas[j]=x.charAt(j)-'0';
            }
            int i =0;
            while(i<alas.length){
                int ala =alas[i];
                if (ala==ezi.length){
                    i=alas.length;
                } else {
                    int[] buffer = new int[ala];
                    for (int c = 0;c<ala;c++){
                        buffer[c]=ezi[ezi.length-1];
                        for (int k =(ezi.length-1);k>0;k--){
                            ezi[k]=ezi[k-1];
                        }
                    }
                    for (int o=0;o<ala;o++){
                        ezi[o]=buffer[o];
                    }
                    i++;
                }
            }
            dati2.write(printArray(ezi));
            dati1.close();
            dati2.close();
        }

        catch (Exception e){
            System.out.println("Cant read the file. Error: " + e.getMessage());
            return;
        }


    }
    public static int[] createEzi(int a){
        int c =0;
        int[] b = new int[a];
        for (int i =a;i>=1;i--){
            b[c]=i;
            c++;
        }
        return b;
    }
    public static String printArray(int[] a){
        String b ="";
        for (int i = 0; i<a.length;i++){
            if (i==a.length-1){
                b+=(a[i]);
            }else {
                b+=(a[i] + " ");
            }
        }
        return b;
    }
}
/*
Ar 4 eziem un 3 caurumiem (1 2 3 dziluma) atbilde- 4 1 3 2
 */

