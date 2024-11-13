package app.bleona.edu_mate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LectureDTO {

    private Long id;
    private String title;
    private String description;
    private String videoUrl;
    private Integer duration;
    private Integer order;
    private Long courseId; 
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
