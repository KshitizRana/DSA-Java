# Array
An array is collection of similiar datatype values.
syntax:
 ```
  datatype[] var_name = new datatype[size];
                Or
  
  datatype[] var_name;
  
  var_name = new datatype[size];
                or
  datatype[] var_name = {val1, val2, ...,valN};
```
#### Understandig syntax:
  - `datatpye[] var_name` : It intialises the variable in the stack memory with a refernce variable name `var_name`.
  - `new datatpye[size]` ; It is used to create a new object in the heap memory during runtime.

    let's take an example: `int[] nums = new num[4];`
    
    ![image](https://github.com/KshitizRana/DSA-Java/assets/93457779/4e72160c-cab7-4f7c-9f5c-eac903fb548a)

    If these reference varable have nothing to point to, they will return 'null' when called as in the image `nums[2]` is null.

#### Internak representation of Array
  - internally in Java, memory allocation totally depends on JVM whether it be continuous or not!
  
      R1: Objects are stored in heap memory.
      
      R2: In JLS(Java Language specification) it is mentioned that heap objects are not continuos.
      
      R3: Dynamic memory allocation. Hence array objects in Java may not be continoud(depends on JVM).
  
  - Every element in an array is just a variable.

  - Arrays are always objects, whether they’re declared to hold primitives or object references.

  - The array object can have elements which are primitives, but the array itself is never a primitive. Regardless of what the array holds, the array itself is always an object!


## 2D Arrays
  it can be visualized ad a matrix.
  - syntax:
```
      datatype[][] var_name = new datattype[row_size][col_size];
                      OR
      datatype[][] var_name;
      var_name = new datattype[row_size][col_size];
                      OR
       datatype[][] var_name = {{arr1},{arr2},....,{arrN}};
```

    
