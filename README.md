# Research Assignments:

# <a name="1"></a> English

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

### <a name="1"></a> Research Assignment 3 Font family

-How do we create and use the font family file?
-Why do we prefer to use the way you specify?

### <a name="2"></a> Answer 3

A font family is a set of font files along with its style and weight details. In Android, you can create a new font family as an XML resource and access it as a single unit, instead of referencing each style and weight as separate resources.
To create a font family, perform the following steps in the Android Studio:

<ul>
  <li>Right-click the font folder and go to New > Font resource file. The New Resource File window appears.</li>
  <li>Enter the file name, and then click OK. The new font resource XML opens in the editor.</li>
  <li>Enclose each font file, style, and weight attribute in the <font> element. The following XML illustrates adding font-related attributes in the font resource XML:</li>
</ul>
-Right-click the font folder and go to New > Font resource file. The New Resource File window appears.
-Enter the file name, and then click OK. The new font resource XML opens in the editor.
-Enclose each font file, style, and weight attribute in the <font> element. The following XML illustrates adding font-related attributes in the font resource XML:
    
   <?xml version="1.0" encoding="utf-8"?>
    
<font-family xmlns:android="http://schemas.android.com/apk/res/android">
    
    <font
          
        android:fontStyle="normal"
          
        android:fontWeight="400"
          
        android:font="@font/lobster_regular" />
    
    <font
          
        android:fontStyle="italic"
          
        android:fontWeight="400"
          
        android:font="@font/lobster_italic" />
    
</font-family> 
    
 # <a name="1"></a> Türkçe

### <a name="1"></a> Araştırma ödevi 3-Font family
    
-Font family dosyası nasıl oluşturulup kullanıyoruz?
-Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?
    
### <a name="2"></a> Cevap 3
Font kaynağı, uygulamanızda kullanabileceğiniz özel bir yazı tipi tanımlar. Yazı tipleri, tek tek yazı tipi dosyaları veya yazı tipi ailesi olarak bilinen ve XML'de tanımlanan bir yazı tipi dosyaları koleksiyonu olabilir.
Bir yazı tipi ailesi, stili ve ağırlık ayrıntılarıyla birlikte bir yazı tipi dosyası kümesidir. Android'de, bir XML kaynağı olarak yeni bir yazı tipi ailesi oluşturabilir ve her bir stile ve ağırlığa ayrı kaynaklar olarak başvurmak yerine tek bir birim olarak erişebilirsiniz.
    
    Bir yazı tipi ailesi oluşturmak için Android Studio'da aşağıdaki adımları takip edebilirsiniz:
    
<ul>
  <li>Yazı tipi klasörüne sağ tıklayın ve Yeni > Yazı tipi kaynak dosyasına gidin. Yeni Kaynak Dosyası penceresi görünür.</li>
  <li>Dosya adını girin ve ardından Tamam'a tıklayın. Yeni yazı tipi kaynağı XML'i düzenleyicide açılır.</li>
  <li>Her yazı tipi dosyasını, stili ve ağırlık özniteliğini <font> öğesi içine alın. Aşağıdaki XML, yazı tipi kaynağı XML'sine yazı tipiyle ilgili niteliklerin eklenmesini gösterir:
    </li>
</ul>
   
  
<?xml version="1.0" encoding="utf-8"?>
    
<font-family xmlns:android="http://schemas.android.com/apk/res/android">
    
    <font
      
        android:fontStyle="normal"
          
        android:fontWeight="400"
          
        android:font="@font/lobster_regular" />
    
    <font
          
        android:fontStyle="italic"
          
        android:fontWeight="400"
          
        android:font="@font/lobster_italic" />
    
</font-family>





    
    
