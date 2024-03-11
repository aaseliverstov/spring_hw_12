package taskmanagement.domen;

import lombok.Data;

@Data
public class Task {
    private Long id;
    private String name;
    private String description;
    private Long Priority;
}
