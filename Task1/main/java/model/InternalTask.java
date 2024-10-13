package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "internal_tasks")
public class InternalTask extends Task {

    public InternalTask(String title, LocalDate dueDate, boolean status) {
        super(title, dueDate, status);
    }
}
