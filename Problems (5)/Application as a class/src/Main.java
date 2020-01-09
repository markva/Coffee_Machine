import java.util.Arrays;

class Application {

    String name;

    // write a method here
    public void run(String[] name) {
        for (int i = 0; i < name.length; i++) {
            System.out.println(Arrays.toString(name));
        }
    }
}