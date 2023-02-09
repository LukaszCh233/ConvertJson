

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("Anatomia2");
        Scanner scanner = new Scanner(file);
        List<Questions> questionsList = new ArrayList<>();
        while (scanner.hasNextLine()) {
           String question = scanner.nextLine();
           List<String> answers = new ArrayList<>();
           String answer;
           while (!(answer = scanner.nextLine()).startsWith(">")){
               answers.add(answer);
           }
           String correctAnswer = answer.substring(1);
           Questions questions = new Questions(question,answers,correctAnswer);
           questionsList.add(questions);
        }
        System.out.println(questionsList);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("pytania2.json"), questionsList);
        System.out.println("Utworzona plik");
        Questions [] question = new Questions[0];
        question= mapper.readValue(new File("pytania2.json"),Questions[].class);
        QuizChoice.choiceQuiz1(question);
    }
}


