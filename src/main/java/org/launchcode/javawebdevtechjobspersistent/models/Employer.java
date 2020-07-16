package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @NotBlank
    @Size(min=3, max=100, message="Location must be between 3 and 100 characters.")
    private String location;

    public Employer() {}


}
