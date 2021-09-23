package com.company;

import java.util.Scanner;

public class Footballer {
    public final int MIN_YEARSOLD = 10;
    public final int MAX_YEARSOLD = 60;
    public final int MAX_GAMES = 1500, MAX_GOALS = 2000;
    public String surname;
    public byte yearsold;
    public short numbergames;
    public short numbergoals;
    Scanner in = new Scanner(System.in);

    public void SetYearsold(byte yearsold) {
        byte correctYearsOld = yearsold;
        if (correctYearsOld < MIN_YEARSOLD || correctYearsOld > MAX_YEARSOLD) {
            do {
                System.out.println("Try again. Input yearsold:");
                correctYearsOld = in.nextByte();
            } while (correctYearsOld < MIN_YEARSOLD || correctYearsOld > MAX_YEARSOLD);
        }

        this.yearsold = correctYearsOld;
    }

    public byte GetYearsold() {
        return yearsold;
    }

    public void SetNumbergames(short numbergames) {
        short correctNumberGames = numbergames;
        if (correctNumberGames < 0 || correctNumberGames > MAX_GAMES) {
            do {
                System.out.print("Try again. Input numbergames:");
                correctNumberGames = in.nextShort();
            } while (correctNumberGames < 0 || correctNumberGames > MAX_GAMES);
        }

        this.numbergames = correctNumberGames;
    }

    public short GetNumbergames() {
        return numbergames;
    }

    public void SetNumbergoals(short numbergoals) {
        short correctNumberGoals = numbergoals;
        if (correctNumberGoals < 0 || correctNumberGoals > MAX_GAMES) {
            System.out.println("Try again. Input numbergoals:");
            correctNumberGoals = in.nextShort();
        }

        this.numbergoals = correctNumberGoals;
    }

    public short GetNumbergoals() {
        return numbergoals;
    }
}