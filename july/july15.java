//https://leetcode.com/problems/valid-word/?envType=daily-question&envId=2025-07-15

class july15 {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }

        boolean vowel=false;
        boolean consonant=false;
        String vowels="aeiouAEIOU";
        for(char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if(vowels.indexOf(ch) != -1){
                    vowel=true;
                }
                else{
                    consonant=true;
                }
            }
        }
        return vowel && consonant;
    }    
}