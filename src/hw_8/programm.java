package hw_8;

import java.util.Date;

import hw_8.models.TableModel;
import hw_8.presenters.BookingPresenter;
import hw_8.presenters.Model;
import hw_8.presenters.View;
import hw_8.views.BookingView;

public class programm {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Иван Иванов");

        view.changeReservationTable(1001, new Date(), 3, "Иван Иванов");

    }

}
