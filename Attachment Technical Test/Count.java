

    // Write a program that counts the number of vowels in a sentence.
    // eg " Hello World " => returns 2

     class VowelCounter {
        public static int countVowels(String sentence) {
            int count = 0;
            String vowels = "aeiouAEIOU";
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }
            return count;
        }
        
        public static void main(String[] args) {
            String sentence = "My name is Boaz Nyambane";
            int vowelCount = countVowels(sentence);
            System.out.println("Number of vowels in the sentence: " + vowelCount);
        }
    }