package com.vignesh;

public class BitManipulation {

    public static boolean isSetBit(int N, int i) {
        //return (N>>i % 2) == 1;
        //return (N & 1<<i) == 1<<i;
        //return (N & 1<<i) != 0;
        return (N>>i & 1) == 1;
    }

    public static int countSetBits(int N) {

        int count = 0;
        /*
        for(int i=0;i<32;++i) {
            if(isSetBit(N,i)) count++;
        }
        */

        /*
        while(N!=0) {
            if(N%2 == 1) ++count; // fails for N = -1; correction:: N%2 == 1 || N%2 == -1
            N>>>=1;
        }
        */

        /*
        int i=1;
        while(i!=0) {
            if((N&i) != 0) count++;
            i<<=1;
        }
        */

        /*
        while(N!=0) {
            N = N & N-1;
            count++;
        }
        */

        while(N!=0) { //N>0 does not handle negative N values
            if((N&1) == 1) count++;
            N>>>=1;
        }
        return count;
    }

    public static boolean isPowerOf2(int N) {
        if(N<=0) return false;
        return (N & N-1) == 0;
    }

    public static long powerOf2(int N) {
        return 1L<<N;
    }
}
