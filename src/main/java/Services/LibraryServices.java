package Services;

import Model.Book;
import Model.Library;
import Model.LibraryUser;
import Model.BookRequest;
import Enums.Roles;


public class LibraryServices {
    public String distributeBook(Library library, LibraryUser librarian) {
        if (librarian.getRole() != Roles.LIBRARIAN) {
            return "Only the librarian can distribute books.";
        }

        BookRequest request = library.getRequestQueue()
                .stream().findFirst().orElse(null);

        if (request == null) {
            return "No book requests";
        }

        LibraryUser user = request.getUser();
        Book book = request.getBook();

        if (book.getCopies() <= 0) {
            return "Book '" + book.getTitle() + "' is not available";
        }

        library.getRequestQueue().poll();
        book.setCopies(book.getCopies() - 1);

        return "Book '" + book.getTitle() + "' is assigned to " + user.getName();
    }
}
