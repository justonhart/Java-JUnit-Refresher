package art.justonh;

import java.util.Random;

public class Coin {
    private boolean headsUp;

    public Coin() {
        this.headsUp = true;
    }

    public void turnOver(){
        this.headsUp = !this.headsUp;
    }

    public boolean isHeadsUp(){
        return this.headsUp;
    }

    public void flip(){
        Random rng = new Random();
        int randOutput = rng.nextInt(2);

        if(randOutput == 1){
            this.turnOver();
        }

    }
}
