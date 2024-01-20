import java.util.*;

public class weekone_two {
    public static boolean isValid(String s){
        int length = s.length();
        if(length==1){
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();

        int removed = 0;

        for(int i = 0 ; i < length ; i++){
            if(s.charAt(i) == '('){
                stack.push(1);
            }else if(s.charAt(i) == '{'){
                stack.push(2);
            }else if(s.charAt(i) == '['){
                stack.push(3);
            }else if(s.charAt(i) == ')'){
                if(stack.empty()){
                    return false;
                }
                removed = stack.pop();
                if(removed != 1){
                    
                    return false;
                    
                }
            }else if(s.charAt(i) == '}'){
                if(stack.empty()){
                    return false;
                }
                removed = stack.pop();
                if(removed != 2){
                    return false;
                }
            }else if(s.charAt(i) == ']'){
                if(stack.empty()){
                    return false;
                }
                removed = stack.pop();
                if(removed != 3){
                    return false;
                }
            }

        }

        return stack.empty();
    }
    
    public static void main(String[] args){

        String s = "(]";
        System.out.println(isValid(s));


    }
}
