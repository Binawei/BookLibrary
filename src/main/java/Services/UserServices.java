package Services;

import Model.Library;
import Model.LibraryUser;
import Model.BookRequest;
import Model.Book;

import java.util.Date;
import java.util.function.Consumer;

public class UserServices {
    public void borrowBook(LibraryUser user, Book book, Library library) {
        // Create a new BookRequest object with the current date
        BookRequest request = new BookRequest(user, book, user.getRole(), new Date());

        // Add the book request to the request queue
        library.getRequestQueue().add(request);
    }

    public String returnBook(LibraryUser user, Book book) {
        book.setCopies(book.getCopies() + 1);
        return user.getName()+ "returned" + book.getTitle();
    }

}
