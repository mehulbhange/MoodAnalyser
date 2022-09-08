package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void testMoodAnalysis(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertEquals("SAD",result);
        }catch (MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }

    }
    @Test
    public void givenHappyMessage_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY",result);
        }catch (MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void givenNullMessage_shouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try{
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException exception){
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.NULL,exception.type);
        }
    }

    @Test
    public void givenEmptyMessage_shouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try{
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException exception){
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.EMPTY,exception.type);
        }
    }

}
