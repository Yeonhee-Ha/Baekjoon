import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        // 밑변 n + 윗변 n + 옆변 2n

        long n = Integer.parseInt(br.readLine());
        long answer = 4 * n;

        bw.write(String.valueOf(answer));

        //출력
        br.close();
        bw.flush();
        bw.close();
    }
}
