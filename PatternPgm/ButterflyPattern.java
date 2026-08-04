package PatternPgm;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        int iniS=2;
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=iniS;k++){
                System.out.print(" ");
            }
            for(int l=n-i;l>=1;l--){
                System.out.print("*");
            }
    
            iniS+=2;
            System.out.println();
        }
    }
    
}
