java-8-demo
===========

This project contains a bunch of demos presenting new features in Java 8. Each demo is class with the main method that you can run and see how it works.

**What do I need to run the demos?**

 - [Java 8 JRE](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html) or [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 - [Eclipse Kepler SR2 (4.3.2) with Java 8 Patches](http://www.eclipse.org/downloads/index-java8.php)


## What's new in Java 8 ##

### Default Methods ###

> Default methods enable new functionality to be added to the interfaces of libraries and ensure binary compatibility with code written for older versions of those interfaces

#### Default Methods added to the standard library ####
 - [Iterable](http://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)
   - [forEach(Consumer)](http://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html#forEach-java.util.function.Consumer-)
   - [spliterator()](http://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html#spliterator--)
 - [Iterator](http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)
   - [forEachRemaining(Consumer)](http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html#forEachRemaining-java.util.function.Consumer-)
 - [Collection](http://docs.oracle.com/javase/8/docs/api/java/util/Collection.html) *(extends Iterable)*
   - [removeIf(Predicate)](http://docs.oracle.com/javase/8/docs/api/java/util/Collection.html#removeIf-java.util.function.Predicate-) → [demo](/src/pl/luwi/java8/demo/ListRemoveIfDemo.java#L24)
   - [stream()](http://docs.oracle.com/javase/8/docs/api/java/util/Collection.html#stream--)
   - [parallelStream()](http://docs.oracle.com/javase/8/docs/api/java/util/Collection.html#parallelStream--)
 - [List](http://docs.oracle.com/javase/8/docs/api/java/util/List.html) *(extends Collection)*
   - [replaceAll(UnaryOperator)](http://docs.oracle.com/javase/8/docs/api/java/util/List.html#replaceAll-java.util.function.UnaryOperator-)   
   - [sort(Comparator)](http://docs.oracle.com/javase/8/docs/api/java/util/List.html#sort-java.util.Comparator-)
 - [Map](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
   - [forEach(BiConsumer)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#forEach-java.util.function.BiConsumer-)
   - [getOrDefault(Object, V)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#getOrDefault-java.lang.Object-V-)
   - [putIfAbsent(K, V)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#putIfAbsent-K-V-)
   - [remove(Object, Object)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#remove-java.lang.Object-java.lang.Object-)
   - [replace(K, V)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#replace-K-V-)
   - [replace(K, V, V)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#replace-K-V-V-)
   - [replaceAll(BiFunction)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#replaceAll-java.util.function.BiFunction-)
   - [compute(K, BiFunction)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#compute-K-java.util.function.BiFunction-)
   - [computeIfAbsent(K, Function)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#computeIfAbsent-K-java.util.function.Function-)
   - [computeIfPresent(K, BiFunction)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#computeIfPresent-K-java.util.function.BiFunction-)
   - [merge(K, V, BiFunction)](http://docs.oracle.com/javase/8/docs/api/java/util/Map.html#merge-K-V-java.util.function.BiFunction-)

 
