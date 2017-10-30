import java.util.Random;
import java.util.Scanner;


/**
 * test
 */
public class GraStatki
{
    private char[][] tab = new char[10][10];

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        GraStatki graStatki = new GraStatki();

        int wyborUzytkownika;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w grze w statki\n MENU\n11-reset planszy\n12-gra\n13-wyjscie\n");

        graStatki.reset();
        do
        {
            wyborUzytkownika = scanner.nextInt();
            switch (wyborUzytkownika)
            {
                case 11:
                    graStatki.reset();
                    break;
                case 12:
                    graStatki.planasza();
                    int x = 0, y = 0;
                    do
                    {
                        try
                        {
                            System.out.println("podaj pierwszy parametr strzału(liczba od 0 do 9)");
                            x = scanner.nextInt();
                            System.out.println("podaj drugi parametr strzału(liczba od 0 do 9)");
                            y = scanner.nextInt();
                            graStatki.shoot(x, y);
                            graStatki.planasza();
                        }
                        catch (ArrayIndexOutOfBoundsException e)
                        {
                            System.out.println("podałes zla wartosc");
                        }
                    }
                    while (x != 13 || y != 13);
                    System.out.println("dziękujemy i zapraszamy ponownie");
            }
        }
        while (wyborUzytkownika != 13);
        System.out.println("dziękujemy i zapraszamy ponownie");

    }

    private void planasza()
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

    private void reset()
    {
        Random random = new Random();
        final String s = "@+++";
        final int lenght = s.length();
        GraStatki graReset = new GraStatki();

        for (int i = 0; i < tab.length; i++)
        {
            for (int y = 0; y < tab[i].length; y++)
            {
                tab[i][y] = s.charAt(random.nextInt(lenght));
            }
        }
        graReset.planasza();
        System.out.println("\n");
    }

    private void shoot(int x, int y)
    {
        switch (tab[x][y])
        {
            case '+':
                tab[x][y] = 'o';
                break;
            case '@':
                tab[x][y] = 'X';
                break;
        }
        System.out.println("\n");
    }
}