public class App2 {
    public static void main(String[] args) throws Exception {
        
        
        
        System.out.println(potencia(5, 20));



    }

    public static int potencia(int x, int n){
        if (n == 0) {
            return 1;
        }else  if (n < 0) {
            return 1 / potencia(x, -n);
        }else{
            
            return x * potencia(x, n - 1);

        }
        
        
    }
}
