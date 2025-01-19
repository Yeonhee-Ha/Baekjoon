import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        //출력
        if (A + B + C != 180) {
            bw.write("Error");
        } else if (A == B && A == C) {
            bw.write("Equilateral");
        } else if (A == B || A == C || B == C) {
            bw.write("Isosceles");
        } else {
            bw.write("Scalene");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
