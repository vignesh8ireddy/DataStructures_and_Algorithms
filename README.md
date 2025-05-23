## =====| Algorithms |=====

* Algorithm is a well-defined sequence of computational steps that transform given input into output.

### Recursion Technique
* Recurrence Relation
* Head Recursion Vs Tail Recursion
* Iteration X Recursion
* Recursion Stack
  * Order of function calls : Pre-Order
  * Order of function execution : Post-Order
  * Depth of Recursion Stack, Stack Overflow Error
* Classic Recursion Problems
  * Linear Search (Check if element K is present in a collection of N elements)
  * Sum of first N Natural Numbers
  * Factorial of Integer N
  * int power(int A, int B); //return A raised to the power of B.
  * Fibonacci Sequence
  * HCF, LCM of two Integers A and B
  * Sum of a collection of Numbers
  * Tower of Hanoi

### Analysis of Algorithm
  * Substitution Method
  * Recursive Tree Method
  * Master's Theorem
    * UseCase: Divide and Conquer Paradigm

### Sorting Techniques
  * Stability of a Sorting Algorithm
    * UseCases
  * Bubble Sort
  * Selection Sort
  * Insertion Sort
  * Count Sort
  * Bucket Sort
  * Radix Sort

### Bit Manipulation Technique

> Bitwise AND(&), Bitwise OR(|), Bitwise XOR(^), Bitwise NOT(~), Left Shift(<<), Right Shift with sign extension(>>),
  Right Shift with zero extension(>>>)
* x & x-1 will clear the least significant set bit of x.
* Classic Problems of Bit Manipulation
  1. Decimal to Binary conversion, and vice-versa.
  2. Check if i-th bit is set in a number N.
  3. Check if given number is a power of 2 or not.
  4. An array of size N, contains elements from range 1 to N. One element is repeated twice and one element is missing.
     Find the two elements.
  5. Find the number of set bits in given integer N.
  6. int power(int a, int N); compute a power N using fast exponentiation.
  7. Given two bit positions X and Y, return the number formed with Xth bit and Yth bit being set.
  8. Given two bit positions X and Y, return the number formed by X set bits followed by Y unset bits.

* Algorithm Paradigms
  * Divide and Conquer (Divide, Conquer and Combine)
  * Greedy Paradigm
  * Backtracking
  * Dynamic Programming
  * Hashing
  
### Divide and Conquer Paradigm
* Finding MIN or MAX in a given collection of Numbers
* Integer A to the Power of Integer B
* Binary Search (Check if Number K is present in a sorted collection of N Numbers)
* Merge Sort
  * Fibonacci Merge Sort
  * Count number of Inversions in a collection of N Numbers
* Quick Sort
  * Hoare's Partition
  * Lomuto's Partition
  * Bruteforce Quick Sort (Out-place)
  * Optimised Quick Sort (In-place)
  * Randomized Quick Sort
* Selection Procedure
* Matrices Multiplication
  * Strassen's Matrix Multiplication
* Maximum Sub-Array Sum
  * Kadane's Algorithm

### Greedy Paradigm
* Classic Problems
  * Fractional Knapsack
  * Job Sequencing with deadlines
  * Huffman Coding
  * Optimal Merge Pattern
  * Minimum Cost Spanning Tree
    * Prim's Algorithm
    * Krushkal's Algorithm
  * Single source shortest Path
    * Dijkshtra's Algorithm
    * Bellmanford's Algorithm
    * Breadth first traversal

### Dynamic Programming

### Hashing

## =====| Data Structures |=====

### Array
### String
### Linked List
* Singly Linked List
* Circular SLL
* Doubly Linked List
* Circular DLL

### Queue
* Enqueue, Dequeue
* Implementations
  * Using Array
  * Using Linked List
  * Using Stack
* Circular Queue
* Priority Queue
* Double Ended Queue (Deque)

### Stack
* Push, Pop
* Implementations
  * Using Array
  * Using Linked List
  * Using Queue
* Multiple Stacks using single Array
* Applications
  * Recursion
  * Infix to Postfix
  * Prefix to Postfix
  * Post Evaluation

### Tree, Binary Tree
* Types of BT
  * Strict BT
  * Perfect BT
  * Almost Complete BT
  * Degenerate BT
* Array BT Implementation X Linked List BT Implementation 
* Classic Problems
  * Size (Count of total no. of Nodes)
  * Height (No. of levels - 1)
  * Count of leaf nodes
  * Count of internal nodes
  * Count left most nodes
  * Count left most internal nodes
  * Check if given tree is binary or not
  * Check if given BT is Strict BT or not
  * Check if given two BTs are equal or not
  * Modify given BT to its mirror image
  * Tree Traversals
    * Breadth First Traversal (Level-Order)
    * Depth First Traversal (Pre-Order, In-Order, Post-Order)
  * Construct BT from given Pre(/Post)-Order Traversal and In-Order
* Binary Search Tree
  * BST's In-Order traversal
  * Find Post-Order traversal of BST given its Pre-Order traversal
  * Construct BST from given Pre(/Post)-Order Traversal
  * Total number of different BSTs possible with given n unique nodes.
  * Search, Insertion, Deletion and Update in BST
* AVL (Adelson-Velsky, Landis) Tree
  * Balancing Factor [-1,0,1] = Height of left Subtree - Height of right Subtree
  * RR-Problem, LL-Problem, RL-Problem, LR-Problem
  * Search, Insertion, Deletion and Update in AVL Tree

### Binary Heap [Min Heap]
* getMin, decreaseKey, extractMin, insertKey, deleteKey
* Heapify / PercolationUp
* Build Heap from given Array
* Heap Sort
* Find Post-Order traversal of BH given its In-Order traversal
* Construct BH given its In-Order traversal
*

### Graph
* Types of Graph
  * Simple Graph, Multi Graph
* Adjacency Matrix Representation Vs Adjacency List Representation
* Spanning Tree and MST
* Breadth first traversal
* Depth first traversal



## =====| Zephyr |=====
* 32bit Vs 64bit Vs 86bit architecture systems and efficient way of using RAM.
* What is short-circuiting in the context of logical operators working?
* Compiler Vs Interpreter
* Why Java is both compiler and interpreted programming language?