package PatternPgm;

public class ABCpattern2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(char c='A';c<='E'-i;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    
}

// A B C D E 
// A B C D 
// A B C 
// A B 
// A
