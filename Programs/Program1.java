package Programs;

public class Program1 {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        pattern2(5);
        pattern3(4, 0);
        pattern4(5, 0);
        pattern5(4,0);
    }

    static void pattern1(int n){
        if(n == 0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        pattern1(n-1);
    }

    static void pattern2(int n){
        for (int i = n; i>0; i--){
            for(int j = 0; j<i ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int row, int col){
        if(row < 1){
            return;
        }
        if(col >= row){
            row--;
            col = 0;
            System.out.println();
        }
        System.out.print("*" + " ");
        pattern3(row, ++col);
    }

    static void pattern4(int r, int c){
        if(r < 1){return;}
        if(c < r){
            System.out.print("*"+ " ");
            pattern4(r, c+1);
        }
        else{
            System.out.println();
            pattern4(r-1, 0);
        }
    }

    static void pattern5(int r, int c){
        if(r < 1){
            return;
        }
        if(c < r){
            pattern5(r, c+1);
            System.out.print("*"+" ");
        }
        else{
            pattern5(r-1, 0);
            System.out.println();
        }
    }

}
