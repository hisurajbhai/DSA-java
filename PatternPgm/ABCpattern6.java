package PatternPgm;

public class ABCpattern6 {
    public static void main(String[] args) {
        int n=4;
        int iniS=0;
;        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=0;k<(n*2-iniS)-2;k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            iniS+=2;
            System.out.println();
        }
    }
    
}
