import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Uzd10 {
    public static void main(String[] args){
        try {
            BufferedReader dati1 = new BufferedReader(new FileReader("uzd10.in"));
            BufferedWriter dati2 = new BufferedWriter(new FileWriter("uzd10.out"));
            String read = dati1.readLine();
            String[] splited = read.split("\\s+"); // seperates words
            for (int i =0;i<splited.length;i++){
                String a ="";
                for (int j=0;j<splited[i].length();j++){
                    a += splited[i].charAt(j); // buve simbolus
                    if ((j+1)%5==0&&j!=0){  // parbauda vai ir piektais
                        switch(a){
                            case "AAAAA": dati2.write('A');break;
                            case "AAAAB": dati2.write('B');break;
                            case "AAABA": dati2.write('C');break;
                            case "AAABB": dati2.write('D');break;
                            case "AABAA": dati2.write('E');break;
                            case "AABAB": dati2.write('F');break;
                            case "AABBA": dati2.write('G');break;
                            case "AABBB": dati2.write('H');break;
                            case "ABAAA": dati2.write('I');break;
                            case "ABAAB": dati2.write('K');break;
                            case "ABABA": dati2.write('L');break;
                            case "ABABB": dati2.write('M');break;
                            case "ABBAA": dati2.write('N');break;
                            case "ABBAB": dati2.write('O');break;
                            case "ABBBA": dati2.write('P');break;
                            case "BAAAA": dati2.write('R');break;
                            case "BAAAB": dati2.write('S');break;
                            case "BAABA": dati2.write('T');break;
                            case "BAABB": dati2.write('V');break;
                            case "BABBB": dati2.write('Z');break;
                            default: dati2.write(a);
                        }
                        a="";
                    }
                }   if (splited.length-1!=i)dati2.write(" ");
            }

            dati1.close();
            dati2.close();

        } catch (Exception e){
            System.out.println("Cant read the file. Error: " + e.getMessage());
            return;
        }
    }
}

