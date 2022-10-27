package lab1;

public class Palindrom {
    private String word;

    public Palindrom setWord(String word) {
        this.word = word;

        return this;
    }

    public boolean isPalindrom() {
        String reversedWord = new StringBuilder(this.word).reverse().toString();

        return this.word.equals(reversedWord);
    }
}
