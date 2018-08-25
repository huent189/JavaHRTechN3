package BaiTap;

public class Feature {
    private Integer id;
    private String name;
    private String description;
    /** set gia tri*/
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /** lay gia tri*/
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
