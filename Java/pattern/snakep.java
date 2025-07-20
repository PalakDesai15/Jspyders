class snakep {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int end = num + n - 1;
                for (int j = end; j >= num; j--) {
                    System.out.print(j + " ");
                }
                num = end + 1;
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
