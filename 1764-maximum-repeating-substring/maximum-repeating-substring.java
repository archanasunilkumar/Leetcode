class Solution {
    public int maxRepeating(String sequence, String w) {
        int count=0;
        String repeated=w;
        while(sequence.contains(repeated))
        {
            count++;
            repeated+=w;
        }
        return count;
    }
}