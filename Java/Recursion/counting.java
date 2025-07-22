public class counting {
    public static void main(String[] args) {
       System.out.println(count(45678)); 
        
    }
    public static int count(int n){
        if (n==0)return 0;
        return 1+count(n/10);

    }
    
}
