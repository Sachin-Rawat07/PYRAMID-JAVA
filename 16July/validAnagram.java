

public class validAnagram {
    public static void main(String[] args) {
        String s1="anagram",s2="nagaram";
        if(s1.length() != s2.length()) {
            System.out.println("False");
        }

        int []fq=new int[26];
        for(int i=0;i<26;i++){
            fq[s1.charAt(i)-'a']++;
            fq[s2.charAt(i)-'a']--;

        }
        for(int i=0;i<s1.length();i++){
            if(fq[i]!=0){ System.out.println("False"); break;}

        }
        System.out.println("True");
    }
}
