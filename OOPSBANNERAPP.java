class OOPSBANNERAPP {

    // Inner Class
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern[] letters = {

            new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            }),

            new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
            }),

            new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
            })
        };

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (char ch : word.toCharArray()) {
                for (CharacterPattern cp : letters) {
                    if (cp.character == ch) {
                        System.out.print(cp.pattern[i] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
