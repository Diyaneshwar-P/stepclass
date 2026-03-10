/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 */
public class UC7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    public static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character to map
         * @param pattern banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns mapped character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns pattern for the character
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Retrieve pattern for a given character
     * @param ch character
     * @param map array of CharacterPatternMap
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] map) {
        for (CharacterPatternMap m : map) {
            if (m.getCharacter() == ch) {
                return m.getPattern();
            }
        }
        return new String[7];
    }

    /**
     * Print banner message
     * @param message text
     * @param map pattern map
     */
    public static void printBanner(String message, CharacterPatternMap[] map) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, map);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        CharacterPatternMap[] map = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        printBanner("OOPS", map);
    }
}