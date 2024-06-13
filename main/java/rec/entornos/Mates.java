package rec.entornos;


public class Mates {
    
    public static double valorAbsoluto (double num) {
        return (num < 0) ? -num : num;
    }
    
    public static int factorial (int num){
        int factorial = 1;
        
        while (num > 1) {
            factorial *= num;
            num --;
        }
        return factorial;
    }
}
