/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author kangpawan
 * date edited - 6 June 2020
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        boolean state = true;
        Card[] magicHand = new Card[7];
        
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
             c.setValue(c.randVal());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        c.setSuit(Card.SUITS[c.randSuit()]);
        magicHand[i] = c;
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());

                    System.out.println("Enter The Card Value : ");
        int cardValue = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Enter The Suit : ");
        String suitValue = input.nextLine();
        
        Card a = new Card();
        a.setValue(cardValue);
        a.setSuit(suitValue);

        for(int i = 0; i < magicHand.length; i++ ){
            if(a.getSuit().equals(magicHand[i].getSuit()) && a.getValue() == magicHand[i].getValue()){
                state = true;
                break;
            }
        }
        
        if(state == true){
            System.out.println("Card Found In Array");
        }
        else{
            System.out.println("Card Not Found!");
        }

        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
    }
    
}
