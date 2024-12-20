package com.tutoriels.superquiz2.data;

import java.util.Arrays;
import java.util.List;

public class QuestionBank {
    public List<Question> getQuestions() {
        return Arrays.asList(
                new Question(
                        "Qui est le créateur d'Android",
                        Arrays.asList(
                                "Andy Rubin",
                                "Steve Wozniak",
                                "Jake Wharton",
                                "Paul Smith"
                        ),
                        0
                ),
                new Question(
                        "Quant le premier a-t-il atterri sur la lune ?",
                        Arrays.asList(
                                "1958",
                                "1962",
                                "1967",
                                "1969"
                        ),
                        3
                ),
                new Question(
                        "Quel est le numéro de la maison des Simpsons?",
                        Arrays.asList(
                                "42",
                                "101",
                                "666",
                                "742"
                        ),
                        3
                ),
                new Question(
                        "Qui a peint la peinture Mona Lisa?",
                        Arrays.asList(
                                "Michelangelo",
                                "Leonardo Da Vinci",
                                "Raphael",
                                "Caravaggio"
                        ),
                        1
                ),
                new Question(
                        "Quel est le domaine de premier niveau national de la Belgique?",
                        Arrays.asList(
                                ".bg",
                                ".bm",
                                ".bl",
                                ".be"
                        ),
                        3
                )

        );
    }

    private static QuestionBank instance;

    public static QuestionBank getInstance() {
        if (instance == null) {
            instance = new QuestionBank();
        }
        return instance;
    }
}
