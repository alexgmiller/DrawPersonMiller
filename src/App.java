/* Alex Miller, CSC 15, Summer 2022
 This program prints out a drawing of a character by calling four different methods that use println statements.
 */
/* my grade for this assignment is 100 since my program meets all of the rubric requirements*/
public class App {
    public static void main(String[] args) throws Exception {
        drawHat(); // top portion of the drawing
        drawFace(); // face of the person in drawing
        drawBody(); // body of person in drawing
        drawBottom(); // lower portion of the drawing
    }

    public static void drawHat() {
        System.out.println("          /\"\\");
        System.out.println("         /\"_\"\\");
        System.out.println("        /\"_\"_\"\\");
        System.out.println("       /\"_\"_\"_\"\\");
        System.out.println("      /\"_\"_\"_\"_\"\\");
        System.out.println("     /\"_\"_\"_\"_\"_\"\\");
        System.out.println("      |||||||||||  ");
    }

    public static void drawFace() {
        System.out.println("     |  ~      ~  |  ");
        System.out.println("    @|   O /\\  O  |@");
        System.out.println("     |   /----    |  ");
        System.out.println("     |____________|  ");
        System.out.println("          | |        ");
    }

    public static void drawBody() {
        System.out.println("    ______| |______  ");
        System.out.println("   |               |");
        System.out.println("  /|    MILLER     |\\");
        System.out.println(" / |               | \\");
        System.out.println("*  |_______________|  *");
        System.out.println("      | |     | |");
        System.out.println("      | |     | |");
        System.out.println("      | |     | |");
        System.out.println("      / \\     / \\");
        System.out.println("     |____\\  |____\\");
    }

    public static void drawBottom() {
        System.out.println("       \\/      \\/");
        System.out.println("       /\\      /\\");
        System.out.println("       \\/      \\/");
        System.out.println("     \\\"_\"_\"_\"_\"_\"/");
        System.out.println("      \\\"_\"_\"_\"_\"/");
        System.out.println("       \\\"_\"_\"_\"/");
        System.out.println("        \\\"_\"_\"/");
        System.out.println("         \\\"_\"/");
        System.out.println("          \\\"/");
    }
}
