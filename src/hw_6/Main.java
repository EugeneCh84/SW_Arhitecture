package hw_6;

import hw_6.database.NotesDatabase;
import hw_6.notes.core.aplication.ConcreteNoteEditor;
import hw_6.notes.infrastructure.persistance.NotesDbContext;
import hw_6.notes.presentation.queries.controllers.NotesController;
import hw_6.notes.presentation.queries.views.NotesConsolePresenter;

public class Main {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routeGetAll();
    }

}
