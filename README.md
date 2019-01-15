# factory-method-java
One of the Creational Design Patterns

You must read article before going through coding. Get complete article at http://www.tellmehow.co/factory-method-creational-design-patterns/

I will explain the Factory method design pattern. Let say we have an Interface and we have multiple implementations of the same interface. For example,

We have an Interface “Car”. We have implementations as “Honda”, “Maruti” and “Mercedes”. If you want to create an object or instantiate “Car”, You have to use one of the cars, either you can use “Honda” or “Maruti” or “Mercedes”.

Now how to mention that which one you want. Depends on your requirement, you will create an object of the different classes, Maybe Honda or Maruti or Mercedes.

But the main thing is, you want to hide the logic of the object-creation from the user.

We can do it by Factory Method Design pattern.


