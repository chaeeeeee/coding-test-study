class Solution {
    public int solution(int[] date1, int[] date2) {
        
        if (date1[0] < date2[0]) {              //year가 앞서는 경우는 무조건 1 
            return 1;
        }
        else if (date1[0] == date2[0]) {     
            if (date1[1] < date2[1]) {          //year 같으면서 month 빠른 경우 무조건 1
                return 1;
            }        
            else if (date1[1] == date2[1]) {    //year, month 같으면서 day 빠른 경우 무조건 1      
                if (date1[2] < date2[2]) {
                    return 1;
                }
            }
            return 0;
        }
        else {
            return 0;
        }
    }
}