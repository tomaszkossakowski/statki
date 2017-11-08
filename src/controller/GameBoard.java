package controller;

import java.util.Random;


public class GameBoard

{
    private static char[][] tab = new char[10][10];

    public void gameBoard()
    {
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = 0; j < tab[i].length; j++)
            {
                System.out.print(tab[i][j] + " ");
                if (j == 9)
                {
                    System.out.println();
                }
            }
        }
    }

    public void reset()
    {
        Random random = new Random();
        final String s = "@+++";
        final int lenght = s.length();

        for (int i = 0; i < tab.length; i++)
        {
            for (int y = 0; y < tab[i].length; y++)
            {
                tab[i][y] = s.charAt(random.nextInt(lenght));
            }
        }
        System.out.println("\n");
    }

    public void shoot(int x, int y)
    {
        switch (tab[x][y])
        {
            case '+':
                tab[x][y] = 'o';
                System.out.println("PUDLO");
                break;
            case '@':
                tab[x][y] = 'X';
                System.out.println("TRAFIONY");
                break;
        }
        System.out.println("\n");
    }
}
