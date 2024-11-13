package app.bleona.edu_mate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDTO {

    private Long id;
    private Long studentId; 
    private Long courseId;  
    private LocalDateTime enrollmentDate;
    private LocalDateTime completionDate;
    private EnrollmentStatus status;
    private Double rating;

    public enum EnrollmentStatus {
        ACTIVE,
        COMPLETED,
        DROPPED
    }
}
