# Research Assignments:



### <a name="1"></a> Research Assignment 1

- Why do we use lateinit?
- Can you mention about the use of lateinite?
- Can you show an example usage for lateinit?
### <a name="1"></a> Answer 1
-lateinit
lateinit means late initialization. If you do not want to initialize a variable in the constructor instead you want to initialize it later on and if you can guarantee the initialization before using it, then declare that variable with lateinit keyword. It will not allocate memory until initialized.

-You cannot use val for lateinit variable as it will be initialized later on. Also you must guarantee that you are initializing the variable before using the variable otherwise it will throw exception at runtime. You cannot use lateinit for primitive type properties like Int, Long etc.

class Animal {
    lateinit var a: String

    fun cat() {
        print(a.length)  // UninitializedPropertyAccessException is thrown
        a = "cat"
        print(a.length)  // >>> 3
    }
}

class Plant {
    var b: String? = null

    fun flower() {
        print(b.length)  // won't compile, null check is obligatory here
        print(b?.length) // >>> null
        b = "flower"
        print(b?.length) // >>> 3
    }
}



### <a name="2"></a>  Research Assignment 2


- What is the namespace we use for our xml files in the layout directory?
- Why is it used?
- How should it be used?
- Can you show the use of a Tools (tools namespace) attribute?

### <a name="2"></a> Answer 2

Android Studio supports a variety of XML attributes in the tools namespace that enable design-time features (such as which layout to show in a fragment) or compile-time behaviors (such as which shrinking mode to apply to your XML resources). When you build your app, the build tools remove these attributes so there is no effect on your APK size or runtime behavior.

To use these attributes, add the tools namespace to the root element of each XML file where you'd like to use them, as shown here:  

xmlns:tools="http://schemas.android.com/tools" >


