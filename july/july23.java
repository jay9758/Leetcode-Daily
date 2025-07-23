import java.util.Stack;

public class july23 {
    public static String removeSubString(String s,String target){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char currCharacter=s.charAt(i);
            if(!st.isEmpty() && st.peek()==target.charAt(0) && currCharacter==target.charAt(1)){
                st.pop();
            }
            else{
                st.push(currCharacter);
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public int maximumGain(String s, int x, int y) {
        int totalScore=0;
        String highPriority= x>y ? "ab" : "ba";
        String lowPriority= highPriority=="ab" ? "ba" : "ab";

        String afterFirstPass=removeSubString(s,highPriority);
        int removedPairs= (s.length()-afterFirstPass.length())/2;

        totalScore += removedPairs * Math.max(x,y);

        String afterSecondPass=removeSubString(afterFirstPass,lowPriority);
        removedPairs= (afterFirstPass.length()-afterSecondPass.length())/2;

        totalScore += removedPairs * Math.min(x,y);

        return totalScore;
    }
}
