package hw_6.notes.presentation.queries.views;

import java.util.Collection;

import hw_6.notes.core.aplication.interfaces.NotesPresenter;
import hw_6.notes.core.domain.Note;

public class NotesConsolePresenter implements NotesPresenter {

    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
    }

}
