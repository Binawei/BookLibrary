package Model;


import lombok.*;

import java.util.*;

@Data
@ToString
@Setter
@Getter
public class Library {
    private Set<Book> bookSet;
    private Queue<BookRequest> requestQueue;

    public Library() {
        bookSet = new HashSet<>();
        requestQueue = new PriorityQueue<>();
    }


}
