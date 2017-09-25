// A sample class that uses transient keyword to
// skip their serialization.
class Test1 implements Serializable
{
	// Making password transient for security
	private transient String password;

	// Making age transient as age is auto-
	// computable from DOB and current date.
	transient int age;

	// serialize other fields
	private String username, email;
	Date dob;

	// other code
}


/*
transient is a variables modifier used in serialization. At the time of serialization, 
if we don’t want to save value of a particular variable in a file, then we use transient keyword. 
When JVM comes across transient keyword, it ignores original value of the variable and save default value
 of that variable data type.

transient keyword plays an important role to meet security constraints. 
There are various real-life examples where we don’t want to save private data in file. 
Another use of transient keyword is not to serialize the variable whose value can be calculated/derived 
using other serialized objects or system such as age of a person, current date, etc.
Practically we serialized only those fields which represent a state of instance, 
after all serialization is all about to save state of an object to a file. 
It is good habit to use transient keyword with private confidential fields of a class during serialization.
