class Solution {
    public boolean checkRecord(String s) {
         int abs = 0;
        int lateCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == 'A') {
                abs++;
                if (abs >= 2) {
                    return false;
                }
            }

            if (current == 'L') {
                lateCount++;
                if (lateCount >= 3) {
                    return false;
                }
            } else {
                lateCount = 0;
            }
        }

        return true;
    }
}