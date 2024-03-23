1) Can a class be derived (inherit) from two different independent classes?
In Java, a class cannot inherit from more than one class directly, making multiple inheritance not supported directly in the language. This restriction is due to the potential for ambiguity and complexity, such as the "diamond problem," where a class might inherit the same method from multiple parent classes. However, Java provides interfaces to achieve similar functionality and flexibility, allowing a class to implement multiple interfaces and thereby achieve a form of multiple inheritance in terms of behavior.

2) Can a class be derived (inherit) from a “final” class?
No, a class cannot be derived from a final class in Java. The final keyword on a class declaration prevents the class from being subclassed. This is often used to maintain immutability or to ensure that a class's behavior cannot be altered through inheritance, which might be critical for security reasons or to guarantee certain properties of the class.

3) What is polymorphism, how it works, and why is it needed?
Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It's primarily of two types: static (compile-time) and dynamic (run-time). Dynamic polymorphism is achieved through method overriding, where a subclass can provide a specific implementation of a method that is already defined in its superclass. This allows for a single interface to be used for a general class of actions, with the specific action defined by the exact subclass of object that is being used. Polymorphism is crucial for flexibility and reusability in code, allowing for the design of a generic interface to multiple underlying implementations.

4) What is an inner (nested) class?
An inner class, or nested class, is a class defined within the body of another class. Java supports four types of nested classes: static nested classes, non-static nested classes (inner classes), local classes (classes defined within a block), and anonymous classes (classes without a name, used for instantiations). Inner classes are used to logically group classes that are only used in one place, to increase encapsulation, and to create more readable and maintainable code by closely associating a class with where it is used.

5) What is an abstract class and why is it needed?
An abstract class in Java is a class that cannot be instantiated on its own and is declared with the abstract keyword. It can include abstract methods (methods without an implementation) as well as concrete methods (with an implementation). Abstract classes are used as a base for other classes to inherit from and provide a template for future specific implementations. They allow for a certain level of abstraction where subclasses are forced to implement specific methods, ensuring a certain behavior across all subclasses.

6) What is an “interface” class in Java?
An interface in Java is an abstract type used to specify a set of methods that a class must implement. Interfaces are declared using the interface keyword, and they can contain constants and abstract methods (from Java 8, they can also include default and static methods). Interfaces are a way to achieve abstraction and multiple inheritance in Java. They allow for a class to be decoupled from the implementation details of one or more interfaces it implements, promoting a more modular and flexible design.






