package PatternPgm;

public class ABCpattern7 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=65;k<65+i;k++){
                char c=(char)k;
                System.out.print(c+"");
            }
            for(int l=65+i-2;l>=65;l--){
                char c=(char)l;
                System.out.print(c+"");
            }
            System.out.println();
        }
    }
    
}

//    A
//   ABA
//  ABCBA
// ABCDCBA
