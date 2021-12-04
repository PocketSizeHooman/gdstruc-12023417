package com.gdstruc.module4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.add(new Player(1,"The Fool", 10));
        queue.add(new Player(2,"The Magician", 20));
        queue.add(new Player(3,"The High Priestess", 30));
        queue.add(new Player(4,"The Empress", 40));
        queue.add(new Player(5,"The Emperor", 50));
        queue.add(new Player(6,"The Hierophant", 60));
        queue.add(new Player(7,"The Lovers", 70));
        queue.add(new Player(8,"The Chariot", 80));
        queue.add(new Player(9,"Justice", 90));
        queue.add(new Player(10,"The Hermit", 100));
        queue.add(new Player(11,"Wheel of Fortune", 110));
        queue.add(new Player(12,"Strength", 120));
        queue.add(new Player(13,"The Hanged Man", 130));
        queue.add(new Player(14,"Death", 140));
        queue.add(new Player(15,"Temperance", 150));
        queue.add(new Player(16,"The Devil", 160));
        queue.add(new Player(17,"The Tower", 170));
        queue.add(new Player(18,"The Star", 180));
        queue.add(new Player(19,"The Moon", 190));
        queue.add(new Player(20,"The Sun", 200));
        queue.add(new Player(21,"Judgement", 210));
        queue.add(new Player(22,"1The World", 220));
        queue.add(new Player(23,"David", 230));
        queue.add(new Player(24,"Charles", 240));
        queue.add(new Player(25,"Julius Caesar", 250));
        queue.add(new Player(26,"Alexander the Great", 260));
        queue.add(new Player(27,"Athena", 270));
        queue.add(new Player(28,"Judith", 280));
        queue.add(new Player(29,"Rachel", 290));
        queue.add(new Player(30,"Argine", 300));
        queue.add(new Player(31,"Cloud", 310));
        queue.add(new Player(32,"Aerith", 320));
        queue.add(new Player(33,"Tifa", 330));
        queue.add(new Player(34,"Barret", 340));
        queue.add(new Player(35,"Sephiroth", 350));
        queue.add(new Player(36,"Zack", 360));
        queue.add(new Player(37,"Pharah", 370));
        queue.add(new Player(38,"Mercy", 380));
        queue.add(new Player(39,"Ana", 390));
        queue.add(new Player(40,"D.va", 400));
        queue.add(new Player(41,"Reinhardt", 410));
        queue.add(new Player(42,"Soldier:76", 420));
        queue.add(new Player(43,"Wrecking Ball", 430));
        queue.add(new Player(44,"Death", 440));
        queue.add(new Player(45,"Lucio", 450));
        queue.add(new Player(46,"Ashe", 460));
        queue.add(new Player(47,"Reaper", 470));
        queue.add(new Player(48,"Widowmaker", 480));
        queue.add(new Player(49,"Tracer", 490));
        queue.add(new Player(50,"Sombra", 500));

        //queue.printQueue();

        //System.out.println("After popping: " + queue.remove());
        //
        // queue.printQueue();

        int game = 1;

        while(game <= 10)
        {
            int randNum = getRandomNumber(1,7);

            System.out.println("Players in Queue: " + randNum);

            if(randNum >= 5)
            {
                System.out.println("Game Start! Game: " + game);
                for (int i = 0; i < 5; i++) {
                    System.out.println("Popped players: \n" + queue.peek());
                    queue.remove();
                }
                game++;

            }
            else if(randNum < 5)
            {
                System.out.println("Matchmaking...\n");

            }

            System.out.println("Press Any Key To Continue...");
            (new Scanner(System.in)).nextLine();


            if(game > 10)
            {
                break;
            }
        }
    }

    private static int getRandomNumber(int min, int max) {
        return (int)(Math.random() * (double)(max - min) + (double)min);
    }

}
