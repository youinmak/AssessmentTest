package com.makrand.assessment;

public class Alpha implements Comparable {

	String title;

	public Alpha(String a) {
		System.out.println("Alpha");
	}

	public Alpha() {

	}

	String getType() {
		return "alpha";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int compareTo(Object o) {
		Alpha alpha = (Alpha) o;
		return this.title.compareTo(alpha.getTitle());
	}

}
