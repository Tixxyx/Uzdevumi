import java.util.Arrays;
import java.util.Scanner;

public class Uzd6 {
    public static void main(String[] args){
        int speletaji[] = new int[3];
        int speletaji2[] = new int [speletaji.length];
        Scanner reader =new Scanner(System.in);
        System.out.println("Ievadiet pieccipara skaitlus: ");
        System.out.print("Speletajs 1: ");
        speletaji[0] = Integer.parseInt(reader.nextLine());
        System.out.print("Speletajs 2: ");
        speletaji[1]= Integer.parseInt(reader.nextLine());
        System.out.print("Speletajs 3: ");
        speletaji[2]= Integer.parseInt(reader.nextLine());

        for (int i =0;i<speletaji2.length;i++){
            if (!checkRepeat(speletaji[i])){
                speletaji2[i]=supersumma(speletaji[i]);
            } else speletaji2[i]=0;
        }

        int winSuper = speletaji2[0];
        int winID = 0;

        for (int j = 1; j<speletaji2.length;j++){
            if (speletaji2[j]>winSuper){
                winSuper=speletaji2[j];
                winID=j;
            }
        }
        if (winSuper==0) System.out.println("Neuzvareja neviens, visticamak atkartojas cipari ;)");
        else System.out.println("Uzvereja speletajs "+(winID+1)+" ar skaitla "+speletaji[winID]+" supersummu "+winSuper);
    }
    public static int supersumma(int a){
        int result = 0;
        String buffer="";
        while(true){
            buffer= Integer.toString(a);
            for (int i =0;i<buffer.length();i++){
                result+=buffer.charAt(i)-'0';
            }
            if (result!=0&&result>9){
                a=result;
                result =0;
            } else break;
        }
        return result;
    }
    public static boolean checkRepeat(int a){
        String buffer = Integer.toString(a);
        int[] list = new int[buffer.length()];
        for (int n = 0; n<list.length;n++){
            list[n]=buffer.charAt(n)-'0';
        }
        Arrays.sort(list);
        for (int i =1; i<list.length;i++){
            if (list[i]==list[i-1]){
                return true;
            }
        }
        return false;
    }
}

