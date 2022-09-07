package com.bridgelabz;

public class MoodAnalyser {

    private String msg;

    public MoodAnalyser(){}

    public MoodAnalyser(String msg){
        this.msg = msg;
    }

    public String analyseMood() {
        if (msg.contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
