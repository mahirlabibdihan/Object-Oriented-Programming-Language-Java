// Synchronized method
// synchronized void call(String msg) { }

// Synchronized block/statement
// synchronized(target) { target.call(msg); }
// target can only be reference type

// If we don't have access to source code, we can't make a method synchronized. Rather, we can put the method calling in a synchronized block


// Not sure: synchronized block can throw NullPointerException but synchronized method doesn't throw.