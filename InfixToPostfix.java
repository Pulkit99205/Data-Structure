import java.util.Stack;

class stack2 {
    public int prec(char ch) {
        int flag = 4444;
        if (ch == '+' || ch == '-')
            flag = 1;
        else if (ch == '*' || ch == '/')
            flag = 2;
        else if (ch == '^')
            flag = 3;
        else
            flag = -1;
        return flag;
    }

    public String inftopos(String pp) {
        Stack<Character> stack = new Stack<Character>();
        String returnwali = "";
        for (int i = 0; i < pp.length(); i++) {
            char ch = pp.charAt(i);

            if (prec(ch) > 0) {
                while (!stack.isEmpty() && prec(stack.peek())>=prec(ch)) {
                    returnwali += stack.pop();
                }
                stack.push(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                char x = stack.pop();
                while (x != '(') {
                    returnwali += x;

                    x = stack.pop();
                }
            } else
                returnwali += ch;

        }

        for (int i = 0; i <=stack.size(); i++) {
            returnwali += stack.pop();
        }
        return returnwali;
    }
}

public class InfixToPostfix {

    public static void main(String arg[])
    {
        stack2 sp= new stack2();
           String pp="a+b*(c^d-e)^(f+g*h)-i";
//           String pp="A+B*(C^D-E)";
        System.out.println(sp.inftopos(pp));
    }
}

