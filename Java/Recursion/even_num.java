public class even_num {
    public static void main(String args[]){
        num(1);

    }
    public static void num(int n){
        if(n>10)return ;
        if(n%2==0)
        System.out.println(n);
        num(n+1);

    }
    
}
