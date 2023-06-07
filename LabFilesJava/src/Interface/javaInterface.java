package Interface;

interface In {
    int a = 0;

    void show();

    void config();

    static void ishow() {
        System.out.println("ishow");
    }

    default void iconfig() {
        System.out.println("iconfig");
    }
}

interface Ni extends In {
    public void in();
}

class JIn implements Ni {

    @Override
    public void show() {
        System.out.println("inshow");
    }

    @Override
    public void config() {
        System.out.println("inconfig");
    }

    @Override
    public void in() {
        System.out.println("inin");

    }
}

interface D {
    public void d();
}

public class javaInterface implements In, D {
    public static void main(String[] args) {
        javaInterface obj = new javaInterface();
        obj.config();
        obj.show();
        In.ishow();
        obj.iconfig();
    }


}
