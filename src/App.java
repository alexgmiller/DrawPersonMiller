public class App {
    public static void main(String[] args) throws Exception {
        drawHat();
        drawFace();
        drawBody();
        drawBottom();
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
