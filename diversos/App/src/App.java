public class App {
    public static void main(String[] args) throws Exception {
        
        
        
        System.out.println(fat(0));



    }

    public static int fat(int val){
        if (val == 1){
            return 1;
        }

        return val * fat(val - 1);
    }
}
