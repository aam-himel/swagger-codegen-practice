package com.swaggercodegen.swagger_codegen.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import jakarta.persistence.*;
/**
 * Book
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-28T15:45:04.352873500+06:00[Asia/Dhaka]")
@Entity
@Table(name = "books")
public class Book   {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("availability")
    private Boolean availability = null;

    @JsonProperty("price")
    private BigDecimal price = null;

    public Book id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @Schema(example = "10", description = "")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     **/
    @Schema(example = "Api design", description = "")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book availability(Boolean availability) {
        this.availability = availability;
        return this;
    }

    /**
     * Get availability
     * @return availability
     **/
    @Schema(example = "true", description = "")

    public Boolean isAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Book price(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     * @return price
     **/
    @Schema(example = "1203.99", description = "")

    @Valid
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(this.id, book.id) &&
                Objects.equals(this.title, book.title) &&
                Objects.equals(this.availability, book.availability) &&
                Objects.equals(this.price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, availability, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Book {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
