package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void testMoodAnalysis(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String result = moodAnalyser.analyseMood("This is a sad message");
        Assertions.assertEquals("SAD",result);


    }

}
