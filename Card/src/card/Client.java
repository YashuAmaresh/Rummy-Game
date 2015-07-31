/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

public class Client {
    public static void main(String args[]) {
        Hand hand = new Hand();
        System.out.println(hand.getMinCardsForSet());
    }
    
}
