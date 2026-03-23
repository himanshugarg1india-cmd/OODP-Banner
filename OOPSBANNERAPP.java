class OOPSBANNERAPP {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    // Method for O
    static String[] getO() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    // Method for P
    static String[] getP() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Method for S
    static String[] getS() {
        return new String[] {
            "*****",
            "*    ",
            "*    ",
            "*****",
            "    *",
            "    *",
            "*****"
        };
    }
}
    