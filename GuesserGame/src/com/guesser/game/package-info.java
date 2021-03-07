package com.guesser.game;

import java.util.Scanner;

class Guesser
{
	int gnum;
	int guessNum()
	{
		System.out.println("Guesser! Kindly guess a number between 1 to 100");
		Scanner scan = new Scanner(System.in);
		gnum=scan.nextInt();
		return gnum;
	}
}

class Player 
{
	int pnum;
	int predictNum()
	{
		System.out.println("Predict a number between 1 and 100");
		Scanner scan = new Scanner(System.in);
		pnum=scan.nextInt();
        return pnum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.predictNum();
		numFromPlayer2=p2.predictNum();
		numFromPlayer3=p3.predictNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1) {
			System.out.println("Player1 wins It");
		}
		else if(numFromGuesser==numFromPlayer2) {
			System.out.println("Player2 wins It");
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player3 wins It");
		}
		else {
			System.out.println("Game lost!Try Again");
		}
	}
}

class GuesserGameapp
{
	public static void main(String ags[])
	{
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}