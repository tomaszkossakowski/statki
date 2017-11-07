package controller;

import static view.GameShips.tab;


public class Shoot
{
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
