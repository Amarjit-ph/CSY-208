# COLLECTION

The **Collection in Java** is a framework that provides an architecture to store and manipulate the group of objects.

* Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

* Java Collection means a single unit of objects. 

* The **java.util** package contains all the classes and interfaces for the Collection framework.

Java Collection framework provides many interfaces (Set, List, Queue, Deque)
and classes (Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).


| List       | Queue          | Set                        |
| ---------- | -------------- | -------------------------- |
| ArrayList  | Priority Queue | HashSet [No Duplicate]     |
| LinkedList | Deque          | LinkedHashSet [Over Write] |
| Vector     |                | TreeSet [Sorted]           |



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

