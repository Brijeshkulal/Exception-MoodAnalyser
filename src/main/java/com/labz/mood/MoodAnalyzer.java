package com.labz.mood;

public class MoodAnalyzer {
	
	public String analyseMood(String message) {
		if(message.contains("Happy")) {
		return "Happy";
		}
		else if(message.contains("Sad")) {
			return "sad";
		}
		return message;
	}
	
	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood("I am happy");
		System.out.println(mood);
		mood = moodAnalyzer.analyseMood("I am sad");
		System.out.println(mood);
	}
}
