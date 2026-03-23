import java.util.*;

class OOPSBANNERAPP {

    // Map to store character patterns
    static Map<Character, String[]> patterns = new HashMap<>();

    // Initialize patterns
    static void initializePatterns() {
        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    // Function to print banner
    static void printBanner(String word) {
        for (int i = 0; i < 7; i++) {
            for (char ch : word.toCharArray()) {
                System.out.print(patterns.get(ch)[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initializePatterns();
        printBanner("OOPS");
    }
}