package com.gdstruc.midterms;

import java.util.EmptyStackException;

public class CardStack {
    public Card[] stack;
    private int top;

    public CardStack(int capacity)
    {
        stack = new Card[capacity];
    }

    public void push(Card cardName)
    {
        if(top == stack.length)
        {
            Card[] newStack = new Card[2*stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = cardName;
    }

    public Card pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        Card poppedCard = stack[--top];
        stack[top] = null;
        return poppedCard;

    }

    public Card peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top-1];
    }

    public int CardID()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top-1].getCardId();
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        System.out.println("Cards: ");
        for(int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }

    public  int sizeCards()
    {
        return top;
    }


}


