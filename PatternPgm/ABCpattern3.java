package PatternPgm;

public class ABCpattern3 {
    public static void main(String[] args) {
        int n=5;
        
        for(int i=65;i<=69;i++){
            for(int j=65;j<=i;j++){
                char c=(char)i;
                System.out.print(c);
            }
            System.out.println();
            ;
        }
       
    }
    
}

// A
// BB
// CCC
// DDDD
// EEEEE
