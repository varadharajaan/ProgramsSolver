package TriesDataStructure.method2;

public interface Vocabulary {
    boolean add(String word);

    boolean isPrefix(String prefix);

    boolean contains(String word);
}
