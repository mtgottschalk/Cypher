package com.example.leoth_000.cypher;

/**
 * Created by leoth_000 on 12/12/2016.
 */

public class Encoder {
  private static  String clearText;
    private static int shift;
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

    public Encoder(String clearText, int shift) {

        this.clearText = clearText;
        this.shift = shift;
        codedText = new int[clearText.length()];
    }
    public int[] encode(){
        String copyText = this.getClearText();
        int copyShift = this.getShift();
        copyText.toLowerCase();
        for(int i = 0; i < copyText.length(); i=i+1){
            char letter = copyText.charAt(i);
            if (letter == 'a'){
                codedText[i]= 1+copyShift;
            }
            else if(letter == 'b'){
                codedText[i] = 2+copyShift;
            }
            else if(letter == 'c'){
                codedText[i] = 3+copyShift;
            }
            else if(letter == 'd'){
                codedText[i] = 4+copyShift;
            }
            else if(letter == 'e'){
                codedText[i] = 5+copyShift;
            }
            else if(letter == 'f'){
                codedText[i] = 6+copyShift;
            }
            else if(letter == 'g'){
                codedText[i] = 7+copyShift;
            }
            else if(letter == 'h'){
                codedText[i] = 8+copyShift;
            }
            else if(letter == 'i'){
                codedText[i] = 9+copyShift;
            }
            else if(letter == 'j'){
                codedText[i] = 10+copyShift;
            }
            else if(letter == 'k'){
                codedText[i] = 11+copyShift;
            }
            else if(letter == 'l'){
                codedText[i] = 12+copyShift;
            }
            else if(letter == 'm'){
                codedText[i] = 13+copyShift;
            }
            else if(letter == 'n'){
                codedText[i] = 14+copyShift;
            }
            else if(letter == 'o'){
                codedText[i] = 15+copyShift;
            }
            else if(letter == 'p'){
                codedText[i] = 16+copyShift;
            }
            else if(letter == 'q'){
                codedText[i] = 17+copyShift;
            }
            else if(letter == 'r'){
                codedText[i] = 18+copyShift;
            }
            else if(letter == 's'){
                codedText[i] = 19+copyShift;
            }
            else if(letter == 't'){
                codedText[i] = 20+copyShift;
            }
            else if(letter == 'u'){
                codedText[i] = 21+copyShift;
            }
            else if(letter == 'v'){
                codedText[i] = 22+copyShift;
            }
            else if(letter == 'w'){
                codedText[i] = 23+copyShift;
            }
            else if(letter == 'x'){
                codedText[i] = 24+copyShift;
            }
            else if(letter == 'y'){
                codedText[i] = 25+copyShift;
            }
            else if(letter == 'z'){
                codedText[i] = 26+copyShift;
            }
        }
        trim(codedText);
        return codedText;
    }
   private void trim(int[] codedText){
        for (int x=0; x < codedText.length; x = x+1){
            if(codedText[x]>26){
                codedText[x] = codedText[x] % 26;
            }
        }
    }
}
