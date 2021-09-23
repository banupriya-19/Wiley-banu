package com.banu.egg;

public class EggDozenGross {

	private int eggs, gross, dozens, leftover;
	
	EggDozenGross(int eggs)
	{
		this.eggs=eggs;
	}

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}

	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public int getDozens() {
		return dozens;
	}

	public void setDozens(int dozens) {
		this.dozens = dozens;
	}

	public int getLeftover() {
		return leftover;
	}

	public void setLeftover(int leftover) {
		this.leftover = leftover;
	}
	
	
}
