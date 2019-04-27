public class Driver {
    /**
     * Run the program
     * Feel free to modify howCloselyMatchesInput
     * @param args
     */
    public static void main(String[] args) {
        int howCloselyMatchesInput = 6;
        int numOfCharacters = 10000;
        String[] input = {howCloselyMatchesInput+"", numOfCharacters+"", "input.txt"};
        TextGenerator.main(input);
    }
}
