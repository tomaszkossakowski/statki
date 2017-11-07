package controller;

import static view.GameShips.tab;

import java.util.Random;


public class Reset
{
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

}

