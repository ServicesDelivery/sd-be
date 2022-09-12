/*
 * This file is generated by jOOQ.
 */
package jooq.deliveryservice.database.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Double rating;

    public Company() {}

    public Company(Company value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.price = value.price;
        this.rating = value.rating;
    }

    public Company(
        Integer id,
        String name,
        String description,
        Integer price,
        Double rating
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.rating = rating;
    }

    /**
     * Getter for <code>delivery.company.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>delivery.company.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>delivery.company.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>delivery.company.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>delivery.company.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>delivery.company.description</code>.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>delivery.company.price</code>.
     */
    public Integer getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>delivery.company.price</code>.
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * Getter for <code>delivery.company.rating</code>.
     */
    public Double getRating() {
        return this.rating;
    }

    /**
     * Setter for <code>delivery.company.rating</code>.
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Company other = (Company) obj;
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
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.price == null) {
            if (other.price != null)
                return false;
        }
        else if (!this.price.equals(other.price))
            return false;
        if (this.rating == null) {
            if (other.rating != null)
                return false;
        }
        else if (!this.rating.equals(other.rating))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
        result = prime * result + ((this.rating == null) ? 0 : this.rating.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Company (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(price);
        sb.append(", ").append(rating);

        sb.append(")");
        return sb.toString();
    }
}
