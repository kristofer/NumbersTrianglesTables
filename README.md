# NumbersTrianglesTables
 (was, once upon a time, _Leon's Loopy Lab_) (who is Leon?? Is he really Kris' cousin?)
 
* Read each of the following `README` files and complete each of the asks.
    * [README-NumberUtilities.md](./README-NumberUtilities.md)
    * [README-TriangleUtilities.md](./README-TriangleUtilities.md)
    * [README-TableUtilities.md](./README-TableUtilities.md)
    
# Loops. `for` and `while` loops

In Java, for and while loops are used for repetitive execution of a block of code.

A for loop is used when the number of iterations is known beforehand. It consists of three parts: initialization, condition, and increment/decrement. The initialization part is executed only once at the beginning of the loop. The condition part is checked before each iteration, and if it is true, the loop body is executed. The increment/decrement part is executed at the end of each iteration. Here is an example of a for loop:

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

This loop will print the numbers from 0 to 9.

A while loop is used when the number of iterations is not known beforehand, and the loop continues until a certain condition is met. The condition is checked at the beginning of each iteration, and if it is true, the loop body is executed. Here is an example of a while loop:

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

This loop will also print the numbers from 0 to 9.
Now, one of my favorite `while` loops is

```java
while (true) {
    System.out.println("I'm stuck in an infinite loop!");
}

// yes, infinite loops are a thing
```

or even this one...
```java
while (playerOne.isAlive() && playerTwo.isAlive()) {
    playerOne.attack(playerTwo);
    playerTwo.attack(playerOne);
}
```

Which you should be able imagine is deep inside some game somewhere.

ANY for loop in Java can be substituted with a `while` loop. The following two loops are equivalent:

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

But notice how you have to layout the initialization of the `i` variable and also do the incrementing of `i` inside the loop. This is because the `for` loop does this for you. But `while` loops do not.

## One of the things to note about this lab

The description of the loops and what they produce is somewhat vague. (Welcome to software coding). So, you will have to make some decisions about what the loops should do. And, you will have to make sure that your loops do what you think they should do. Be carefule with where they start and where they end. And, be careful with what they do inside the loop.

Think it thru, what should each method do? What should it return? What should it print? What should it not print? What should it not return? What should it not do?

This can be a tricky lab. But, it is also a very important lab. You will be using loops for the rest of your life. So, get good at them now.