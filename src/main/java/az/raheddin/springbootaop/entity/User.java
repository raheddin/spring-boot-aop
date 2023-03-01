package az.raheddin.springbootaop.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class User {
    private Long id;
    private String name;
    private Long age;
}
