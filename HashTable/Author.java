package DataStructures.HashTable;

public class Author{
    private String id;
    private String name;
    private boolean male;


    public Author() {
    }

    public Author(String id, String name, boolean male) {
        this.id = id;
        this.name = name;
        this.male = male;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isMale() {
        return this.male;
    }

    public boolean getMale() {
        return this.male;
    }
    
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", male='" + isMale() + "'" +
            "}";
    }

}