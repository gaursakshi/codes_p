class keypad
{
   
    public static void main(String args[])
    {
        printKeypad("179","");

    }

     static String[] codes={".","abc","def","ghi","jkl","mno","pqr","st","uvwx","yz"};
    public static void printKeypad(String Ques,String ans)
    {
        if(Ques.length()==0)
        {
           System.out.println(ans);
           return;

        }
        char ch=Ques.charAt(0);
        String req=Ques.substring(1);
        //kyuki jaise 0 call kiya woh ek call lgegi 9 call hua toh 2call lgegi 8 press hoga toh 4 call lgegi

        //ch m asciii store h toh usko "0 se minus krenge toh uska string milega  1 k example m isme abc aagya "
        String charactercode=codes[ch-'0']; 

        for(int i=0;i<charactercode.length();i++)
        {
            char chchoice=charactercode.charAt(i); //pehle a,fir b ,fir c
            printKeypad(req,ans+chchoice);
        }

    }
}