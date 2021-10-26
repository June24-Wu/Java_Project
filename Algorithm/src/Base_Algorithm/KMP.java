package Base_Algorithm;

public class KMP {

    public static int[] getNext(String pattern){
        var patternArray = pattern.toCharArray(); int[] next = new int[patternArray.length];
        next[0] = -1;
        int i = 0 , j = -1;
        while (i < patternArray.length){
            if (j==-1){i++;j++;}
            else if(patternArray[i] == patternArray[j]){
                i++;j++;
                if (i == patternArray.length){return next;}
                next[i] = j;
            }
            else {j = next[j];}
        }
        return next;
    }
    public static int KMP(String str, String pattern){
        var strArray = str.toCharArray();var patternArray = pattern.toCharArray();var next = getNext(pattern);
        int i = 0 ,j=0;
        while (i < strArray.length){
            if (j==-1 || strArray[i] == patternArray[j]){i++;j++;}
            else{j = next[j];}
            if (j == patternArray.length){return i-j;}
        }
        return -1;
    }
}
