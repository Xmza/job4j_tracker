package ru.job4j.queue;

import javax.imageio.ImageTranscoder;
import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEveElements() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < evenElements.size(); i += 2) {
                result.append(evenElements.toArray()[i]);
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        Iterator<Character> iterator = descendingElements.descendingIterator();
        for (int i = 0; i < descendingElements.size(); i++) {
            result.append(iterator.next());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEveElements() + getDescendingElements();
    }
}
