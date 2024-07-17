import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        long A[][] = new long[N+1][N+1];

        // 원본 배열 저장
        for(int i=1; i<=N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=1; j<=N; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        // 구간합
        long S[][] = new long[N+1][N+1];
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                S[i][j] = S[i-1][j] + S[i][j-1] - S[i-1][j-1] + A[i][j];
            }
        }

        //
        for(int i=0; i<M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1]);
        }


    }
}
