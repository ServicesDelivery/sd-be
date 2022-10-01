/*
 * This file is generated by jOOQ.
 */
package jooq.deliveryservice.database.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class District implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public District() {}

    public District(District value) {
        this.id = value.id;
        this.name = value.name;
    }

    public District(
        Integer id,
        String name
    ) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter for <code>delivery.district.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>delivery.district.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>delivery.district.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>delivery.district.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final District other = (District) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("District (");

        sb.append(id);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
