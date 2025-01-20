import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());

        int C = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        //풀이
        if (A > C) {
            if (A * 100 + B <= C * 100) {
                bw.write("1");
            } else {
                bw.write("0");
            }
        } else {
            if (A * N + B <= C * N) {
                bw.write("1");
            } else {
                bw.write("0");
            }
        }


        //출력

        br.close();
        bw.flush();
        bw.close();
    }
}
