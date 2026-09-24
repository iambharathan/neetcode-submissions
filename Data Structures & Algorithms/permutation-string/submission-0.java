class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //count the freq s1
        Map<Character,Integer> count1 = new HashMap<>();
        for(char c : s1.toCharArray()){
            count1.put(c,count1.getOrDefault(c,0)+1);
        }
        int need  = count1.size();
        //traverse s2
        for(int i = 0; i < s2.length(); i++){
            Map<Character,Integer> count2 = new HashMap<>();
            int curr = 0;
            for(int j = i;j<s2.length();j++){
                char c = s2.charAt(j);
                count2.put(c,count2.getOrDefault(c,0)+1);
                if(count1.getOrDefault(c,0)<count2.get(c)){
                    break;
                }
                if(count1.getOrDefault(c,0)==count2.get(c)){
                    curr++;
                }
                if(curr == need){
                    return true;
                }
            }
        }
        return false;


        
    }
}
