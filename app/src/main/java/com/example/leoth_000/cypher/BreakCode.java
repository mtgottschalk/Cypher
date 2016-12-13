package com.example.leoth_000.cypher;

/**
 * Created by leoth_000 on 12/13/2016.
 */

public class BreakCode {
    private String codeText;
    public int[] codeInt;

    public String getCodeText() {
        return codeText;
    }

    public BreakCode(String codeText) {

        this.codeText = codeText;
        String line = getCodeText();
        String[] numberStrs = line.split(" ");
        this.codeInt = new int[numberStrs.length];
        for (int i = 0; i < numberStrs.length; i = i + 1) {
            codeInt[i] = Integer.parseInt(numberStrs[i]);
        }
    }

    private void trim(int[] codeInt) {
        for (int x = 0; x < codeInt.length; x = x + 1) {
            if (codeInt[x]<= 0) {
                codeInt[x] = codeInt[x] + 26;
            }
        }
    }

    public String breaker() {
        String message = "";
        int[] copyCode = codeInt;
        int[] doubleCode = codeInt;
        int copyShift = 0;
        for (int k = 0; k<26;k = k+1){
            for (int i = 0; i<copyCode.length;i=i+1){
                copyCode[i]=doubleCode[i] - copyShift;
            }
            trim(copyCode);
            for (int j = 0; j < copyCode.length; j = j + 1) {
                if (copyCode[j]  == 1) {
                    message = message + "a";
                } else if (copyCode[j]  == 2) {
                    message = message + "b";
                } else if (copyCode[j]  == 3) {
                    message = message + "c";
                } else if (copyCode[j]  == 4) {
                    message = message + "d";
                } else if (copyCode[j]  == 5) {
                    message = message + "e";
                } else if (copyCode[j]  == 6) {
                    message = message + "f";
                } else if (copyCode[j]  == 7) {
                    message = message + "g";
                } else if (copyCode[j]  == 8) {
                    message = message + "h";
                } else if (copyCode[j]  == 9) {
                    message = message + "i";
                } else if (copyCode[j]  == 10) {
                    message = message + "j";
                } else if (copyCode[j]  == 11) {
                    message = message + "k";
                } else if (copyCode[j]  == 12) {
                    message = message + "l";
                } else if (copyCode[j]  == 13) {
                    message = message + "m";
                } else if (copyCode[j]  == 14) {
                    message = message + "n";
                } else if (copyCode[j]  == 15) {
                    message = message + "o";
                } else if (copyCode[j]  == 16) {
                    message = message + "p";
                } else if (copyCode[j]  == 17) {
                    message = message + "q";
                } else if (copyCode[j]  == 18) {
                    message = message + "r";
                } else if (copyCode[j]  == 19) {
                    message = message + "s";
                } else if (copyCode[j]  == 20) {
                    message = message + "t";
                } else if (copyCode[j]  == 21) {
                    message = message + "u";
                } else if (copyCode[j] == 22) {
                    message = message + "v";
                } else if (copyCode[j]  == 23) {
                    message = message + "w";
                } else if (copyCode[j]  == 24) {
                    message = message + "x";
                } else if (copyCode[j]  == 25) {
                    message = message + "y";
                } else if (copyCode[j]  == 26) {
                    message = message + "z";
                }
            }
            copyShift = copyShift+1;
            message = message+", ";
        }
        return  message;
    }
}
