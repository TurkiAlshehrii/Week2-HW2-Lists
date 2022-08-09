fun main() {
   //Collection 
    //Read-only (immutable)
   val names = listOf("Ahad","Turki","Raghad","Nasser","Sumayah","Fahdah")
   val namesAll = listOf("Ahad","Turki","Raghad","Nasser")
   val colors = listOf<String>()
    
    // Read & Write (muteable) 
   val numbers = mutableListOf("one","two","three","four","five")
   val weekDays = mutableListOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Saturday")
    
    
  // Read-only (immutable) List - Operations
   println("\n Read-only (immutable) List - Operations\n")
   // Contains
   println("======== contains(element) ========")
   println("${names.contains("Ahad")}")
   println("${names.contains("Shaima")}")
  
   //ContainsAll
   println("======== containsAll(element) ========")
   println("${names.containsAll(namesAll)}")
   
   //get
   println("======== get(index) ========")
   println("${names.get(0)}")
  
   //indexOf
   println("======== indexOf(index) ========")
   println("${names.indexOf("Ahad")}")
   
   //isEmpty
   println("======== isEmpty() ========")
   println("${names.isEmpty()}")
   println("${colors.isEmpty()}")
   
   //subList
   println("======== subList(index, index) ========")
   println("${names.subList(0,3)}")
   
   
   
   //Read & Write (muteable) - operation
   println("\n********************************\n Read & Write (muteable) - operation\n")
  
   println("======== Add(element) ========")
   //Add(E)
   println("Before adding ${numbers}")
   numbers.add("six")
   println("After adding ${numbers}\n")
   
   println("======== Add(index, element) ========")
   // Add(I,E)
   println("Before adding ${numbers}")
   numbers.add(4,"seven")
   println("After adding a number: ${numbers}\n")
  
  //AddAll(E)
   println("======== AddAll(element) ========")
   println("Before adding: ${numbers}")
   numbers.addAll(weekDays)
   println("After adding: ${numbers}\n")
   
   println("======== AddAll(index, element) ========")
   // AddAll(I,E)
   println("Before adding: ${numbers}")
   numbers.addAll(4,weekDays)
   println("After adding a number: ${numbers}\n")
   
   //Clear
   println("======== clear() ========")
   val number  = mutableListOf(1, 2, 3)
    println("Before use clear(): ${number}")
    number.clear()
    println("After use clear(): ${number}\n")
   
   
    // Remove
    println("======== remove(element) ========")
    println("Before use remove(): ${numbers}")
    numbers.remove("two")
    println("After use remove(): ${numbers}\n")
    
   // Remove At 
    println("======== removeAt(index) ========")
    println("Before use removeAt(): ${numbers}")
    numbers.removeAt(3)
    println("After use removeAt(): ${numbers}\n")
    
    // Remove All
    println("======== removeAll(element) ========")
    println("Before use removeAll(): ${numbers}")
    numbers.removeAll(weekDays)
    println("After use removeAll(): ${numbers}")

}
