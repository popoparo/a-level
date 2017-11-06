package Task142HomeTask3;
public class IlluminatiSquare {
    public static void main(String[] args) {
        int x1 = -1, y1 = 5;
        int x2 = -5, y2 = -1;
        int x3 = 5, y3 = -2;

            double AB = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
            double BC = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2,2));
            double CD = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1,2));
            double PoluPerim = (AB+BC+CD)/2;
            double IlluminatiArea = Math.sqrt(PoluPerim*(PoluPerim-AB)*
                    (PoluPerim-BC)*(PoluPerim-CD));
        System.out.println("IlluminatiArea = " + IlluminatiArea);

    }
}
