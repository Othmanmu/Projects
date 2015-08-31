/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flaregames.task.test.cases;

import com.flaregames.task.core.Card;
import com.flaregames.task.core.Hand;
import com.flaregames.task.core.PokerManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tms-mustafa
 */
public class PokerManagerTest {

    public PokerManagerTest() {
    }

    @Before
    public void setUp() {
    }
 
    /**
     * Test of generateCards method, of class PokerManager.
     */
    @Test
    public void testGenerateCards() {
        System.out.println("generateCards");
        PokerManager instance = new PokerManager();

        ArrayList<Card> result = instance.generateCards();
        // check number of generated cards.
        assertEquals(52, result.size());

        // check duplicate cards.
        Set<Card> set = new HashSet<Card>(result);
        assertEquals(set.size(), result.size());

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetStarightFlushRank() {
        System.out.println("testGetStarightFlushRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(5, "C");
        handCards.add(card);
        card = new Card(6, "C");
        handCards.add(card);
        card = new Card(7, "C");
        handCards.add(card);
        card = new Card(8, "C");
        handCards.add(card);
        card = new Card(9, "C");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.STRAIGHT_FLSUH;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetStarightRank() {
        System.out.println("testGetStarightRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(5, "C");
        handCards.add(card);
        card = new Card(6, "D");
        handCards.add(card);
        card = new Card(7, "C");
        handCards.add(card);
        card = new Card(8, "C");
        handCards.add(card);
        card = new Card(9, "C");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.STRAIGHT;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetFlushRank() {
        System.out.println("testGetFlushRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(5, "C");
        handCards.add(card);
        card = new Card(9, "C");
        handCards.add(card);
        card = new Card(7, "C");
        handCards.add(card);
        card = new Card("J", "C");
        handCards.add(card);
        card = new Card(9, "C");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.FLUSH;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetFourOfKindRank() {
        System.out.println("testGetFourOfKindRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(9, "C");
        handCards.add(card);
        card = new Card(9, "H");
        handCards.add(card);
        card = new Card(7, "D");
        handCards.add(card);
        card = new Card(9, "C");
        handCards.add(card);
        card = new Card(9, "C");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.FOUR_OF_KIND;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetThreeOfKindRank() {
        System.out.println("testGetThreeOfKindRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(4, "C");
        handCards.add(card);
        card = new Card(9, "H");
        handCards.add(card);
        card = new Card(7, "D");
        handCards.add(card);
        card = new Card(4, "C");
        handCards.add(card);
        card = new Card(4, "S");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.THREE_OF_KIND;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetFullHouseRank() {
        System.out.println("testGetFullHouseRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(4, "C");
        handCards.add(card);
        card = new Card(9, "H");
        handCards.add(card);
        card = new Card(9, "D");
        handCards.add(card);
        card = new Card(4, "C");
        handCards.add(card);
        card = new Card(4, "S");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.FULL_HOUSE;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetOnePairRank() {
        System.out.println("testGetOnePairRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(4, "C");
        handCards.add(card);
        card = new Card(9, "H");
        handCards.add(card);
        card = new Card(9, "D");
        handCards.add(card);
        card = new Card(6, "C");
        handCards.add(card);
        card = new Card(2, "S");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.PAIR;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetTwoPairsRank() {
        System.out.println("testGetTwoPairsRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(2, "C");
        handCards.add(card);
        card = new Card(9, "H");
        handCards.add(card);
        card = new Card(9, "D");
        handCards.add(card);
        card = new Card(6, "C");
        handCards.add(card);
        card = new Card(2, "S");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.TWO_PAIRS;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class PokerManager.
     */
    @Test
    public void testGetHighCardRank() {
        System.out.println("testGetTwoPairsRank");

        ArrayList<Card> handCards = new ArrayList<>();

        Card card = new Card(2, "C");
        handCards.add(card);
        card = new Card(8, "H");
        handCards.add(card);
        card = new Card(10, "D");
        handCards.add(card);
        card = new Card(6, "C");
        handCards.add(card);
        card = new Card(3, "S");
        handCards.add(card);

        Hand hand = new Hand(handCards);
        PokerManager instance = new PokerManager();
        Hand.Rank expResult = Hand.Rank.HIGH_CARD;

        Hand.Rank result = instance.getRank(hand);
        assertEquals(expResult, result);

    }

   

    /**
     * Test of getWinner method, of class PokerManager.
     */
    @Test
    public void testGetWinnerForStraightFlush() {
        System.out.println("testGetWinnerForStraightFlush");

        ArrayList<Card> firstHandCards = new ArrayList<>();
        ArrayList<Card> secondHandCards = new ArrayList<>();
        PokerManager instance = new PokerManager();

        // Straight Flush , Same max value
        Card card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(4, "C");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);
        card = new Card(3, "C");
        firstHandCards.add(card);

        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(4, "D");
        secondHandCards.add(card);
        card = new Card(5, "D");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);

        Hand firstPlayer = new Hand(firstHandCards);
        Hand secondPlayer = new Hand(secondHandCards);

        int expResult = 0;

        int result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        // Straight Flush ,   different value (First Player has higher value)
        firstHandCards.clear();
        secondHandCards.clear();
        card = new Card(7, "C");
        firstHandCards.add(card);
        card = new Card(4, "C");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);
        card = new Card(3, "C");
        firstHandCards.add(card);

        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(4, "D");
        secondHandCards.add(card);
        card = new Card(5, "D");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);

        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);

        // first player should win as he has higher rank.
        expResult = 1;

        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        // Straight Flush ,  different value (Second Player has higher value)
        firstHandCards.clear();
        secondHandCards.clear();

        card = new Card(7, "C");
        firstHandCards.add(card);
        card = new Card(4, "C");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);
        card = new Card(3, "C");
        firstHandCards.add(card);

        card = new Card(7, "D");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(9, "D");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);

        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);

        // second player should win as he has higher rank.
        expResult = -1;

        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

    }

    /**
     * Test of getWinner method, of class PokerManager.
     */
    @Test
    public void testGetWinnerForFourInKind() {
        System.out.println("testGetWinnerForFourInKind");

        ArrayList<Card> firstHandCards = new ArrayList<>();
        ArrayList<Card> secondHandCards = new ArrayList<>();
        PokerManager instance = new PokerManager();

        // Four in Kind , Same max value
        Card card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(2, "D");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(3, "C");
        firstHandCards.add(card);

        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(2, "S");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(9, "D");
        secondHandCards.add(card);

        Hand firstPlayer = new Hand(firstHandCards);
        Hand secondPlayer = new Hand(secondHandCards);

        int expResult = 0;

        int result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        // Four in Kind , Same max value(First Player has higher value)
        firstHandCards.clear();
        secondHandCards.clear();

        card = new Card(7, "C");
        firstHandCards.add(card);
        card = new Card(7, "C");
        firstHandCards.add(card);
        card = new Card(7, "H");
        firstHandCards.add(card);
        card = new Card(7, "C");
        firstHandCards.add(card);
        card = new Card(3, "C");
        firstHandCards.add(card);

        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(6, "S");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);

        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);

        // second player should win as he has higher rank.
        expResult = 1;

        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        // Four in Kind , Same max value(Second Player has higher value)
        firstHandCards.clear();
        secondHandCards.clear();

        card = new Card(7, "C");
        firstHandCards.add(card);
        card = new Card(7, "C");
        firstHandCards.add(card);
        card = new Card(7, "H");
        firstHandCards.add(card);
        card = new Card(7, "C");
        firstHandCards.add(card);
        card = new Card(3, "C");
        firstHandCards.add(card);

        card = new Card(10, "D");
        secondHandCards.add(card);
        card = new Card(10, "S");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);

        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);

        // second player should win as he has higher rank.
        expResult = -1;

        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

    }

    /**
     * Test of getWinner method, of class PokerManager.
     */
    @Test
    public void testGetWinnerForFlush() {
        System.out.println("testGetWinnerForFourInKind");

        ArrayList<Card> firstHandCards = new ArrayList<>();
        ArrayList<Card> secondHandCards = new ArrayList<>();
        PokerManager instance = new PokerManager();

        // Flush , Same max value
        Card card = new Card(1, "C");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(9, "C");
        firstHandCards.add(card);
        card = new Card(7, "C");
        firstHandCards.add(card);

        card = new Card(1, "D");
        secondHandCards.add(card);
        card = new Card(7, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(9, "D");
        secondHandCards.add(card);

        int expResult = 0;
        Hand firstPlayer = new Hand(firstHandCards);
        Hand secondPlayer = new Hand(secondHandCards);
        int result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();

        // Flush , First Player have higher value.
        card = new Card(1, "C");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card("J", "C");
        firstHandCards.add(card);
        card = new Card(7, "C");
        firstHandCards.add(card);

        card = new Card(1, "D");
        secondHandCards.add(card);
        card = new Card(7, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(9, "D");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , Second Player have higher value.
        card = new Card(1, "C");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card("J", "C");
        firstHandCards.add(card);
        card = new Card(7, "C");
        firstHandCards.add(card);

        card = new Card(1, "D");
        secondHandCards.add(card);
        card = new Card(7, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card("K", "D");
        secondHandCards.add(card);

        expResult = -1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);
    }

    /**
     * Test of getWinner method, of class PokerManager.
     */
    @Test
    public void testGetWinnerForStraight() {
        System.out.println("testGetWinnerForStraight");

        ArrayList<Card> firstHandCards = new ArrayList<>();
        ArrayList<Card> secondHandCards = new ArrayList<>();
        PokerManager instance = new PokerManager();

        // Flush , Same max value
        Card card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(6, "D");
        firstHandCards.add(card);
        card = new Card(4, "H");
        firstHandCards.add(card);
        card = new Card(3, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(5, "C");
        secondHandCards.add(card);
        card = new Card(4, "H");
        secondHandCards.add(card);
        card = new Card(6, "S");
        secondHandCards.add(card);

        int expResult = 0;
        Hand firstPlayer = new Hand(firstHandCards);
        Hand secondPlayer = new Hand(secondHandCards);
        int result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();

        // Flush , First Player have higher value.
        card = new Card(5, "C");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);
        card = new Card(9, "D");
        firstHandCards.add(card);
        card = new Card(7, "S");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);

        card = new Card(1, "D");
        secondHandCards.add(card);
        card = new Card(3, "S");
        secondHandCards.add(card);
        card = new Card(2, "C");
        secondHandCards.add(card);
        card = new Card(5, "D");
        secondHandCards.add(card);
        card = new Card(4, "D");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , Second Player have higher value.
        card = new Card(1, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(5, "S");
        firstHandCards.add(card);
        card = new Card(4, "C");
        firstHandCards.add(card);

        card = new Card(9, "D");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);
        card = new Card("J", "D");
        secondHandCards.add(card);

        expResult = -1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);
    }

    /**
     * Test of getWinner method, of class PokerManager.
     */
    @Test
    public void testGetWinnerForThreeInKind() {
        System.out.println("testGetWinnerForThreeInKind");

        ArrayList<Card> firstHandCards = new ArrayList<>();
        ArrayList<Card> secondHandCards = new ArrayList<>();
        PokerManager instance = new PokerManager();

        // Flush , Same max value
        Card card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(2, "D");
        firstHandCards.add(card);
        card = new Card(2, "H");
        firstHandCards.add(card);
        card = new Card(3, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(2, "C");
        secondHandCards.add(card);
        card = new Card(4, "H");
        secondHandCards.add(card);
        card = new Card(6, "S");
        secondHandCards.add(card);

        int expResult = 0;
        Hand firstPlayer = new Hand(firstHandCards);
        Hand secondPlayer = new Hand(secondHandCards);
        int result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();

        // Flush , First Player have higher value.
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);
        card = new Card(10, "D");
        firstHandCards.add(card);
        card = new Card(5, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(1, "D");
        secondHandCards.add(card);
        card = new Card(3, "S");
        secondHandCards.add(card);
        card = new Card(3, "C");
        secondHandCards.add(card);
        card = new Card(5, "D");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , Second Player have higher value.
        card = new Card(3, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(5, "S");
        firstHandCards.add(card);
        card = new Card(3, "C");
        firstHandCards.add(card);

        card = new Card(7, "D");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);
        card = new Card(7, "D");
        secondHandCards.add(card);

        expResult = -1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);
    }

    /**
     * Test of getWinner method, of class PokerManager.
     */
    @Test
    public void testGetWinnerForTwoPair() {
        System.out.println("testGetWinnerForTwoPair");

        ArrayList<Card> firstHandCards = new ArrayList<>();
        ArrayList<Card> secondHandCards = new ArrayList<>();
        PokerManager instance = new PokerManager();

        // Two Pairs , Same Pairs
        Card card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(2, "D");
        firstHandCards.add(card);
        card = new Card(3, "H");
        firstHandCards.add(card);
        card = new Card(3, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(3, "C");
        secondHandCards.add(card);
        card = new Card(3, "H");
        secondHandCards.add(card);
        card = new Card(6, "S");
        secondHandCards.add(card);

        int expResult = 0;
        Hand firstPlayer = new Hand(firstHandCards);
        Hand secondPlayer = new Hand(secondHandCards);
        int result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();

        // Flush , First Player have higher value with different pairs
        card = new Card(8, "C");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);
        card = new Card(10, "D");
        firstHandCards.add(card);
        card = new Card(1, "S");
        firstHandCards.add(card);
        card = new Card(1, "C");
        firstHandCards.add(card);

        card = new Card(1, "D");
        secondHandCards.add(card);
        card = new Card(3, "S");
        secondHandCards.add(card);
        card = new Card(3, "C");
        secondHandCards.add(card);
        card = new Card(5, "D");
        secondHandCards.add(card);
        card = new Card(5, "D");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , Second Player have higher value value with different pairs.
        card = new Card(3, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(5, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(7, "D");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);

        expResult = -1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , First Player have higher value value with same pair.
        card = new Card(3, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(5, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);
        card = new Card(4, "D");
        secondHandCards.add(card);
        card = new Card(4, "D");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , Second Player have higher value value with same pair.
        card = new Card(3, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(5, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);

        expResult = -1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);
    }

    /**
     * Test of getWinner method, of class PokerManager.
     */
    @Test
    public void testGetWinnerForPair() {
        System.out.println("testGetWinnerForPair");

        ArrayList<Card> firstHandCards = new ArrayList<>();
        ArrayList<Card> secondHandCards = new ArrayList<>();
        PokerManager instance = new PokerManager();

        // Two Pairs , Same Pairs
        Card card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(2, "D");
        firstHandCards.add(card);
        card = new Card(7, "H");
        firstHandCards.add(card);
        card = new Card(3, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card(5, "C");
        secondHandCards.add(card);
        card = new Card(7, "H");
        secondHandCards.add(card);
        card = new Card(3, "S");
        secondHandCards.add(card);

        int expResult = 0;
        Hand firstPlayer = new Hand(firstHandCards);
        Hand secondPlayer = new Hand(secondHandCards);
        int result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();

        // Flush , First Player have higher pair value
        card = new Card(8, "C");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(5, "S");
        firstHandCards.add(card);
        card = new Card(4, "C");
        firstHandCards.add(card);

        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(3, "S");
        secondHandCards.add(card);
        card = new Card(6, "C");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(5, "D");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , Second Player have higher pair value
        card = new Card(3, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(7, "S");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);

        card = new Card(4, "D");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);
        card = new Card(10, "D");
        secondHandCards.add(card);

        expResult = -1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , First Player have higher value value with same pair.
        card = new Card(5, "C");
        firstHandCards.add(card);
        card = new Card(5, "D");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);
        card = new Card(6, "S");
        firstHandCards.add(card);
        card = new Card(9, "C");
        firstHandCards.add(card);

        card = new Card(5, "D");
        secondHandCards.add(card);
        card = new Card(5, "D");
        secondHandCards.add(card);
        card = new Card(2, "S");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(4, "D");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , Second Player have higher value value with same pair.
        card = new Card(3, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(4, "S");
        firstHandCards.add(card);
        card = new Card(5, "C");
        firstHandCards.add(card);

        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(9, "D");
        secondHandCards.add(card);

        expResult = -1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);
    }

    /**
     * Test of getWinner method, of class PokerManager.
     */
    @Test
    public void testGetWinnerForHighCard() {
        System.out.println("testGetWinnerForHighCard");

        ArrayList<Card> firstHandCards = new ArrayList<>();
        ArrayList<Card> secondHandCards = new ArrayList<>();
        PokerManager instance = new PokerManager();

        // High Card , Same max value for all cards
        Card card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(6, "D");
        firstHandCards.add(card);
        card = new Card(4, "H");
        firstHandCards.add(card);
        card = new Card("J", "S");
        firstHandCards.add(card);
        card = new Card(7, "C");
        firstHandCards.add(card);

        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card("J", "C");
        secondHandCards.add(card);
        card = new Card(4, "H");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);

        int expResult = 0;
        Hand firstPlayer = new Hand(firstHandCards);
        Hand secondPlayer = new Hand(secondHandCards);
        int result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();

        // Flush , First Player have higher value.
        card = new Card(14, "C");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);
        card = new Card(7, "D");
        firstHandCards.add(card);
        card = new Card(9, "S");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);

        card = new Card(1, "D");
        secondHandCards.add(card);
        card = new Card(6, "S");
        secondHandCards.add(card);
        card = new Card(8, "C");
        secondHandCards.add(card);
        card = new Card(9, "D");
        secondHandCards.add(card);
        card = new Card(4, "D");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // Flush , Second Player have higher value.
        card = new Card(1, "C");
        firstHandCards.add(card);
        card = new Card(3, "D");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);
        card = new Card(9, "S");
        firstHandCards.add(card);
        card = new Card(6, "C");
        firstHandCards.add(card);

        card = new Card("A", "D");
        secondHandCards.add(card);
        card = new Card(8, "D");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);
        card = new Card(3, "D");
        secondHandCards.add(card);
        card = new Card("J", "D");
        secondHandCards.add(card);

        expResult = -1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
        // High Card , Same max first max value but first has higher second value
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(6, "D");
        firstHandCards.add(card);
        card = new Card(4, "H");
        firstHandCards.add(card);
        card = new Card("J", "S");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);

        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card("J", "C");
        secondHandCards.add(card);
        card = new Card(4, "H");
        secondHandCards.add(card);
        card = new Card(7, "S");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);

        firstHandCards.clear();
        secondHandCards.clear();
      
        // High Card , Same max two values   but first has higher third value
        card = new Card(2, "C");
        firstHandCards.add(card);
        card = new Card(6, "D");
        firstHandCards.add(card);
        card = new Card(4, "H");
        firstHandCards.add(card);
        card = new Card("J", "S");
        firstHandCards.add(card);
        card = new Card(8, "C");
        firstHandCards.add(card);

        card = new Card(6, "D");
        secondHandCards.add(card);
        card = new Card(2, "D");
        secondHandCards.add(card);
        card = new Card("J", "C");
        secondHandCards.add(card);
        card = new Card(8, "H");
        secondHandCards.add(card);
        card = new Card(3, "S");
        secondHandCards.add(card);

        expResult = 1;
        firstPlayer = new Hand(firstHandCards);
        secondPlayer = new Hand(secondHandCards);
        result = instance.getWinner(firstPlayer, secondPlayer);
        assertEquals(expResult, result);
 
    }

}
