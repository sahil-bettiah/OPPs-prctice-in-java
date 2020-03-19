package com.company;
import java.util.Scanner;

public class tictacoe  {

    public static void main(String[] args) {

        matrix m = new matrix();
        Scanner input = new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Welcome to TICTACTOE game!!!");
        do
        {
            System.out.println(m.player==m.A?"X turn":"O turn");
            System.out.println("Enter a and b place");
            a=input.nextInt();
            b=input.nextInt();

            m.put(a, b);
            System.out.println(m.display());
            System.out.println("_____________________________");
            m.windisp();

        }while(m.empty);
    }
}

class matrix
{
    public static final int A = 1, B = -1;
    public static final int EMPTY = 0;

    public int player = A;
    private int[][] board = new int[3][3];
    public boolean empty = false;

    public void put(int x, int y)
    {
        if(x<0 || x>2 || y<0 || y>2)
        {
            System.out.println("Invalid position");
            return;
        }
        if(board[x][y] != EMPTY)
        {
            System.out.println("position occupied");
            return;
        }
        board[x][y] = player;
        player = -player;
    }

    public boolean isWin(int player)
    {
        return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
                (board[1][0] + board[1][1] + board[1][2] == player*3) ||
                (board[2][0] + board[2][1] + board[2][2] == player*3) ||
                (board[0][0] + board[1][0] + board[2][0] == player*3) ||
                (board[0][1] + board[1][1] + board[2][1] == player*3) ||
                (board[0][2] + board[1][2] + board[2][2] == player*3) ||
                (board[0][0] + board[1][1] + board[2][2] == player*3) ||
                (board[2][0] + board[1][1] + board[0][2] == player*3));
    }

    public void windisp()
    {
        if(isWin(A))
        {
            System.out.println("\n X wins!");
            empty=false;
        }
        else if(isWin(B))
        {
            System.out.println("\n O wins!");
            empty=false;
        }
        else
        {
            if(!empty)
            {
                System.out.println("tie");
            }

        }
    }

    public String display()
    {
        StringBuilder s = new StringBuilder();
        empty = false;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                switch(board[i][j])
                {
                    case A:
                        s.append(" X ");
                        break;
                    case B:
                        s.append(" O ");
                        break;
                    case EMPTY:
                        s.append("   ");
                        empty=true;
                        break;
                }
                if(j<2)
                {
                    s.append("|");
                }

            }
            if(i<2)
            {
                s.append("\n-----------\n");
            }
        }
        return s.toString();
    }
}