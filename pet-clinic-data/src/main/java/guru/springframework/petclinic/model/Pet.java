package guru.springframework.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private Long id;

    private LocalDate birthDate;

    private PetType petType;

    private Owner owner;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
