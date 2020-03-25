package com.company;

public class Main {

    public static void main(String[] args) {
        
    }


    static class Solution {
        public int solution(int X, int Y, int D) {
            if((Y-X)%D == 0){
                return (Y-X)/D;
            } else {
                return (((Y-X)/D)+1);
            }
        }
    }

}
