class Solution {
    public int solution(String[] order) {
        
        int amount = 0;
        
        for (int i = 0; i < order.length; i++) {
            if (order[i].equals("iceamericano") || order[i].equals("americanoice") || order[i].equals("hotamericano") || order[i].equals("americanohot") || order[i].equals("americano") || order[i].equals("anything")) {
                amount += 4500;
            }
            else if (order[i].equals("icecafelatte") || order[i].equals("cafelatteice") || order[i].equals("hotcafelatte") || order[i].equals("cafelattehot") || order[i].equals("cafelatte")) {
                amount += 5000;
            }
        }
        
        return amount;
    }
}