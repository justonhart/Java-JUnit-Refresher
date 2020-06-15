package art.justonh;

@SuppressWarnings("SameParameterValue")
public class App {
    public static void main(String[] args){

        System.out.println(marchUntil(4));

    }


    private static int mirrorMarch(){
        Coin coin = new Coin();
        int copies = 0;
        while(coin.isHeadsUp()){
            coin.flip();
            if(coin.isHeadsUp()){
                copies++;
            }
        }

        return copies;
    }

    private static long marchUntil(int target){
        long attempts = 0;
        boolean run = true;
        while(run){
            attempts++;
            int result = mirrorMarch();
            if(result >= target){
                run = false;
            }
        }

        return attempts;
    }


}
