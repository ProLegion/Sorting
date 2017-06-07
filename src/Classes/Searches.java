/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author canto5684
 */
public class Searches {

    public static int binarySearch(int[] items, int start, int end, int target) {
        if (start > end) {
            return (-1);
        } else {
            int mid = (start + end) / 2;
            if (target == items[mid]) {
                return (mid);
            } else if (target < items[mid]) {
                return (binarySearch(items, start, mid - 1, target));
            } else {
                return (binarySearch(items, mid + 1, end, target));
            }
        }
    }
}