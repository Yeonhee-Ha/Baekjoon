import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        long n = Long.parseLong(br.readLine());
        
        //풀이


        //출력
        bw.write(String.valueOf(n * n) + "\n");
        bw.write("2");

        br.close();
        bw.flush();
        bw.close();
    }
}
