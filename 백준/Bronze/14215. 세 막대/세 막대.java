import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());
        int C = Integer.parseInt(tokenizer.nextToken());

        //풀이
        int max = Math.max(A, Math.max(B, C));
        int result =0;

        if (max >= (A + B + C - max)) {
            int newMax = (A + B + C - max) - 1;
            result = newMax + (A + B + C - max);
        } else {
            result = A+B+C;
        }

        //출력
        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }
}
