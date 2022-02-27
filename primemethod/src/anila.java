
public class anila{
 
    public static void main(String[] args) {
       
        int a = 2;
        int b = 100;
        
        for(int n=a;n<=b;n++) {
          
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i=2;i<= num/i;i++) {
            if(num%i== 0) {
                return false;
            }
        }
        return true;
    }
}