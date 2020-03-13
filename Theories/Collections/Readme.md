# COLLECTION

The **Collection in Java** is a framework that provides an architecture to store and manipulate the group of objects.

* Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

* Java Collection means a single unit of objects. 

* The **java.util** package contains all the classes and interfaces for the Collection framework.

Java Collection framework provides many interfaces (Set, List, Queue, Deque)
and classes (Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).


| List       | Queue          | Set                        |map          |
| ---------- | -------------- | -------------------------- |-------------|
| ArrayList  | Priority Queue | HashSet [No Duplicate]     |Hashmap      |
| LinkedList | Deque          | LinkedHashSet [Over Write] |Treemap      |
| Vector     |                | TreeSet [Sorted]           |LinkedHashmap|



DECLARE:   `HashSet<String> hash = new HashSet<String>();`




| Methods    | Function of the Method                                       | Code                                   |
| ---------- | ------------------------------------------------------------ | -------------------------------------- |
| SIZE       | Return the size of the Object                                | Object.size();                         |
| GET        | Fetch the element from the index position of the list        | Object.get(int index);                 |
| SET        | Replace the specified element in the list at the specified position | Object.set(int index, new Integer(90)) |
| ADD        | Append the specified element at the end of a list.           | Object.add(int);                       |
| ADD_ALL    | Append all of the elements in the specified collection to the end of this list | Object.addAll(Index,Element)           |
| IS_EMPTY   | It returns true if the list is empty, otherwise false.       | Object.isEmpty()                       |
| REMOVE     | Used to remove the element present at the specified position in the list. | Object.remove(index)                   |
| REMOVE_ALL | Remove all the elements from the list.                       | Object.removeAll()                     |
| CONTAINS   | Returns true if the list contains the specified element      | Object.contains(Element)               |

# MAP
<img src="https://static.javatpoint.com/images/hashmap.png">


# HASHMAP
HashMap is a part of Java’s collection since Java 1.2. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value one must know its key. HashMap is known as HashMap because it uses a technique called Hashing. Hashing is a technique of converting a large String to small String that represents the same String. A shorter value helps in indexing and faster searches. HashSet also uses HashMap internally. It internally uses a link list to store key-value pairs already explained in HashSet in detail and further articles.
Few important features of HashMap are:

* HashMap is a part of java.util package.
* HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
* It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively.
* HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
* HashMap allows null key also but only once and multiple null values.
* This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time. It is roughly similar to HashTable but is unsynchronized.
