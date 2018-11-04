package task;

public class Animal {
    private String type;
    private String nameAn;
    public Animal(String type, String nameAn) {
        this.type = type;
        this.nameAn = nameAn;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getNameAn() {
        return nameAn;
    }
    public void setNameAn(String nameAn) {
        this.nameAn = nameAn;
    }
    @Override
    public String toString() {
        return "Animal [type=" + type + ", nameAn=" + nameAn + "]\n";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameAn == null) ? 0 : nameAn.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (nameAn == null) {
            if (other.nameAn != null)
                return false;
        } else if (!nameAn.equals(other.nameAn))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

}