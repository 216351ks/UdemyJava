public class sumawartosci {
    
    public static void main(String[] args) {
        int [] liczby = {1,2,3,4,5,6,7,8,9};

        int suma = 0;
        for (int liczba: liczby){
            suma += liczba;
        }
        System.out.println("Suma wartości z tablicy jest równa: " + suma);
    }
}
