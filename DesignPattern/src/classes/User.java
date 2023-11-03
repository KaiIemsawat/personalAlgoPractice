package classes;

public class User {
        public String name;

        public User(String name, int age) {
                this.name = name;
        }

        public void saySomething() {
                System.out.println("This is " + name);
        }
}
