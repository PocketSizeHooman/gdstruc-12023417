package com.gdstruc.midterms;

public class Main {
    public static void main(String[] args) {
        int discarded_cards = 0;
        CardStack stack = new CardStack(30);

        stack.push(new Card("The Fool", 1));
        stack.push(new Card("The Magician", 2));
        stack.push(new Card("The High Priestess", 3));
        stack.push(new Card("The Empress", 4));
        stack.push(new Card("The Emperor", 5));
        stack.push(new Card("The Hierophant", 6));
        stack.push(new Card("The Lovers", 7));
        stack.push(new Card("The Chariot", 8));
        stack.push(new Card("Justice", 9));
        stack.push(new Card("The Hermit", 10));
        stack.push(new Card("Wheel of Fortune", 11));
        stack.push(new Card("Strength", 12));
        stack.push(new Card("The Hanged Man", 13));
        stack.push(new Card("Death", 14));
        stack.push(new Card("Temperance", 15));
        stack.push(new Card("The Devil", 16));
        stack.push(new Card("The Tower", 17));
        stack.push(new Card("The Star", 18));
        stack.push(new Card("The Moon", 19));
        stack.push(new Card("The Sun", 20));
        stack.push(new Card("Judgement", 21));
        stack.push(new Card("The World", 22));
        stack.push(new Card("David", 23));
        stack.push(new Card("Charles", 24));
        stack.push(new Card("Julius Caesar", 25));
        stack.push(new Card("Alexander the Great", 26));
        stack.push(new Card("Athena", 27));
        stack.push(new Card("Judith", 28));
        stack.push(new Card("Rachel", 29));
        stack.push(new Card("Argine", 30));

        int a = stack.CardID();
        while (a >= 1) {
            System.out.println("\n");
            System.out.println("Number of Cards remaining:" + stack.sizeCards());

            stack.printStack();
            System.out.println("\n");
            if(stack.CardID() == 1){break;}

            int randNum = getRandomNumber(1, 5);
            System.out.println("Number of Cards to be Discarded: " + "\n" + randNum);

            for (int i = 0; i < randNum; i++){
                System.out.println("Discarded Cards: " + "\n" + stack.peek());
                if(stack.sizeCards() == 1) {
                    break;
                }else{
                    stack.pop();
                    discarded_cards++;
                }
                System.out.println("\n");
            }
            System.out.println("Press Any Key To Continue...");
            new java.util.Scanner(System.in).nextLine();
        }
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}