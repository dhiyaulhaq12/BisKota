import java.util.ArrayList;

public class BisKota {
    public static void main(String[] args) {
        ArrayList <int[]> BisKota= new ArrayList<int[]>();
        BisKota.add(new int[] {10,0}); //angka sebelah kiri data penumpang yang naik
        BisKota.add(new int[] {3,5}); //angka sebelah kanan data penumpang yang turun
        BisKota.add(new int[] {2,5});
        System.out.println(GetPassanger(BisKota));

        }

    public static int GetPassanger(ArrayList<int[]> bisKota) {
        int result = 0;
        for (int i=0; i<bisKota.size(); i++) {
            for (int j = 0; j < bisKota.get(1).length; j++) {
                if (bisKota.get(i)[j] == bisKota.get(i)[0]) {
                    result +=bisKota.get(i)[j];
                } else {
                    result -=bisKota.get(i)[j];
                }
            }
        }
        return result;
    }
}



