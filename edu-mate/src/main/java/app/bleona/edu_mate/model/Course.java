package app.bleona.edu_mate.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Course title is mandatory")
    @Size(min = 3, max = 255, message = "Title should be between 3 and 255 characters")
    private String title;

    @NotBlank(message = "Course description is mandatory")
    private String description;

    private String category; 

    private String level; 

    @NotNull(message = "Rating cannot be null")
    private Double rating; 

    private boolean isAvailable; 

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)  
    private Teacher teacher; // The teacher who created the course

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lecture> lectures = new ArrayList<>(); // Lectures of this course

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Enrollment> enrollments = new ArrayList<>(); // Enrollments of students in this course

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public void calculateRating() {
        if (enrollments != null && !enrollments.isEmpty()) {
            double totalRating = 0;
            int count = 0;
            for (Enrollment enrollment : enrollments) {
                if (enrollment.getRating() != null) {
                    totalRating += enrollment.getRating(); 
                    count++;
                }
            }
            if (count > 0) {
                this.rating = totalRating / count; 
            }
        }
    }
    
}
