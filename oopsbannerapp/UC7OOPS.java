public class OOPSBannerApp {

    // Main method to display the banner
    public static void main(String[] args) {
        String word = "OOPS";
        displayHorizontalBanner(word);
    }

    /**
     * UC7 Requirement: Static Inner Class to encapsulate character patterns.
     * This moves away from fragmented helper methods to structured objects.
     */
    public static class CharacterPatternMap {
        private final char character;
        private final String[] patternLines;

        // Constructor to initialize the character and its ASCII lines
        public CharacterPatternMap(char character, String[] patternLines) {
            this.character = character;
            this.patternLines = patternLines;
        }

        public char getCharacter() {
            return character;
        }

        public String getLine(int index) {
            if (index >= 0 && index < patternLines.length) {
                return patternLines[index];
            }
            return "";
        }
    }

    /**
     * Centralized method to manage character retrieval.
     * Adheres to the Single Responsibility Principle.
     */
    private static CharacterPatternMap getPattern(char c) {
        switch (Character.toUpperCase(c)) {
            case 'O':
                return new CharacterPatternMap('O', new String[]{
                    "  OOO  ",
                    " O   O ",
                    " O   O ",
                    " O   O ",
                    "  OOO  "
                });
            case 'P':
                return new CharacterPatternMap('P', new String[]{
                    " OOOO  ",
                    " O   O ",
                    " OOOO  ",
                    " O     ",
                    " O     "
                });
            case 'S':
                return new CharacterPatternMap('S', new String[]{
                    "  OOOO ",
                    " O     ",
                    "  OOO  ",
                    "     O ",
                    " OOOO  "
                });
            default:
                return new CharacterPatternMap(' ', new String[]{" ", " ", " ", " ", " "});
        }
    }

    /**
     * Logic to display characters horizontally using StringBuilder.
     */
    public static void displayHorizontalBanner(String word) {
        int height = 5; // Height of the ASCII art
        StringBuilder banner = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (char c : word.toCharArray()) {
                CharacterPatternMap map = getPattern(c);
                banner.append(map.getLine(i)).append("  "); // Added spacing between letters
            }
            banner.append("\n");
        }

        System.out.println(banner.toString());
    }
}