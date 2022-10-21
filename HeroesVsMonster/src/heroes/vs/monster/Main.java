package heroes.vs.monster;

import heroes.vs.monster.etrevivants.Etresvivant;
import heroes.vs.monster.etrevivants.Monster;

public class Main {
    public static void main(String[] args) {
        Etresvivant[][] boardGame = new Etresvivant[15][15];
        char[][] visualBoardGame = new char[15][15];

        for (int i = 0; i < 15; i++) {
            visualBoardGame[i][i] = '*';
        }

        for (int i = 0; i < 15; i++) {


            for (int j = 0; j < 15 ; j++) {
                System.out.print(visualBoardGame[j][j] + " ");
            }
            System.out.println(visualBoardGame[i][i]);
        }

    }
}