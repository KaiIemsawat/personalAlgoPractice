package etc.lambdas;

public class Cat implements Printable, Print2{
    public String name;
    public int age;

    public Cat () {

    }

    @Override
    public void print(String prefix, String suffix) {
        System.out.println("meow");
    }


    @Override
    public String print2(String str) {
        System.out.println("from print2 : " + str);
        return str;
    }
}
