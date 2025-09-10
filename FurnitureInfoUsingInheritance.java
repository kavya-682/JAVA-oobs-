/*

Problem
Create a class `Furniture` with private attributes `material` and `price`. It should have methods to set and get these attributes. Additionally, it should have a method `getInfo()` which returns a string with furniture details.



Derive a class `Chair` from `Furniture`, adding an attribute `type`. It should override the `getInfo()` method to include the type of chair in the furniture details.



Derive another class named `Table` from `Furniture`, adding an attribute `shape`. It should override the `getInfo()` method to include the shape of the table in the furniture details.



Write a program that asks the user which type of furniture needs to be created. According to the user's choice, collect the details from the user and display the information of the respective furniture.

Input Format
The first line contains the type of furniture ("Chair" or "Table").

The second line contains a comma-separated list of the attributes for the furniture:

For a Chair: material,price,type
For a Table: material,price,shape
Output Format
A single line displaying the information of the furniture in the format:

Furniture Info: Material: <Material>, Price: <Price>, Type: <Type> for Chair
Furniture Info: Material: <Material>, Price: <Price>, Shape: <Shape> for Table
Do's
Create a base class named Furniture.
Use private variables in the Furniture class named material and price.
Create a subclass named Chair using inheritance.
Use a private variable in the Chair class named type.
Create a subclass named Table using inheritance.
Use a private variable in the Table class named shape.
Override the getInfo() method in Chair and Table.
Create appropriate public getters and setters for variables in Furniture, Chair, and Table.
Follow camel case convention for variable names and method names.
Follow Pascal case convention for class names.
Sample Inputs & Outputs
Sample Input 1

Chair
Wood,150,Office
Sample Output 1

Furniture Info: Material: Wood, Price: 150, Type: Office
Sample Input 2

Table
Metal,200,Round
Sample Output 2

Furniture Info: Material: Metal, Price: 200, Shape: Round
*/
import java.util.Scanner;

// Base class
class Furniture {
    private String material;
    private double price;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return "Furniture Info: Material: " + material + ", Price: " + price;
    }
}

// Subclass Chair
class Chair extends Furniture {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Type: " + type;
    }
}

// Subclass Table
class Table extends Furniture {
    private String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Shape: " + shape;
    }
}

// Main class
public class FurnitureInfoUsingInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String furnitureType = sc.nextLine().trim();
        String[] attributes = sc.nextLine().split(",");

        if (furnitureType.equalsIgnoreCase("Chair")) {
            Chair chair = new Chair();
            chair.setMaterial(attributes[0]);
            chair.setPrice(Double.parseDouble(attributes[1]));
            chair.setType(attributes[2]);
            System.out.println(chair.getInfo());
        } else if (furnitureType.equalsIgnoreCase("Table")) {
            Table table = new Table();
            table.setMaterial(attributes[0]);
            table.setPrice(Double.parseDouble(attributes[1]));
            table.setShape(attributes[2]);
            System.out.println(table.getInfo());
        } else {
            System.out.println("Invalid furniture type.");
        }

        sc.close();
    }
}
