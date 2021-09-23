package com.company;

import java.util.Scanner;

public class footb {
        Scanner in = new Scanner(System.in);
        public String surname;
        public byte yearsold;
        public short numbergames;
        public short numbergoals;
        public final int MIN_YEARSOLD=10;
        public final int MAX_YEARSOLD=60;
        public final int ZERO=0, MAX_GAMES=1399, MAX_GOALS=1000;
        public void SetYearsold(byte yearsold){
                byte correctyearsold=yearsold;
                if(correctyearsold<MIN_YEARSOLD || correctyearsold>MAX_YEARSOLD){
                        do{
                                System.out.println("Try again. Input yearsold:");
                        correctyearsold=in.nextByte();
                        }while(correctyearsold<MIN_YEARSOLD || correctyearsold>MAX_YEARSOLD);
                }

                this.yearsold = correctyearsold;
        }
        public byte GetYearsold(){
                return yearsold;
        }
        public void SetNumbergames(short numbergames){
                short correctnumbergames=numbergames;
                if(correctnumbergames<ZERO || correctnumbergames>MAX_GAMES){
                        do {System.out.print("Try again. Input numbergames:");
                        correctnumbergames=in.nextShort();
                        }while(correctnumbergames<ZERO || correctnumbergames>MAX_GAMES);
                }

                this.numbergames=correctnumbergames;
        }
        public short GetNumbergames(){
                return numbergames;
        }
        public void SetNumbergoals(short numbergoals){
                short correctnumbergoals=numbergoals;
                if(correctnumbergoals<ZERO || correctnumbergoals>MAX_GAMES){
                        System.out.println("Try again. Input numbergoals:");
                        correctnumbergoals=in.nextShort();
                }

                this.numbergoals=correctnumbergoals;
        }
        public short GetNumbergoals(){
                return numbergoals;
        }
}