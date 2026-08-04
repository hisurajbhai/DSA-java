package PatternPgm;

public class ABCpattern4{
    public static void main(String[] args) {
        for(int i= 1;i<=5;i++){
            for(int j=69;j>69-i;j--){
                char c=(char)j;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

// E 
// E D 
// E D C 
// E D C B 
// E D C B A 