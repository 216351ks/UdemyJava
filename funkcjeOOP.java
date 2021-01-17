public class funkcjeOOP {
    int x = 667;
    public static void main(String[] args){

        funkcjeOOP mojObj = new funkcjeOOP();
        mojObj.x = 668;
        System.out.println(mojObj.x);

        Test a = new Test();
        a.wypisz("Kacper", "Siwiec");

        int wynik = a.dodaj(10,20);
        System.out.println(wynik);       
    }
}

class Test
{
    void wypisz(String imie, String nazwisko)
    {
        System.out.println(imie + " " + nazwisko);
    }
    int dodaj(int a, int b)
    {
        return a + b;
    }
}
