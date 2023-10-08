package lesson3.seminar3.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("good")) {
            return "Good day";
        } else if (message.contains("sad")) {
            return "Bad day";
        } else if (message.contains("usual")) {
            return "Neutral day";
        }
        return "";
    }

}