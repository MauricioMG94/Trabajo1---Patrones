
/*  This code snippet is defining a generic interface named `IBuilder` with a type parameter `T`. The
 interface has a single method `build()` that returns an object of type `T`. This interface can be
 implemented by classes that need to define a method to build and return an object of a specific
 type. */
public interface IBuilder<T> {
    public T build();
}
