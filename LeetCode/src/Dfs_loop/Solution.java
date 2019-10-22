package Dfs_loop;
//http://codeforces.com/contest/510/submission/9686657
import java.util.Scanner;
import java.io.*;

/*
 * 
3
3
AAA
ABA
AAA

3
3
AAA
ABA
AAB

 * */


public class Solution {
	static int N = 55;
	static int INF = 1000000007;

	static int[][] g = new int[N][N];

	static boolean[][] vis = new boolean[N][N];
	static  boolean ok;
	static  int[][] dist= new int [N][N];
	static int n;
	static int m;
	static int dir[][] = {{1, 0}, {0, -1}, {0, 1},{-1,0}};

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		cin >> n >> m;
		
		Scanner sb = new Scanner(System.in);
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		m=Integer.parseInt(cin.readLine());
		n= Integer.parseInt(cin.readLine());
		int count=0;
		while(count < m) {
			String s = cin.readLine();
			for(int j = 1; j<= s.length(); j++){
				g[count+1][j] = s.charAt(j-1) - 'A';
			}
			count++;
		}
		
		
		ok = false;
		for(int i = 1; i<=n && !ok; i++){
			for(int j = 1; j<=m && !ok; j++){
				for(int k = 0; k<N; k++)
					for(int l = 0; l < N; l++)
						dist[k][l] = INF;
//				memset(vis, 0, sizeof(vis));
				dist[i][j] = 1;
				dfs(i, j);
			
				if (ok){
					System.out.println("Yes");
					return ;
				}
			}
		}
		System.out.println("No");
		return;
		
		//end

	}
	static void dfs(int x, int y){
		if (ok || vis[x][y]) return ;
		vis[x][y] = true;
		for(int i = 0; i<4; i++){
			int r = x + dir[i][0];
			int s = y + dir[i][1];
			if (r < 1 || r > n || s < 1 || s > m) 
				continue;
			if (dist[r][s] != INF && Math.abs(dist[x][y]-dist[r][s]) >= 3){
				ok = true;
				//cout << r << " " << s <<" " << dist[r][s]<< endl;
			}
			else if (g[x][y] == g[r][s] && !vis[r][s]){
				dist[r][s] = dist[x][y] + 1;
				dfs(r, s);
			}
		}
	}
}
