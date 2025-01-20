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
        /*
        1- for 문 : n-1 번
        2- for 믄 : n-i 번

        n-1       n*n -n
         ∑ n-i =   -----
        i=1          2
         */


        //출력
        bw.write(String.valueOf(((n * n)- n)/2) + "\n");
        bw.write("2");

        br.close();
        bw.flush();
        bw.close();
    }
}
