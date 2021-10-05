package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        Player eivor = new Player(1,"Eivor",400);
        Player randvi = new Player(2,"Randvi",350);
        Player frejya = new Player(3,"Frejya", 500);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(eivor);
        playerLinkedList.addToFront(randvi);
        playerLinkedList.addToFront(frejya);


        playerLinkedList.printList();
        System.out.println("\n");

        //1) remove first element
        playerLinkedList.countNode();
        System.out.println("\n");


        //2)Shows how many elements in linked list

        playerLinkedList.removeFirstElement();
        System.out.println("List after removing first element: ");
        playerLinkedList.printList();
        playerLinkedList.countNode();


    }
}
