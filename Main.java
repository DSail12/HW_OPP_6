// Рефакторинг и\или оптимизация проекта предыдущего дз с учетом теоретических основ SOLID’а

package OOP_6;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        HeroTeam.Init();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ConsoleView.view();
            System.out.println("Press ENTER");
            scanner.nextLine();
            gameStep();
            if (HeroTeam.deadTeam(HeroTeam.whiteSide) || HeroTeam.deadTeam(HeroTeam.darkSide)) {
                ConsoleView.view();
                System.out.println("The end");
                break;
            }
        }

    }

    public static void gameStep() {
        System.out.print("----------Ходят светлые силы----------");
        for (int i = 0; i < HeroTeam.GANG_SIZE; i++) {
            HeroTeam.whiteSide.get(i).step(HeroTeam.darkSide);
        }

        System.out.print("\n----------Ходят тёмные силы----------");
        for (int i = 0; i < HeroTeam.GANG_SIZE; i++) {
            HeroTeam.darkSide.get(i).step(HeroTeam.whiteSide);
        }

    }
}
