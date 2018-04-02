package lesson5.Lesson51.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ModelNotes {
    private ArrayList<Note> notes = new ArrayList<>();

    public ArrayList<Note> getNotes() {
        return notes;
    }


    public void addNote(Note n){
        notes.add(n);
    }


}
