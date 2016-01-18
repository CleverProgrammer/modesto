# Modesto
Java exploration with my student Modesto.

### [str1 == str2 vs. Objects.equals(str1, str2)](http://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java)
``` java
// These two have the same value
new String("test").equals("test") // --> true 

// ... but they are not the same object
new String("test") == "test" // --> false 

// ... neither are these
new String("test") == new String("test") // --> false 

// This is the best way to check for string equalities checks for nulls and calls .equals()
Objects.equals("CA", "TX") // --> false
Objects.equals("TX", "TX") // --> true
Objects.equals("test", new String("test")) // --> true
Objects.equals(null, "test") // --> false

// ... but these are because literals are interned by 
// the compiler and thus refer to the same object
"test" == "test" // --> true 


```
