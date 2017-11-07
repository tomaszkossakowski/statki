package controller;

import static view.GameShips.tab;


public class GameBoard
{
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
}
