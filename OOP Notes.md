## object Relationships

#### Association
* Loose relationship, lifetimes of objects are independent of one another 
* "is-a" relationship (doesn't apply to every instance of a Association)
* what we bult in the service department and the relationship between it and the vehicle - briefly come together when passing Vehicle through as a property) 

#### Composition
* "has-a" relationship or a "part-of" 
* A Dealership "has a" Department
    * The Departments don't exist outside of a Dealership, therefore it's a **composition** relationship

#### Aggregation 
* A Dealership also "has" Vehicles, but it's a less tightly coupled relationship
* Vehicles come and go through the Dealership and the Dealership can manipulate them while it "owns" them
* But, ultimately, a Vehicle _can_ exist outside of a Dealership - this is called **aggregation**

