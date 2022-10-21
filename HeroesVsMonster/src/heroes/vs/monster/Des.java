package heroes.vs.monster;

import java.util.Arrays;
import java.util.Random;

public class Des {
    Random random = new Random();
    int max;

    public Des(int max) {
        this.max = max;
    }

    public int JetDeDes() {
        final int[] TABLEAUDE = new int[4];
        int ACC = 0;
        for (int i = 0; i < 4; i++) {
            TABLEAUDE[i] = random.nextInt(this.max)+1;
        }
        Arrays.sort(TABLEAUDE);
        for (int i = 1; i < TABLEAUDE.length; i++) {
            ACC += TABLEAUDE[i];
        }
        return ACC;
    }

    public int jetDeDe () {
        return random.nextInt(this.max);
    }

}
