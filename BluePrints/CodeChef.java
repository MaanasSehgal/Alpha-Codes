import java.util.*;
import java.io.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line != null) {
                        st = new StringTokenizer(line);
                    } else {
                        return null;  // End of input
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            String token = next();
            return token != null ? Integer.parseInt(token) : 0;
        }

        long nextLong() {
            String token = next();
            return token != null ? Long.parseLong(token) : 0;
        }

        double nextDouble() {
            String token = next();
            return token != null ? Double.parseDouble(token) : 0.0;
        }

        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void flush() throws IOException {
            bw.flush();
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();
            FastWriter out = new FastWriter();
            
            // write your code here
            int testcases = sc.nextInt();
            for (int i = 1; i <= testcases; i++) {
                
            }
            
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}