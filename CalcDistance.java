/**
 * Kalokulon   distances
 */
public class CalcDistance {
    private static int time = 0;
    private int maxTime = 10;

    /**
     * Konstuktori i klases CalcDistance
     */
    public CalcDistance() {
    }

    /**
     * Kalkulon distancen
     *
     * @param velocity     - shpejtsia fillestare e dhene nga shfrytzuesi
     * @param acceleration - nxitimi i dhene nga shfytzuesi
     * @return -
     */
    public int getsX(int velocity, int acceleration) {
        int a;
        a = (int) ((velocity * time + ((1 / 2.0) * acceleration * Math.pow(time, 2))));
//        System.out.println(a);
        time++;
        return a;
    }


    /**
     * Getter i variables statike time
     */
    public int getTimeVariable() {

        return this.time;
    }
    /**
     * Merr   differencen se vleres maksimale me vleren me te larte qe fitohet nga formula
     *
     * @param x            -- vlera Maksimale e  xAxis
     * @param velocity     - shpejtsia
     * @param acceleration - nxitimi
     * @return
     */
    public int difference(int x, int velocity, int acceleration) {
        int difference = 1;
            difference = (int) ((velocity * maxTime + ((1 / 2.0) * acceleration * Math.pow(maxTime, 2))));
            return difference;
    }
}
