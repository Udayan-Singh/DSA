package Practice;

public class DiceTargetSum {
    
    public static void main(String[] args) {
        Ans("",4);
    }

    public static void Ans(String ans, int target){
        if(target==0){
            System.out.println(ans);
            return;
        }

        for(int i = 1; i <= 6 && i<= target; i++){
            Ans(ans+i, target-i);
        }
    }
}
