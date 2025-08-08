import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int bx, by, i ,j,qx, qy;
        Scanner in  = new Scanner(System.in);
        int x1,x2,y1,y2;
        bx = in.nextInt();
        by = in.nextInt();
        boolean bi[][] = new boolean[4][4];
        boolean qu[][] = new boolean[4][4];
        char board[][] = new char[4][4];
        x1 = x2 = bx;
        y1 = y2 = by;
        for(i=1;i<=3;i++)
        {
            x1 = x1 + 1;
            y1 = y1 + 1;
            x2 = x2 - 1;
            y2 = y2 - 1;
            if(x1<=4 && y1<=4)
                bi[x1-1][y1-1] = true;
            if(x2>0 && y2>0)
                bi[x2-1][y2-1] = true;
        }
        x1 = x2 = bx;
        y1 = y2 = by;
        for(i=1;i<=4;i++)
        {
            x1 = x1 + 1;
            y1 = y1 - 1;
            x2 = x2 - 1;
            y2 = y2 + 1;
            if(x1<=4 && y1>0)
                bi[x1-1][y1-1] = true;
            if(x2>0 && y2<=4)
                bi[x2-1][y2-1] = true;
        }
        qx = in.nextInt();
        qy = in.nextInt();
        x1 = x2 = qx;
        y1 = y2 = qy;
        for(i=1;i<=3;i++)
        {
            x1 = x1 + 1;
            y1 = y1 + 1;
            x2 = x2 - 1;
            y2 = y2 - 1;
            if(x1<=4 && y1<=4)
                qu[x1-1][y1-1] = true;
            if(x2>0 && y2>0)
                qu[x2-1][y2-1] = true;
        }
        x1 = x2 = qx;
        y1 = y2 = qy;
        for (i = 0; i<4; i++) 
        {
            qu[qx-1][i] = true;
            qu[i][qy-1] = true;
        }
        for(i=1;i<=4;i++)
        {
            x1 = x1 + 1;
            y1 = y1 - 1;
            x2 = x2 - 1;
            y2 = y2 + 1;
            if(x1<=4 && y1>0)
                qu[x1-1][y1-1] = true;
            if(x2>0 && y2<=4)
                qu[x2-1][y2-1] = true;
        }
        for (i=0; i<4; i++) 
        {
            for (j=0; j<4; j++) 
            {
                if (bi[i][j] && qu[i][j])
                    board[i][j] = '%';
                else if (bi[i][j])
                    board[i][j] = '*';
                else if (qu[i][j])
                    board[i][j] = '$';
                else
                    board[i][j] = '.';
            }
        }
        board[bx-1][by-1] = 'B';
        board[qx-1][qy-1] = 'Q';
        for (i=0; i<4; i++) 
        {
            for (j=0; j<4; j++) 
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

	static void spiralMatrix(int arr[][]){
		int top=0,left=0;
		int bottom=arr[0].length,right=arr.length;
		while(top<bottom&&left<right){
			
		
}


