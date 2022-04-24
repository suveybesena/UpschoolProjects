# Research Assignments:
    
## <a name="2"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?
    
### <a name="3"></a> Cevap 1   
 
 -latinit
lateinit geç başlatma anlamına gelir. Yapıcıda bir değişken başlatmak istemiyorsanız, onu daha sonra başlatmak istiyorsanız ve kullanmadan önce başlatmayı garanti edebiliyorsanız, o değişkeni lateinit anahtar kelimesiyle bildirin. Başlatılana kadar bellek ayırmaz.

-Lateinit değişkeni daha sonra başlatılacağı için val kullanamazsınız. Ayrıca değişkeni kullanmadan önce değişkeni başlattığınızdan emin olmalısınız, aksi takdirde çalışma zamanında istisna atar. Lateinit'i Int, Long vb. gibi tür özellikleri için kullanamazsınız.
    
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
    
 ## <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 
    
### <a name="3"></a> Cevap 2
    
Android Studio, tools namespace'de tasarım zamanı özelliklerini (bir parçada hangi düzenin gösterileceği gibi) veya derleme zamanı davranışlarını (XML kaynaklarınıza hangi küçültme modunun uygulanacağı gibi) etkinleştiren çeşitli XML özniteliklerini destekler. Uygulamanızı oluşturduğunuzda, derleme araçları bu öznitelikleri kaldırır, böylece APK boyutunuz veya çalışma zamanı davranışınız üzerinde hiçbir etkisi olmaz.

Bu öznitelikleri kullanmak için, burada gösterildiği gibi, araçları kullanmak istediğiniz her XML dosyasının root elementine tools namespace alanı ekleyebilirsiniz:

xmlns:tools="http://schemas.android.com/tools" >

### <a name="1"></a> Araştırma ödevi 3-Font family
    
-Font family dosyası nasıl oluşturulup kullanıyoruz?
-Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?
    
## <a name="2"></a> Cevap 3
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

![image](https://user-images.githubusercontent.com/85364012/164991279-a777a789-42ff-4cfd-a5de-a2d4f2c6f3d5.png)


    
 ### <a name="1"></a> Araştırma ödevi 4- Property Animation
    
 <ul>
  <li>Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı açıklayınız</li>
</ul>
    
### <a name="3"></a> Cevap 4
    
Property animasyon sistemi, hemen hemen her şeyi canlandırmanıza izin veren sağlam bir çerçevedir. Ekrana çizilip çizilmediğine bakılmaksızın, herhangi bir nesne özelliğini zaman içinde değiştirmek için bir animasyon tanımlayabilirsiniz. Bir property animasyonu, belirli bir süre boyunca bir özelliğin (bir nesnedeki alan) değerini değiştirir. Bir şeyi canlandırmak için, bir nesnenin ekrandaki konumu, ne kadar süreyle canlandırmak istediğiniz ve hangi değerler arasında canlandırmak istediğiniz gibi, canlandırmak istediğiniz nesne özelliğini belirtirsiniz.

Property animasyon sistemi, bir animasyonun aşağıdaki özelliklerini tanımlamanıza olanak tanır:
Duration: Bir animasyonun süresini belirleyebilirsiniz. Varsayılan uzunluk 300 ms'dir.
Time interpolation: : Özellik değerlerinin, animasyonun geçerli geçen süresinin bir fonksiyonu olarak nasıl hesaplanacağını belirleyebilirsiniz.
Repeat count and behavior: Bir sürenin sonuna geldiğinde bir animasyonun tekrarlanıp tekrarlanmayacağını ve animasyonun kaç kez tekrarlanacağını belirleyebilirsiniz. Animasyonun tersten oynatılmasını isteyip istemediğinizi de belirtebilirsiniz. Geriye ayarlamak, tekrar sayısına ulaşılana kadar animasyonu tekrar tekrar ileri ve ardından geri oynatır.
Animator sets: Animasyonları, birlikte veya sırayla veya belirtilen gecikmelerden sonra oynayan mantıksal kümeler halinde gruplayabilirsiniz.
Frame refresh delay: Animasyonunuzun karelerini ne sıklıkta yenileyeceğinizi belirleyebilirsiniz. Varsayılan, her 10 ms'de bir yenilenecek şekilde ayarlanmıştır, ancak uygulamanızın çerçeveleri yenileme hızı, sonuçta sistemin genel olarak ne kadar meşgul olduğuna ve sistemin temel zamanlayıcıya ne kadar hızlı hizmet verebileceğine bağlıdır.
    
ValueAnimator
 Animasyon değerlerini hesaplayan ve her animasyonun zamanlama ayrıntılarını, bir animasyonun tekrarlanıp tekrarlanmadığı hakkında bilgileri, güncelleme olaylarını alan dinleyicileri ve değerlendirilecek özel türler ayarlama yeteneğini içeren tüm temel işlevlere sahiptir. Animasyon özelliklerinin iki parçası vardır: canlandırılan değerlerin hesaplanması ve bu değerlerin canlandırılan nesne ve özellik üzerinde ayarlanması. ValueAnimator ikinci parçayı gerçekleştirmez, bu nedenle ValueAnimator tarafından hesaplanan değerlerdeki güncellemeleri dinlemeli ve canlandırmak istediğiniz nesneleri kendi mantığınızla değiştirmelisiniz. 
    
 
Object Animator
 Canlandırmak için bir hedef nesne ve nesne özelliği ayarlamanıza izin veren bir ValueAnimator alt sınıfı. Bu sınıf, animasyon için yeni bir değer hesapladığında özelliği buna göre günceller. Hedef nesnelerde değerleri canlandırma sürecini çok daha kolay hale getirdiği için çoğu zaman ObjectAnimator kullanmak istersiniz. Ancak, ObjectAnimator'ın hedef nesnede belirli erişimci yöntemlerinin bulunmasını gerektirme gibi birkaç kısıtlaması daha olduğundan, bazen ValueAnimator'ı doğrudan kullanmak istersiniz.
    
  ![image](https://user-images.githubusercontent.com/85364012/164991408-9f36b443-2d9c-47d2-9e6a-0f58b97f6788.png)

 
https://user-images.githubusercontent.com/85364012/164990955-b689475b-655d-444c-89c4-54cc195472c7.mp4




    
    
