package com.labz.mood;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

		@Test
		public void givenMessage_IsProper_ShouldReturnSad() {
			MoodAnalyzer moodAnalyser = new MoodAnalyzer();
			String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
			Assert.assertEquals("SAD", actualResult);
		}
}
