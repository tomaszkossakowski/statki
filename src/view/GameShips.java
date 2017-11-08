package view;

import java.util.Scanner;

import controller.GameBoard;


public class GameShips
{

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        GameBoard gameBoard = new GameBoard();
        final int reset = 11;
        final int game = 12;
        final int exit = 13;
        int userSelection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w grze w statki\n MENU\n11-reset planszy\n12-gra\n13-wyjscie\n");

        gameBoard.reset();
        do
        {
            userSelection = scanner.nextInt();
            switch (userSelection)
            {
                case reset:
                    gameBoard.reset();
                    gameBoard.gameBoard();
                    System.out.println("Witaj w grze w statki\n MENU\n11-reset planszy\n12-gra\n13-wyjscie\n");
                    break;

                case game:
                    gameBoard.gameBoard();
                    int x = 0, y = 0;
                    do
                    {
                        try
                        {
                            System.out.println("podaj pierwszy parametr strzału(liczba od 0 do 9)");
                            x = scanner.nextInt();
                            if (x == reset)
                            {
                                gameBoard.reset();
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
                                gameBoard.reset();
                                gameBoard.gameBoard();
                                continue;
                            }
                            gameBoard.shoot(x, y);
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



