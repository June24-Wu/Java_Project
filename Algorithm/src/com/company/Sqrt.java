package com.company;

public class Sqrt {
    public static float BinaraySearch(float value){
        float l  = 0;
        var r = value;
        float current;
        while (r - l >= 0.1){
            current = (r+l) /2;
            if (current * current < value)
                l = current;
            else
                r = current;
        }
        return (r+l) /2;
    }

    // newton , 两个因子的平均数会比这两个数更接近于目标的数的根号
    public static float newton(int x){
        return newton(x,x);
    }
    private static float newton(float i , int x){
        var res = (x/i + i)/2;
        if (res * res - x <= 0.001)
            return res;
        else
            return newton(res,x);
    }
}
