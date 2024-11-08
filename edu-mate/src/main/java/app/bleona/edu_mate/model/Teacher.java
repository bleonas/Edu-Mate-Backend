package app.bleona.edu_mate.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED) 
@DiscriminatorColumn(name = "user_type") 
@EqualsAndHashCode(callSuper=true)
public class Teacher extends User {
    
    private String department; 

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

}
