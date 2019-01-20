public class Main {

    public static void main(String[] args) {

        System.out.println("### ISOCCER ###\n");

        Sistema sistema = new Sistema();

        while(!sistema.login()) {
            System.out.println("Login ou senha incorretos.");
        }


    }
}
