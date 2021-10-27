package Base_Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {
    public static String get(String str){
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        for (int i = 0 ; i < str.length();i++){
            if (str.charAt(i) == 'R') r.add(i);
            else d.add(i);
        }
        while (!r.isEmpty() && !d.isEmpty()){
            var rPoll = r.poll();
            var dPoll = d.poll();
            if (rPoll < dPoll) r.add(rPoll + str.length());
            else d.add(dPoll + str.length());
        }
        if (r.isEmpty()) return "D Victory";
        return "R Victory";
    }
}
