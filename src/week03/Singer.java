package week03;

public class Singer {  private String name;
    private String gender;
    private String nationality;
    private Date debutYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(Date debutYear) {
        this.debutYear = debutYear;
    }
    public Singer(String name, String gender, String nationality, Date debutYear) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    public String toString(){
        return String.format("%s/%s/%s \nDebut: %s",this.name,this.gender,this.nationality,this.debutYear);

    }
}
