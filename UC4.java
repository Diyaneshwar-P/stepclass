public class UC4 {
    public static void main(String[] args) {

        String[] bannerLines = new String[7];

        // Each line is 4 characters wide (O O P S), each 9-char block including spaces

        bannerLines[0] = String.join("",
                "  ***   ",  // O
                "  ***   ",  // O
                "  ***   ",  // P
                "  ***   "   // S
        );

        bannerLines[1] = String.join("",
                " *   *  ",
                " *   *  ",
                " *   *  ",
                " *   *  "
        );

        bannerLines[2] = String.join("",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * "
        );

        bannerLines[3] = String.join("",
                "*     * ",
                "*     * ",
                " *****  ",
                " *****  "
        );

        bannerLines[4] = String.join("",
                "*     * ",
                "*     * ",
                "*       ",
                " *      "
        );

        bannerLines[5] = String.join("",
                " *   *  ",
                " *   *  ",
                "*       ",
                "*       "
        );

        bannerLines[6] = String.join("",
                "  ***   ",
                "  ***   ",
                "*       ",
                "  ***   "
        );

        // Enhanced for loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
