// Reference variable is used to point object of reference types .
// Classes, interfaces, arrays, enumerations, and, annotations are reference types in Java .
// To access a created object , a variable should point that object . So we create a Pointing element or simply called Reference variable which simply points out the Object .

// Java references are used to point to Java objects created by new
// Java references act as pointers but does not allow pointer arithmetic

ClassName ref1 = new ClassName();
ClassName ref2 = ref1;

// We cannot place arbitrary values to a reference except the special value null which means that the reference is pointing to nothing

ClassName ref3 = 100; // compiler error 
ClassName ref4 = null; // no problem