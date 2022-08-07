package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    final String test_brackets = "[[[[[[[";



    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

//    @Test
//    public void onlyBracketsIsNull(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets(null));
//    }

    @Test
    public void onlyBracketsHasAllLetters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void onlyBracketsHasHalfLetters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyBracketsHasBracketsFirst(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyBracketHasOneLeftBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }

    @Test
    public void onlyBracketHasOneLeftAndOneRight(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void onlyBracketHasOneBracketOnlyNoLetters(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
}
