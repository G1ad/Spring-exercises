package co.develhope.springdevelhope.DTO;

import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotBlank;

public class CarDTO {

    @Id
    @NotBlank(message = "Mandatory")
    private String id;

    @NotBlank(message = "Mandatory")
    private String modelName;
    private double price;

    @Override
    public String toString() {
        return "CarDTO{" +
                "id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }

    public CarDTO() {
    }

    public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
