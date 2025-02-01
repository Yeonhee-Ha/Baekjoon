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

        int[] C = new int[A];
        String[] str = new String[A];
        str = br.readLine().split(" ");

        for (int i = 0; i < A; i++) {
            C[i] = Integer.parseInt(str[i]);
        }

        //풀이
        int result = search (C, A, B);


        //출력
        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    static int search(int[] arr, int A, int B){
        int temp =0;

        for (int i = 0; i < A - 2; i++) {
            for (int j = i + 1; j < A - 1; j++) {
                for (int k = j + 1; k < A; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (B == sum) {
                        return sum;
                    } else if (temp <sum && sum <B) {
                        temp = sum;
                    }
                }
            }
        }
        return temp;
    }
}



