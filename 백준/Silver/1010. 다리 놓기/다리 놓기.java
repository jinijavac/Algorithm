import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1010번
public class Main {
    //파스칼의 삼각형 ??
    //n-1Cr-1 + n-1Cr = nCr
    //그냥 조합 방식 쓰면 계산량 너무 많아짐 (시간 초과) --> 파스칼의 삼각형 공식으로 쪼개서 반복문 돌리기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //테스트 개수 받기

        int[][] dp = new int[30][30]; //배열 만들기

        //배열 초기화 -> 값 1일 때
        for (int i = 0; i < 30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        //파스칼 삼각형 공식
        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        //N,M 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(dp[M][N]);
        }
    }
}