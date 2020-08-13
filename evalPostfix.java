import java.util.Stack;
// evaluation of postfix
class Stack3
{
    public int evtopostfix(String sp)
    {
       Stack<Integer> stack= new Stack<>();
         for(int i=0;i<sp.length();i++)
         {
             char ch= sp.charAt(i);
             if(Character.isDigit(ch))
             {
//                 stack.push(ch -'0');
                 int pp=Character.getNumericValue(ch);
              stack.push(pp);
             }
             else {
                 int val1= stack.pop();
                 int val2=stack.pop();
                 switch(ch)
                 {
                     case '+':
                   stack.push(val1 +val2);
                   break;
                     case '-':
                         stack.push(val2 -val1);
                         break;
                         case '*':
                         stack.push(val1 * val2);
                         break;
                     case'/':
                         stack.push(val2/val1);
                         break;
                 }
             }
         }
         return  stack.pop();
    }
}
public class evalPostfix {
    public  static void main(String args[])
    {
        Stack3 stackio=new Stack3();

      String sp="231*+9-";
        System.out.println(stackio.evtopostfix(sp));
    }
}
