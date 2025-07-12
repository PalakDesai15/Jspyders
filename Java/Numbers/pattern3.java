class pattern3{
    public static void main(String args[]){
        System.out.println("Enter");
        int n=5;
        for(int i=1;i<=n;i++){//for no.of lines
            for(int j=1;j<=n-i;j++){//for no of spaces in a line
                System.out.print(" ");
            }for(int k=1;k<=i;k++){//for no.of characters in a line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}