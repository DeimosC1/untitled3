import java.util.Scanner;

public enum InputManager {
    INSTANCE;
   private Scanner sc = new Scanner(System.in);

    public String getString() {
        return InputManager.INSTANCE.sc.nextLine();
    }
}
