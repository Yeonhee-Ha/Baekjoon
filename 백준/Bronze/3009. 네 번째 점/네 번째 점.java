import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        String[] A = new String[2];
        String[] B = new String[2];
        String[] C = new String[2];

        A = br.readLine().split(" ");
        B = br.readLine().split(" ");
        C = br.readLine().split(" ");

        if (A[0].equals(B[0])) {
            bw.write(C[0] + " ");
        } else if (A[0].equals(C[0])) {
            bw.write(B[0] + " ");
        } else {
            bw.write(A[0] + " ");
        }

        if (A[1].equals(B[1])) {
            bw.write(C[1]);
        } else if (A[1].equals(C[1])) {
            bw.write(B[1]);
        } else {
            bw.write(A[1]);
        }


        //출력
        br.close();
        bw.flush();
        bw.close();
    }
}
