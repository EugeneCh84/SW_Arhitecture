package hw_6.notes.core.aplication.interfaces;

import java.util.Collection;

import hw_6.notes.core.domain.Note;

public interface NotesPresenter {
    void printAll(Collection<Note> notes);
}
