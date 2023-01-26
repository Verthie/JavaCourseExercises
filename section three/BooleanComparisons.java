public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(chemistryGrade >= englishGrade);
        System.out.println(biologyGrade != englishGrade);

        // java comparisons for strings
        String sentence = "I love this course!";
        String sentence2 = "I love this course!";
        System.out.println(sentence.equals(sentence2)); // sentence == sentence2
        System.out.println(!sentence.equals(sentence2)); // sentence != sentence2
        // when comparing strings we don't use == and !=
    }
}
