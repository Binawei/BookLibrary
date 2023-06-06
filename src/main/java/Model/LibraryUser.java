package Model;

import Enums.Roles;
import lombok.*;

@Data
@Setter
@ToString
@Getter
@AllArgsConstructor
public class LibraryUser {
    private String name;
    private Roles role;
}
