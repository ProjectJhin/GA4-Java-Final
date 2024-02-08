package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank
    @Size(min=1, max = 300, message="Skill description must be less than 300 characters")
    private String description;

    public Skill(String description) {
        super();
        this.description = description;
    }
    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
