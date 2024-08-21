import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ingresso = 200;
        String terAcesso = ingresso >= 500 ? "VIP" : "Pista"; // operador ternário
        System.out.println(terAcesso);
    }
}
