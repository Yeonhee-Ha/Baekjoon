import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

//27323번 직사각형

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());
        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());

        int min = Math.min(B - y, y);
        min = Math.min(min, A - x);
        min = Math.min(min, x);

        bw.write(Integer.toString(min));


        //출력
        br.close();
        bw.flush();
        bw.close();
    }
}
