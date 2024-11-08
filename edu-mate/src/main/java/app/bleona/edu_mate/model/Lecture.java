package app.bleona.edu_mate.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Column(nullable = false)
    private String title; 

    private String description; 

    @NotBlank(message = "Video URL is mandatory")
    @Column(nullable = false)
    private String videoUrl; 

    private Integer duration; 

    @Column(name = "lecture_order") 
    private Integer order; 

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false) 
    private Course course; // The course this lecture belongs to

    private LocalDateTime createdAt; 
    
    private LocalDateTime updatedAt; 

}
