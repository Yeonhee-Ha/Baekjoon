import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

//27323번 직사각형

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        int A = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        bw.write(String.valueOf(A));

        //출력
        br.close();
        bw.flush();
        bw.close();
    }
}
