# Modesto
Java explorations with my student Modesto.

### [str1 == str2 vs. Objects.equals(str1, str2)](http://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java)
``` java
// These two have the same value
new String("test").equals("test") // --> true 

// ... but they are not the same object
new String("test") == "test" // --> false 

// ... neither are these
new String("test") == new String("test") // --> false 

// This is the best way to check for string equalities. It checks for nulls and calls .equals()
Objects.equals("CA", "TX") // --> false
Objects.equals("TX", "TX") // --> true
Objects.equals("test", new String("test")) // --> true
Objects.equals(null, "test") // --> false

// ... but these are because literals are interned by 
// the compiler and thus refer to the same object
"test" == "test" // --> true 
```

### How do I write a function/method in Java?
``` java
/* public static <return data type> <name>(<data type> <variabe1Name>, <data type> <variable2Name> ...) {
    1. Declare data types: Ex --> 
        String hello; 
        int num; 
        double number1;
        ...
    2. Write the body of the function here...
    3. Make sure to add a return statement if the <return data type> is not void
    4. Close squigly to end the scope.
}
*/

public static double sum(double a, double b) {
    double result;
    result = a + b;
    return result;
}
```

### ... Okay so I have written a function/method in Java, now how do I call it?
``` java
// <functionName>(param1, param2, ...)
sum(1, 2)  // --> 3
sum(5, 5)  // --> 10
