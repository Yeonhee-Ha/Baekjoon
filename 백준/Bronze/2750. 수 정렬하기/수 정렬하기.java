import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        Set<Integer> list = new TreeSet<>();

        br.readLine();
        
        String str;
        while ((str = br.readLine()) != null) {
            list.add(Integer.parseInt(str));
        }



        //출력
        if (!list.isEmpty()) {
            for (int num : list) {
                bw.write(String.valueOf(num) + "\n");
            }
        } else {
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}



