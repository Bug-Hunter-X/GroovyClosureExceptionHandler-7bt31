# Groovy Closure Exception Handling

This example demonstrates an issue with exception handling within Groovy closures.  The `methodWithClosure` function executes a provided closure. However, if the closure throws an exception, the handling of that exception and subsequent code execution can be non-intuitive if not carefully managed.

## The Problem

The `bug.groovy` file shows a closure that intentionally causes a `DivideByZeroException`.  The output reveals that the exception halts execution within the closure, but the `"After closure execution"` statement is still not printed, as you might expect if the closure simply returned prematurely.  Proper exception handling is crucial for robustness.