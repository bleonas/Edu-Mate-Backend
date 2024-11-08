package app.bleona.edu_mate.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;  

@Entity
@Data
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDateTime enrollmentDate; 

    private LocalDateTime completionDate;

    @NotNull
    @Enumerated(EnumType.STRING) 
    private EnrollmentStatus status; 

    @ManyToOne
    @JoinColumn(name = "student_id") 
    private Student student; // The student enrolled in the course

    @ManyToOne
    @JoinColumn(name = "course_id") 
    private Course course; // The course the student is enrolled in

    @Column(nullable = true)
    private Double rating;

    public enum EnrollmentStatus {
        ACTIVE,
        COMPLETED,
        DROPPED
    }
}
