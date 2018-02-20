public class Uzd1 {
    public static void main(String[] args){
        int x =11;// klucisu skaits
        int s = 0; // sakuma stavu skaits

        while(x>=(s+1)*2){
            s++;
            x-=s*2;
        }
        System.out.println("Stavu skaits: "+s);
        System.out.println("Parpalikuso klucisu skaits: "+x);

        /*
        Rezultats ar so x vertibu:
        Stavu skaits: 2
        Parpalikuso klucisu skaits: 5
         */
    }
}
