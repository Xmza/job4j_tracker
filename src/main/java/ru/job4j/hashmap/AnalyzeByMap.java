package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double totalScore = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                count++;
                totalScore += subject.score();
            }
        }
        return totalScore / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double totalScore = 0;
            int count = pupil.subjects().size();
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            double average = totalScore / count;
            Label label = new Label(pupil.name(), average);
            labels.add(label);
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScore = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectScore.put(subject.name(), subjectScore.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectScore.entrySet()) {
            String subjectName = entry.getKey();
            int totalScore = entry.getValue();
            double averageScore = (double) totalScore / pupils.size();
            Label label = new Label(subjectName, averageScore);
            labels.add(label);
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        Label bestLabel = null;

        for (Pupil pupil : pupils) {
            int totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            if (bestLabel == null || totalScore > bestLabel.score()) {
                bestLabel = new Label(pupil.name(), totalScore);
            }
        }

        return bestLabel;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> scoreSumBySubject = new HashMap<>();

        // Сначала собираем сумму баллов по каждому предмету
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String subjectName = subject.name();
                Integer score = subject.score();
                Integer oldValue = scoreSumBySubject.get(subjectName);
                if (oldValue == null) {
                    scoreSumBySubject.put(subjectName, score);
                } else {
                    scoreSumBySubject.put(subjectName, oldValue + score);
                }
            }
        }

        // Создаем список объектов Label
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : scoreSumBySubject.entrySet()) {
            labels.add(new Label(entry.getKey(), entry.getValue()));
        }

        // Сортируем список объектов Label
        labels.sort(Comparator.naturalOrder());

        // Возвращаем последний элемент из отсортированного списка
        return labels.get(labels.size() - 1);
    }
}
