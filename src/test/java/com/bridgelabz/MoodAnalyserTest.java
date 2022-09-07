package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void testMoodAnalysis(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String result = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD",result);

    }
    @Test
    public void givenHappyMessage_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String result = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY",result);
    }

    @Test
    public void givenNullMessage_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY",result);
    }

}
