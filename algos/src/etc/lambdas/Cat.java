package etc.lambdas;

public class Cat implements Printable{
    public String name;
    public int age;

    public Cat () {

    }

    @Override
    public void print(String prefix, String suffix) {
        System.out.println("meow");
    }


}
