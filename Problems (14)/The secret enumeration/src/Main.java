public class Main {

    public static void main(String[] args) {
        //Secret[] secret = Secret.values().
        System.out.println(Secret.values().equals("STAR"));
    }
}

//At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
