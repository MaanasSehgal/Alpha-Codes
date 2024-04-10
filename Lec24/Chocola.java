import java.util.*;

public class Chocola {

    public static void main(String[] args) {
        // int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; //m-1
        Integer costHor[] = { 4, 1, 2 }; //n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v <= costVer.length) {
            if (costVer[v] <= costHor[h]) { //hor cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { //vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        //left hor cost
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        //left ver cost
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cuts: " + cost);
    }
}
