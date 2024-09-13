package etc.lambdas;

public class Lambdas {
    public static void main(String[] args) {

//        Cat cat1 = new Cat();
//        cat1.print();
//        printThing(cat1);
//        printThing takes an Object type argument which Cat also is. Thus, the results would be the same
//        Looks like below
//        printThing(
//                public void print() {
//                    System.out.println("meow");
//                 }
//        );

        System.out.println("===========");
//        To convert to lambda, no need for access modifier, name of the method, return type
//        Only need parameter. In this case there is none
//        And, actual method implementation
//        '{}' is not needed if only on function
//        printThing(() -> {
//            System.out.println("meow");
//            System.out.println("meowwww");
//        });

        System.out.println("===========");
//        Printable lambdaPrintable = () -> System.out.println("meoooooow");
//        printThing(lambdaPrintable);

        System.out.println("===========");
        Printable lambdaPrintable0 = (p, s) -> System.out.println(p + "meoooooow" + s);
        Printable lambdaPrintable1 = (p, s) -> System.out.println("meoooooow" + s);
        Printable lambdaPrintable2 = (p, s) -> System.out.println("meoooooow"); // no need to use the parameter

        printThing(lambdaPrintable0);
        printThing(lambdaPrintable1);
        printThing(lambdaPrintable2);

        Print2 lambdaPrint2_1 = (str) -> {
            System.out.println("from print1 : " + str);
            return "return from print1 : " + str;
        };

        Print2 lambdaPrint2_2 = (str) -> "from print2 : " + str;

        printWithReturn(lambdaPrint2_1);
        printWithReturn(lambdaPrint2_2);
        System.out.println(printWithReturn(lambdaPrint2_1));


    }



    static void printThing(Printable thing) {
//        thing.print();
        thing.print("hi, ", " !");
    }

    static String printWithReturn(Print2 thing) {
        thing.print2("woof");
        return "woooofffffff....";
    };

}
