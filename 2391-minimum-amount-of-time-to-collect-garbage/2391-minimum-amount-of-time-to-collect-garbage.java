class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int t = 0;

        for(int i=0;i<travel.length;i++){
            t += 3*travel[i];

        }
        for(String s : garbage){
            t += s.length();
        }
        for(int i = garbage.length-1 ; i>0;i--){
            if(!garbage[i].contains("G")){
                t -= travel[i-1];
            }else
                break;
        }
         for(int i = garbage.length-1 ; i>0;i--){
            if(!garbage[i].contains("P")){
                t -= travel[i-1];
            }else
                break;
        }
         for(int i = garbage.length-1 ; i>0;i--){
            if(!garbage[i].contains("M")){
                t -= travel[i-1];
            }else
                break;
        }  
        return t;
    }
}