import bookExamples.Chpt8.Address

val a1 = new Address("1 Scala Lane", "Anytown", "CA", "98765")
val a2 = new Address("98765")

case class Person2(
  name: String,
  age: Option[Int] = None,
  address: Option[Address] = None)

new Person2("Buck Trends1")
// Result: Person2 = Person2(Buck Trends1,None,None)

new Person2("Buck Trends2", Some(20), Some(a1))
// Result: Person2(Buck Trends2,Some(20),
//           Some(Address(1 Scala Lane,Anytown,CA,98765)))

new Person2("Buck Trends3", Some(20))
// Result: Person2(Buck Trends3,Some(20),None)

new Person2("Buck Trends4", address = Some(a2))
// Result: Person2(Buck Trends4,None,
//           Some(Address([unknown],Anytown,CA,98765)))
