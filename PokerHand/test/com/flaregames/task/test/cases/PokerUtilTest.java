/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flaregames.task.test.cases;

import com.flaregames.task.core.Hand;
import com.flaregames.task.core.PokerUtil;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Utility class contains useful methods.
 *
 * @author tms-mustafa
 */
public class PokerUtilTest {

    public PokerUtilTest() {
    }

    @Before
    public void setUp() {
        instance = new PokerUtil();
    }

    private PokerUtil instance;

    /**
     * Test of isConsecutive method, of class PokerUtil.
     */
    @Test
    public void testIsConsecutive() {
        System.out.println("isConsecutive");
        int[] values = {6, 7, 8, 9, 10};

        boolean expResult = true;
        boolean result = instance.isConsecutive(values);
        assertEquals(expResult, result);

        int[] reversedValues = {6, 5, 4, 3, 2};
        expResult = false;

        result = instance.isConsecutive(reversedValues);
        assertEquals(expResult, result);

        int[] randomValues = {2, 3, 8, 2, 1};

        expResult = false;
        result = instance.isConsecutive(randomValues);
        assertEquals(expResult, result);

    }

    /**
     * Test of isSameSuite method, of class PokerUtil.
     */
    @Test
    public void testIsSameSuite() {
        System.out.println("isSameSuite");
        String[] suite = {"C", "C", "C", "C", "C"};

        boolean expResult = true;
        boolean result = instance.isSameSuite(suite);
        assertEquals(expResult, result);

        String[] otherSuite = {"C", "D", "C", "C", "C"};
        expResult = false;
        result = instance.isSameSuite(otherSuite);
        assertEquals(expResult, result);

        String[] newSuite = {"C", "C", "C", "C", "D"};
        expResult = false;
        result = instance.isSameSuite(otherSuite);
        assertEquals(expResult, result);

    }

    /**
     * Test of getGetHighestPair method, of class PokerUtil.
     */
    @Test
    public void testGetGetHighestPair() {
        int[] values = {1, 6, 1, 5, 5};
        int result;
        int expResult = 5;

        result = instance.getHighestPair(values, -1);
        assertEquals(expResult, result);

        // now we want to get next highest pair , so we will execulde values of first one.
        expResult = 1;
        result = instance.getHighestPair(values, 5);
        assertEquals(expResult, result);
    }

    /**
     * Test of testRemovePair method, of class PokerUtil.
     */
    @Test
    public void testRemovePair() {
        int[] values = {1, 1, 5, 8, 6};
        int[] result;
        int[] expResult = {5, 8, 6};

        result = instance.removePair(values);

        assertEquals(expResult[0], result[0]);
        assertEquals(expResult[1], result[1]);
        assertEquals(expResult[2], result[2]);
    }

    /**
     * Test of testRemovePair method, of class PokerUtil.
     */
    @Test
    public void testHasSameValue() {
        int[] values = {1, 1, 5, 8, 6};
        boolean result = true;
        int[] expResult = {1, 1, 5, 8, 6};

        result = instance.hasSameValues(values, expResult);
        assertEquals(true, result);

        int[] newValues = {1, 1, 5, 9, 6};
        result = instance.hasSameValues(newValues, expResult);
        assertEquals(false, result);
    }

    /**
     * Test of testGetMax method, of class PokerUtil.
     */
    @Test
    public void testGetMax() {
        int[] values = {1, 1, 5, 8, 6};
        int result;
        int expResult = 8;

        result = instance.getMaxValue(values);
        assertEquals(expResult, result);
    }

    /**
     * Test of getLargest method, of class PokerUtil.
     */
    @Test
    public void testGetLargest() {
        System.out.println("getLargest");
        int[] values = {6, 5, 3, 7, 1};

        int expResult = 7;

        int result = instance.getMaxValue(values);
        assertEquals(expResult, result);

    }

    /**
     * Test of countSameValues method, of class PokerUtil.
     */
    @Test
    public void testCountSameValues() {
        System.out.println("testCountSameValues");
        int[] values = {1, 6, 9, 3, 4};

        int[] result = instance.countLargestSameValues(values);
        assertEquals(1, result[1]);
        assertEquals(1, result[0]);

        int[] twoValues = {1, 1, 9, 3, 4};
        result = instance.countLargestSameValues(twoValues);
        assertEquals(2, result[1]);
        assertEquals(1, result[0]);

        int[] threeValues = {1, 1, 9, 9, 1};
        result = instance.countLargestSameValues(threeValues);
        assertEquals(3, result[1]);
        assertEquals(1, result[0]);

        int[] fourValues = {1, 1, 1, 3, 1};
        result = instance.countLargestSameValues(fourValues);
        assertEquals(4, result[1]);
        assertEquals(1, result[0]);
    }

    /**
     * Test of countPairs method, of class PokerUtil.
     */
    @Test
    public void testCountPairs() {
        System.out.println("testCountPairs");
        int[] values = {1, 6, 9, 3, 4};

        int result = instance.countPairs(values);
        assertEquals(0, result);

        int[] oneValues = {1, 6, 9, 1, 4};

        result = instance.countPairs(oneValues);
        assertEquals(1, result);

        int[] oneFakeValues = {1, 1, 9, 1, 4};

        result = instance.countPairs(oneFakeValues);
        assertEquals(0, result);

        int[] twoValues = {1, 1, 9, 1, 1};

        result = instance.countPairs(twoValues);
        assertEquals(2, result);
        
       

    }

    /**
     * Test of testCompareArrays method, of class PokerUtil.
     */
    @Test
    public void testCompareArrays() {
        System.out.println("testCompareArrays");
        int[] values = {1, 6, 9, 3, 4};
        int[] values2 = {1, 6, 9, 10, 4};

        int result = instance.compareArray(values, values2)[0];
        int max = instance.compareArray(values, values2)[1];

        assertEquals(-1, result);
        assertEquals(10, max);

        int[] newValues = {1, 10, 9, 1, 4};
        int[] newValues2 = {1, 6, 9, 1, 4};

        result = instance.compareArray(newValues, newValues2)[0];;
        max = instance.compareArray(newValues, newValues2)[1];
        assertEquals(1, result);
        assertEquals(10, max);

        int[] equalValues = {1, 10, 9, 1, 4};
        int[] equalValues2 = {1, 10, 9, 1, 4};

        result = instance.compareArray(equalValues, equalValues2)[0];
        max = instance.compareArray(equalValues, equalValues2)[1];
        assertEquals(0, result);
        assertEquals(-1, max);


    }

    /**
     * Test of compareRank method, of class PokerUtil.
     */
    @Test
    public void testCompareRank() {

        int expResult = -1;
        // test High Card against other ranks.
        int result;

        for (Hand.Rank rank : Hand.Rank.values()) {
            if (rank != Hand.Rank.HIGH_CARD) {
                result = instance.compareRank(Hand.Rank.HIGH_CARD, rank);
                assertEquals(expResult, result);
            }
        }

        // test S against other ranks.
        expResult = 1;

        for (Hand.Rank rank : Hand.Rank.values()) {
            if (rank != Hand.Rank.STRAIGHT_FLSUH) {
                result = instance.compareRank(Hand.Rank.STRAIGHT_FLSUH, rank);
                assertEquals(expResult, result);
            }
        }

    }

}
