package image;


import java.awt.Color;
import drawing.*;


/**
 * This class uses static methods to draw a colored bitmap image from an
 * array of bits.  The pic array contains the color information to draw
 * squares. Each 2 bit sequence defines the color of the individual square.
 * 11 represents GREEN,00 represents BLACK, 01 represents YELLOW, and 10 represents RED
 * This class uses the DrawingPanel.java class
 * from the Building Java Programs textbook by Reges and  Stuart
 * @author Susan Uland
 *
 */
public class Robot {
    private static DrawingPanel canvas;
    private static final int SIZE = 100;
    private static final int WIN_HEIGHT = 900;
    private static final int WIN_WIDTH = 900;

    // The pic array represents 9 rows of 9 colored squares
    private static int[] pic = {
            0b000000000000000000,
            0b000000000000000000,
            0b000000000000000000,
            0b000000001100000000,
            0b000011111111110000,
            0b000011011101110000,
            0b001111111111111100,
            0b001111100010111100,
            0b000011111111110000
          };

    /**
     * Sets up the canvas window for drawing each row in the pic array
     * @param args - not used
     */
    public static void main(String[] args) {
        // create a canvas object to draw on
        canvas = new DrawingPanel(WIN_WIDTH, WIN_HEIGHT);

        // initialize the y coordinate of the upper left hand corner of the square
        int y = 0;
        // for each row of the bitmap image
        for (int i = 0; i < pic.length; i++) {
            // draw the row of colored squares
            drawRow(pic[i], y);
            // update y coordinate so next row is positioned correctly
            y += SIZE;
        }
    }

    /**
     * Draws a complete row of colored squares for the bitmap image
     * @param colors - colors to be used for the drawn squares
     * @param y - the y coordinate of the upper left corner of the drawn square
     */
    public static void drawRow(int colors, int y) {
        final int NUM_SQUARES=9;
        // initialize the x coordinate of the upper left hand corner of the square
        int x = 0;

        for (int i = 1; i <= NUM_SQUARES; i++) {
            // TODO: find the two bits that represent the color of the square to render
            int col = 0;

            // draw a filled rectangle with the correct col at upper left hand corner (x,y)
            drawSquare(col, x, y);

            // change x to position for next square to draw, (y stays the same)
            x += SIZE;

            // TODO: use a the bitwise shift operator to process next 2 bit color to be rendered
            colors = 0;
        }


    }

    /**
     * Draws a colored square for a bitmap image in the canvas
     * @param col - 18 bits representing 9 colored squares
     * @param x - the x coordinate of the upper left corner of the drawn square
     * @param y - the y coordinate of the upper left corner of the drawn square
     */
    public static void drawSquare(int col, int x, int y) {
        // TODO: define the constants to represent the colors
        final int BLACK =   0;
        final int GREEN =   0;
        final int YELLOW =  0;
        final int RED = 0;

        // TODO: Set the color of the graphics object to match the color passed as an argument

        // TODO: Draw a filled rectangle using the graphics object with the upper left hand corner at x,y  and width and height set to SIZE


    }

}
