package Model;
import Enums.Roles;
import lombok.*;

import java.util.Comparator;
import java.util.Date;


@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookRequest implements Comparable<BookRequest> {
    private LibraryUser user;
    private Book book;
    private Roles role;
    private Date date;

//    @Override
//    public int compareTo(BookRequest other) {
//            // Compare based on priority
//            if (this.role == Roles.TEACHER && other.role != Roles.TEACHER) {
//                return -1; // Teacher has higher priority
//            } else if (this.role != Roles.TEACHER && other.role == Roles.TEACHER) {
//                return 1; // Teacher has higher priority
//            } else if (this.role == Roles.SENIOR_STUDENT && other.role != Roles.SENIOR_STUDENT) {
//                return -1; // Senior student has higher priority
//            } else if (this.role != Roles.SENIOR_STUDENT && other.role == Roles.SENIOR_STUDENT) {
//                return 1; // Senior student has higher priority
//            }
//            else {
//                // Compare based on date if the roles are the same
//                return this.date.compareTo(other.date);
//            }
        @Override
        public int compareTo(BookRequest other) {
            return Comparator.comparing(BookRequest::getRole)
                    .thenComparing(BookRequest::getDate)
                    .compare(this, other);
}
 //   }




}
