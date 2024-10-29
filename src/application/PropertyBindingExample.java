package application;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class PropertyBindingExample {
    public static void main(String[] args) {
        // Create two IntegerProperty instances
        IntegerProperty sourceProperty = new SimpleIntegerProperty(5);
        IntegerProperty targetProperty = new SimpleIntegerProperty();

        // Bind the target property to the source property
        targetProperty.bind(sourceProperty.multiply(2));

        // Print the initial values
        System.out.println("Source Property: " + sourceProperty.get());
        System.out.println("Target Property: " + targetProperty.get());

        // Change the source property value
        sourceProperty.set(10);

        // Print the updated values (note that the target property is automatically updated)
        System.out.println("Source Property: " + sourceProperty.get());
        System.out.println("Target Property: " + targetProperty.get());
    }
}
