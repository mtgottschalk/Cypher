package com.example.leoth_000.cypher;

/**
 * Created by leoth_000 on 12/12/2016.
 */

public class Encoder {
  public static  String clearText;
    public static int shift;
   public int[] codedText;

    public String getClearText() {
        return clearText;
    }

    public void setClearText(String clearText) {
        this.clearText = clearText;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int[] getCodedText() {
        return codedText;
    }

    public void setCodedText(int[] codedText) {
        this.codedText = codedText;
    }

    public Encoder(String clearText, int shift) {

        this.clearText = clearText;
        this.shift = shift;
    }
    public int[] encode(String clearText){
        clearText.toLowerCase();
        for(int i = 1; i < clearText.length(); i=i+1){
            char letter = clearText.charAt(i);
            if (letter == 'a'){
                codedText[i]= 1+shift;
            }
            else if(letter == 'b'){
                codedText[i] = 2+shift;
            }
            else if(letter == 'c'){
                codedText[i] = 3+shift;
            }
            else if(letter == 'd'){
                codedText[i] = 4+shift;
            }
            else if(letter == 'e'){
                codedText[i] = 5+shift;
            }
            else if(letter == 'f'){
                codedText[i] = 6+shift;
            }
            else if(letter == 'g'){
                codedText[i] = 7+shift;
            }
            else if(letter == 'h'){
                codedText[i] = 8+shift;
            }
            else if(letter == 'i'){
                codedText[i] = 9+shift;
            }
            else if(letter == 'j'){
                codedText[i] = 10+shift;
            }
            else if(letter == 'k'){
                codedText[i] = 11+shift;
            }
            else if(letter == 'l'){
                codedText[i] = 12+shift;
            }
            else if(letter == 'm'){
                codedText[i] = 13+shift;
            }
            else if(letter == 'n'){
                codedText[i] = 14+shift;
            }
            else if(letter == 'o'){
                codedText[i] = 15+shift;
            }
            else if(letter == 'p'){
                codedText[i] = 16+shift;
            }
            else if(letter == 'q'){
                codedText[i] = 17+shift;
            }
            else if(letter == 'r'){
                codedText[i] = 18+shift;
            }
            else if(letter == 's'){
                codedText[i] = 19+shift;
            }
            else if(letter == 't'){
                codedText[i] = 20+shift;
            }
            else if(letter == 'u'){
                codedText[i] = 21+shift;
            }
            else if(letter == 'v'){
                codedText[i] = 22+shift;
            }
            else if(letter == 'w'){
                codedText[i] = 23+shift;
            }
            else if(letter == 'x'){
                codedText[i] = 24+shift;
            }
            else if(letter == 'y'){
                codedText[i] = 25+shift;
            }
            else if(letter == 'z'){
                codedText[i] = 26+shift;
            }
        }
        trim(codedText);
        return codedText;
    }
    void trim(int[] codedText){
        for (int x:codedText){
            if(codedText[x]>26){
                codedText[x] = 26 % codedText[x];
            }
        }
    }
}
