package view;

import java.util.Scanner;

import controller.GameBoard;
import controller.Reset;
import controller.Shoot;


public class GameShips
{
    public static char[][] tab = new char[10][10];

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        GameBoard gameBoard = new GameBoard();
        Shoot shoot = new Shoot();
        Reset reset = new Reset();

        int userSelection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w grze w statki\n MENU\n11-reset planszy\n12-gra\n13-wyjscie\n");

        reset.reset();
        do
        {
            userSelection = scanner.nextInt();
            switch (userSelection)
            {
                case 11:
                    reset.reset();
                    gameBoard.gameBoard();
                    System.out.println("Witaj w grze w statki\n MENU\n11-reset planszy\n12-gra\n13-wyjscie\n");
                    break;

                case 12:
                    gameBoard.gameBoard();
                    int x = 0, y = 0;
                    do
                    {
                        try
                        {
                            System.out.println("podaj pierwszy parametr strzału(liczba od 0 do 9)");
                            x = scanner.nextInt();
                            if (x == 11)
                            {
                                reset.reset();
                                gameBoard.gameBoard();
                                continue;
                            }
                            else if (x == 13)
                            {
                                break;
                            }
                            System.out.println("podaj drugi parametr strzału(liczba od 0 do 9)");
                            y = scanner.nextInt();
                            if (y == 11)
                            {
                                reset.reset();
                                gameBoard.gameBoard();
                                continue;
                            }
                            shoot.shoot(x, y);
                            gameBoard.gameBoard();
                        }
                        catch (ArrayIndexOutOfBoundsException e)
                        {
                            System.out.println("podałes zla wartosc");
                        }
                    }
                    while (x != 13 || y != 13);
                    System.out.println("dziękujemy i zapraszamy ponownie");
                    System.exit(0);
            }
        }
        while (userSelection != 13);
        System.out.println("dziękujemy i zapraszamy ponownie");
    }
}



