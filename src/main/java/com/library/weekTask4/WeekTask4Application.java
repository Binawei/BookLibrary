package com.library.weekTask4;

import Enums.Roles;
import Model.Book;
import Model.Library;
import Model.LibraryUser;
import Services.LibraryServices;
import Services.UserServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.PriorityQueue;

@SpringBootApplication
public class WeekTask4Application {

	public static void main(String[] args) {
		//SpringApplication.run(WeekTask4Application.class, args);
		Library library = new Library();
//		library.setBookSet(new HashSet<>());
//		library.setBookQueue(new PriorityQueue<>());

		Book book = new Book("JavaDymistified", "Goodluck", 1);
		Book book1 = new Book("javaBrains", "Zurum", 5);
		Book book2 = new Book("JAVAmadeEASY", "eBUKA", 3);
		Book book3 = new Book("Essentials of java", "Elizebeth", 2);
		Book book4 = new Book("LearnJavaIn5Minutes", "GGrodula", 4);

		library.getBookSet().add(book);
		library.getBookSet().add(book1);
		library.getBookSet().add(book2);
		library.getBookSet().add(book3);
		library.getBookSet().add(book4);

		LibraryUser user = new LibraryUser("Binawei", Roles.TEACHER);
		LibraryUser user1 = new LibraryUser("Dvaid",Roles.JUNIOR_STUDENT);
		LibraryUser user2 = new LibraryUser("Confidence",Roles.SENIOR_STUDENT);
		LibraryUser user3 = new LibraryUser("Phillip",Roles.SENIOR_STUDENT);
		LibraryUser librarian = new LibraryUser("Adamu", Roles.LIBRARIAN);


		LibraryServices Lservices = new LibraryServices();
		UserServices Uservices = new UserServices();

		Uservices.borrowBook(user3, book,library);
		Uservices.borrowBook(user, book,library);
		Uservices.borrowBook(user, book2,library);
		System.out.println(library.getRequestQueue());


//		Uservices.borrowBook(user3, book,library, true);
//		Uservices.borrowBook(user, book,library, true);
//		Uservices.borrowBook(user, book2,library, true);
//		System.out.println(library.getPriorityQueue());

		System.out.println(Lservices.distributeBook(library, librarian));
		System.out.println(Lservices.distributeBook(library, librarian));
		System.out.println(Lservices.distributeBook(library,librarian));

//		System.out.println(Lservices.distributeBook(library, librarian,false));
//		System.out.println(Lservices.distributeBook(library, librarian,false));
//		System.out.println(Lservices.distributeBook(library,librarian,false));

	}

}
