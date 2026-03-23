class OOPSBANNERAPP {

    public static void main(String[] args) {

        String[] banner = {
            String.join("   ", "*****", "*****", "*****", "*****"),
            String.join("   ", "*   *", "*   *", "*   *", "*   *"),
            String.join("   ", "*   *", "*   *", "*   *", "*   *"),
            String.join("   ", "*   *", "*****", "*   *", "*****"),
            String.join("   ", "*   *", "*    ", "*   *", "    *"),
            String.join("   ", "*   *", "*    ", "*   *", "    *"),
            String.join("   ", "*****", "*    ", "*****", "*****")
        };

        // Loop through array
        for (String line : banner) {
            System.out.println(line);
        }
    }
}


