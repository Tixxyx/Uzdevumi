import java.util.Scanner;

public class Uzd5 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int[] glazes = new int[4];
        System.out.print("Zem kuras glazes novietot bumbinu?(1-4): ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Cik reizes pielietot algoritmu?: ");
        int reizes = Integer.parseInt(reader.nextLine());
        glazes[a-1]=1;

        while(reizes>0){
            algoritms(glazes);
            reizes--;
        }

        for (int i =0;i<glazes.length;i++){
            if (glazes[i]==1){
                System.out.println("Atrodas zem "+(i+1)+" pozicijas");
            }
        }


    }
    public static int[] algoritms(int[] a){
        if (a.length!=4){
            return null;
        } else {
            int buffer = a[0];
            a[0]=a[2]; // pirmais ar 3
            a[2]=buffer;

            buffer=a[1];
            a[1]=a[3]; // otrais ar 4
            a[3]=buffer;

            buffer=a[1];
            a[1]=a[2]; // otrais ar 3
            a[2]=buffer;

            buffer=a[0];
            a[0]=a[3]; // pirmais ar 4
            a[3]=buffer;

            buffer=a[1];
            a[1]=a[3]; // otrais ar 4
            a[3]=buffer;
        }
        return a;
    }
}

/*
Piemers:
Zem kuras glazes novietot bumbinu?: 2
Cik reizes pielietot algoritmu?: 1
Atrodas zem 1 pozicijas
 */

