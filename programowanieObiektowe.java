public class programowanieObiektowe {
    public static void main(String[] args){

        Punkt p = new Punkt(10,15);
        Punkt p2 = new Punkt(34,67);

        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);

        System.out.println("p2.x = " + p2.x);
        System.out.println("p2.y = " + p2.y);
    }
}

class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konstruktor domyślny");
    }

    Punkt(int x, int y)
    {
        this.x = y;
        this.y = y;
    }
    int x;
    int y;
}