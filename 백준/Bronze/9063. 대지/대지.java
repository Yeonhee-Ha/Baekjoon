import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        // 최소값 최대값

        int n = Integer.parseInt(br.readLine());
        int xMin=10001, xMax=-10001, yMin=10001, yMax=-10001;

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());

            if (xMin > A) {
                xMin = A;
            }
            if (xMax < A) {
                xMax = A;
            }

            if (yMin > B) {
                yMin = B;
            }
            if (yMax < B) {
                yMax = B;
            }
        }

        if (xMin == 10001 || xMax == -10001 || yMin == 10001 || yMax == -10001) {
            bw.write(String.valueOf(0));
        } else {
            bw.write(String.valueOf((xMax - xMin) * (yMax - yMin)));
        }


        //출력
        br.close();
        bw.flush();
        bw.close();
    }
}
