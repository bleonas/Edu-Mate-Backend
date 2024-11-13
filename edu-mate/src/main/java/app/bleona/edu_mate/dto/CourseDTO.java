package app.bleona.edu_mate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {

    private Long id;
    private String title;
    private String description;
    private String category;
    private String level;
    private Double rating;
    private boolean isAvailable;
    private Long teacherId; 
    private List<Long> lectureIds; 
    private List<Long> enrollmentIds; 
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
