package com.labz.mood;

public class MoodAnalyzer {
	String message;

	public MoodAnalyzer() {
		
	}
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		if (message.toLowerCase().contains("happy") || message.toLowerCase().contains("any")) {
			return "HAPPY";
		}
		else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		}
		else {
			return null;
		}
    }
	
	public static void main(String[] args) {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		
		moodAnalyser.setMessage("I am Happy");
		System.out.println(moodAnalyser.analyseMood());

		moodAnalyser.setMessage("I am Sad");
		System.out.println(moodAnalyser.analyseMood());
	}
}
