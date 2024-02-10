import java.util.Arrays;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures){
        int i = 0;
        int j = 1;
        int k = 0;
        int[] out = new int[temperatures.length];

        while (i < temperatures.length-1){
            if (temperatures[j] > temperatures[i]){
                out[k] = j - i;
                i++;
                j = i+1;
                k++;
            }else {
                j++;
                if (j == temperatures.length){
                    i++;
                    j = i+1;
                    k++;
                }
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[] temp = {30,60,90};
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }
}
