package co.develhope.springdevelhope.entities;

import io.swagger.annotations.ApiModelProperty;

public class ArithmeticOperation {
    @ApiModelProperty(value = "Name of the arithmetic operation", example = "Addition")
    private String name;
    @ApiModelProperty(value = "Minimum number of operands for the operation", example = "2")
    private int minNumberOfOperands;
    @ApiModelProperty(value = "The description of the operation", example = "num1 + num2 = sum")
    private String description;
    @ApiModelProperty(value = "A list of properties of the specific operation", example = "commutative, associative, distributive")
    private String[] properties;

    public ArithmeticOperation(String name, int minNumberOfOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }

    public ArithmeticOperation(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public void setMinNumberOfOperands(int minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}
