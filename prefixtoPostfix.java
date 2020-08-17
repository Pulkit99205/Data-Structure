import java.util.Stack;

public class prefixtoPostfix
{
    static boolean op(char ch)
    {
        if(ch=='+'||ch=='-'||ch=='*'||ch=='^'||ch=='/')
            return true;
        else 
            return false;
    }
    static String pretopost(String st)
    {

    Stack<String>stackii=new Stack<>();
    String res="";
        for(int i=st.length()-1;i>=0;i--) {
            char ch = st.charAt(i);
            if (op(ch) == true) {
                String op1 = stackii.pop();
                String op2 = stackii.pop();
                String temp = op1 + op2 + ch;
                stackii.push(temp);
            } else {
                stackii.push(ch + "");
            }
        }
        String pp = stackii.pop();
            return pp;

        }

    public static void main(String args[])
    {
//        String st="*+ab-cd";
        String st="*-A/BC-/AKL";
        System.out.println(pretopost(st));
    }
}
