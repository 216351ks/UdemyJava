public class first{

    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        int intMethod = plusMethod(8,43);
        double dblMethod = plusMethod(4.66, 4.35);
        
        System.out.println("plusMethod dla int: " + intMethod);
        System.out.println("plusMethod dla double: " + dblMethod);
    }
}
