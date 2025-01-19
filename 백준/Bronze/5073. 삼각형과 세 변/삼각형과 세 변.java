import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        String str;
        while (!(str = br.readLine()).equals("0 0 0")) {
            StringTokenizer tokenizer = new StringTokenizer(str);

            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());
            int C = Integer.parseInt(tokenizer.nextToken());


            //출력
            int max = Math.max(A, Math.max(B, C));
            if (max == A) {
                if (max >= B + C) {
                    bw.write("Invalid\n");
                    continue;
                }
            } else if (max == B) {
                if (max >= A + C) {
                    bw.write("Invalid\n");
                    continue;
                }
            } else {
                if (max >= A + B) {
                    bw.write("Invalid\n");
                    continue;
                }
            }

            if (A == B && A == C) {
                bw.write("Equilateral\n");
            } else if (A == B || A == C || B == C) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }
}
