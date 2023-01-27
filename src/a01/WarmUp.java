package a01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Joel High
 */
public class WarmUp {

    public static void main(String[] args){
        Point p1 = new Point(3, 2);
        Point p2 = new Point(6,10);
    }

    /**
     * Calculates the distance between two points
     * @param p1 A point
     * @param p2 A point
     * @return The distance between the two points.
     */
    public static double distance(Point p1, Point p2) {
        return Math.hypot(p2.getX() - p1.getX(), p2.getY() - p1.getY());
    }


    /**
     * Returns the point that is the greatest distance from the origin (the point (0, 0)).
     * @param p1 A point
     * @param p2 A point
     * @param p3 A point
     * @return The point furthest from the origin (0, 0)
     */
    public static double greatestDistanceFromOrigin(Point p1, Point p2, Point p3){
        Point origin = new Point(0, 0);
        double d1 = distance(p1, origin), d2 = distance(p2, origin), d3 = distance(p3, origin);
        return Math.max(Math.max(d1, d2), d3);
    }

    /**
     * Returns the area of a rectangle extending from the origin to the point <code>p</code> along the X and Y axis.
     * @param p A point
     * @return The area of the rectangle that extends from the origin to the point <code>p</code> along the X and Y
     * axis.
     */
    public static double area(Point p){
        return Math.abs(p.getX()*p.getY());
    }

    /**
     * Calculates the first eight multiples of <code>n</code>.
     * @param n Integer
     * @return Array of the first eight multiples of the integer.
     */
    public static int[] firstEightMultiples(int n){
        int[] firstEightMultiples = new int[8];
        for (int i = 0; i < firstEightMultiples.length; i++)
            firstEightMultiples[i] = n * (i+1);
        return firstEightMultiples;
    }

    /**
     * Converts the first and lest element of the array "<code style="Color:Lime">strings</code>" to "XXX"
     * @param strings Array of strings
     */
    public static void firstAndLastToXXX(String[] strings){
        if (strings.length > 0) {
            strings[0] = "XXX";
            strings[strings.length - 1] = "XXX";
        }
    }

    /**
     * Creates a string that includes the <code>points</code> in the array separated by a period.
     * @param points An array of points
     * @return A string of all <code>points</code> seperated by a period
     */
    public static String content(Point[] points){
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < points.length; i++) {
            content.append(points[i]);
            if (i < points.length - 1)
                content.append('.');
        }
        return content.toString();
    }

    /**
     * Returns a string with hyphens inserted between each element of the specified ArrayList: <code>syllables</code>.
     * <br>If the ArrayList is empty, an empty string is returned.
     * @param syllables An ArrayList of word syllables.
     * @return A string of <code>syllables</code> hyphenated together.
     */
    public static String hyphenate(ArrayList<String> syllables){
        StringBuilder hyphenated = new StringBuilder();
        for (int i = 0; i < syllables.size(); i++) {
            hyphenated.append(syllables.get(i));
            if (i < syllables.size()-1)
                hyphenated.append("-");
        }
        return hyphenated.toString();
    }

    /**
     * @param c char
     * @return
     */
    public static ArrayList<String> moreOfTheSame(char c){
        return new ArrayList<String>(); //TODO
    }

    /**
     * @param list
     * @param n
     * @return
     */
    public static ArrayList<Point> take(ArrayList<Point> list, int n){
        return new ArrayList<Point>(); //TODO
    }
}

