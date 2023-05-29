package basicPrograms;


class Sample {
    static Sample s1;
    static int x = 10;
    static int count = 0;

    private Sample() {
        count++;
    }

    public static Sample getInstance() {
        if (count == 0) {
            s1 = new Sample();
        }
        return s1;
    }

    public static void setInstance(int y) {
        x = y;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Sample s2 = Sample.getInstance();
        System.out.println(s2.x);
        Sample.setInstance(12687);
        
        System.out.println(s2.x);
    }
}
