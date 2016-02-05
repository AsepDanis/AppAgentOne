package com.danis.agent.one.entity;


public enum Category {
	menu,learningPath,lesson;
	
	public static Category getValue(String value) {
		switch (value) {
		case "menu":
			return menu;
		case "learningPath":
			return learningPath;
		case "lesson":
			return lesson;
		default:
			return null;
		}
	}
}
