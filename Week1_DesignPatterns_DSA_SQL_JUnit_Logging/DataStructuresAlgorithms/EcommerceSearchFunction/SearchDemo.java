import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Camera", "Electronics")
        };

        System.out.println("----- Linear Search -----");

        Product linearResult = LinearSearch.search(products, "Phone");

        if (linearResult != null)
            System.out.println("Product Found : " + linearResult);
        else
            System.out.println("Product Not Found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\n----- Binary Search -----");

        Product binaryResult = BinarySearch.search(products, "Phone");

        if (binaryResult != null)
            System.out.println("Product Found : " + binaryResult);
        else
            System.out.println("Product Not Found");

        System.out.println("\nTime Complexity Comparison");
        System.out.println("---------------------------");
        System.out.println("Linear Search  : Best O(1), Average O(n), Worst O(n)");
        System.out.println("Binary Search  : Best O(1), Average O(log n), Worst O(log n)");

        System.out.println("\nConclusion:");
        System.out.println("Binary Search is faster for large, sorted datasets.");
    }
}