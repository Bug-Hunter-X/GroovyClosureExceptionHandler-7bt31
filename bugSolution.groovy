```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (Exception e) {
    println "Exception caught within closure: ${e.message}"
  }
  println "After closure execution"
}

methodWithClosure { 
  println "Inside the closure"
  // Simulate an error
  1/0 
}
```