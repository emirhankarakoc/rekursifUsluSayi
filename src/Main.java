public class Main {
    public static void main(String[] args) {
        System.out.println(ust(3,4));
    }



//zort

    public static int ust(int taban,int us){
        if (us==0) return 1;
        return taban*(ust(taban,(us-1)));




    }
}