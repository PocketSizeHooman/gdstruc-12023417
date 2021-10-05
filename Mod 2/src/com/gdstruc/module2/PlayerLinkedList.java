package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList(){
        PlayerNode current = head;
        System.out.print("HEAD - > ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void countNode()
    {
        PlayerNode current = head;
        int counter = 0;
        while (current != null)
        {
            counter++;
            current = current.getNextPlayer();
        }
        System.out.println("Number of elements: " + counter);
    }

    public void removeFirstElement()
    {
        PlayerNode first = head;
        PlayerNode temp = first.getNextPlayer();
        first = null;
        head = temp;
    }
}
