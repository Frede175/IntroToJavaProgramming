/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter9;

/**
 *
 * @author fsr19
 */
public class Location {
    public int row, column;
    public double minValue;

    public Location(int row, int column, double minValue) {
        this.row = row;
        this.column = column;
        this.minValue = minValue;
    }
    
    public static Location locateSmallest(double[][] a) {
        Location loc = new Location(0, 0, Double.MAX_VALUE);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < loc.minValue) {
                    loc.minValue = a[i][j];
                    loc.row = i;
                    loc.column = j;
                }
            }
        }
        return loc;
    }
}
