# E-commerce Platform Search Function

## Problem Statement

An e-commerce platform needs an efficient search feature to quickly find products. Implement both **Linear Search** and **Binary Search** algorithms to search for products and compare their time complexity to determine which is more suitable for large product catalogs.

---

### Project Structure

```text
EcommerceSearchFunction/
├── Product.java
├── LinearSearch.java
├── BinarySearch.java
├── SearchDemo.java
└── README.md
```

---

### Output

```text
----- Linear Search -----
Product Found : 103 - Phone (Electronics)

----- Binary Search -----
Product Found : 103 - Phone (Electronics)

Time Complexity Comparison
---------------------------
Linear Search : Best O(1), Average O(n), Worst O(n)
Binary Search : Best O(1), Average O(log n), Worst O(log n)

Conclusion:
Binary Search is more suitable for large, sorted datasets because it performs significantly fewer comparisons than Linear Search.
```
