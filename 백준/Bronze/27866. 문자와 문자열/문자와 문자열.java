import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int n = scanner.nextInt();

        System.out.print(str.charAt(n-1));
    }
}

