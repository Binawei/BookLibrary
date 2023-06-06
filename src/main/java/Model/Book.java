package Model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Book {
    private String title;
    private String author;
    private Integer copies;
}
