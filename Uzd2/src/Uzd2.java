public class Uzd2 {
    public static void main(String[]args){
        int n=1;
        int m=2;
        int k =0;
        while (n!=m){
            if (n>m){
                n-=m;
            } else m-=n;
            k++;
        }
        k++;
        System.out.println(k);
    }
}
/*
Shema: http://prntscr.com/ifhbt9
 */

