import java.util.Scanner;

public class Tuitando {

    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).nextLine()
                .length() > 140 ?
                "MUTE" :
                "TWEET");
    }
}