import java.util.Scanner;

public class Main {

    public int sol(String text, char c) {

        int answer = 0;
        text = text.toUpperCase();
        c = Character.toUpperCase(c);

        for (char t : text.toCharArray()) {
            if (t == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(m.sol(text, c));
    }

}