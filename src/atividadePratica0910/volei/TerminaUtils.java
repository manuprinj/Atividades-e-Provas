package atividadePratica0910.volei;

import java.util.Scanner;

class TerminalUtils {
    private static final Scanner SCANNER = new Scanner(System.in);

    private TerminalUtils() {}

    public static void println(String message) {
        System.out.println(message);
    }

    public static Integer inputInteger(String message) {
        println(message);
        while (true) {
            try {
                return Integer.valueOf(SCANNER.nextLine());
            } catch (Exception e) {
                println("Número inválido");
            }
        }
    }

    public static String inputString(String message) {
        println(message);
        return SCANNER.nextLine();
    }
}
