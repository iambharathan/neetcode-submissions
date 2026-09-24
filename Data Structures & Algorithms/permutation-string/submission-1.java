class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int[] c = new int[26];
        int[] c2 = new int[26];
        for(char s : s1.toCharArray()){
            c[s - 'a']++;
        }
        for(int r = 0; r < s2.length(); r++ ){
            c2[s2.charAt(r) - 'a']++;
            if(r - l + 1 > s1.length()){
                c2[s2.charAt(l) - 'a']--;
                l++;
            }
            if(r - l + 1 == s1.length() && Arrays.equals(c,c2)){
                return true;
            }

        }
    return false;
    }
}
