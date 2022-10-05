package dreieck;

public class Dreieck {
    private int a;
    private int b;
    private int c;

    public Dreieck() {
    }

    public Dreieck(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  String calculate(int a, int b, int c) {
        if (( a <= 0 || a >= 100) || ( b <= 0 || b >= 100) || ( c <= 0 || c >= 100)) {
           return "Kein Dreieck. Die eingegebenen Zahlen müssen zwischen 1 und 99 liegen.";
        }

         else if ((a!=b) && (a!=c)&& (b!=c)) {
            return "unregelmäßiges Dreieck";

        }else if (a==b && b==c) {
            return "Gleichseitiges Dreieck";

        } else if (a==b || a==c || b==c) {
            return "Gleichschenkliges Dreieck";

        }
        return " Leider das ist Dreieck. Kein Ergebnis";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

}
