- [JVM nedir, ne işe yarar?](#jvm-nedir-ne-işe-yarar)
- [JDK nedir, ne işe yarar?](#jdk-nedir-ne-işe-yarar)
- [Garbage Collector'ın görevi nedir, nasıl çalışır?](#garbage-collectorın-görevi-nedir-nasıl-çalışır)
- [.jar formatı nedir?](#jar-formatı-nedir)
- [Javada .class ve .java formatının farkı nedir?](#javada-class-ve-java-formatının-farkı-nedir)
- [Abstract class nedir, nasıl çalışır, ne işe yarar?](#abstract-class-nedir-nasıl-çalışır-ne-işe-yarar)

### JVM nedir ne işe yarar?
- **JVM**: Javaya özgü bir donanım platformudur.Her bir sınıf dosyasını o işletim sisteminin özelliklerine göre üzerinde çalıştırabileceği sanal,soyut bir donanım platformu sunar .
- Java kodları derleyici aracılığı ile bytecode denilen bir ara dilin kodlarına dönüştürülür. JVM ise bu bytecode’u yorumlar ve çalıştırır. Kodlar çalıştırılırken doğrudan işletim sistemi üzerinde değil, o işletim sistemi ile uyumlu java sanal makinesi üzerinde çalıştırılır.Bu sayede platform bağımsızlığı sağlanır ve Java’nın *“Bir kere yaz her yerde çalıştır ”*felsefesini de gerçekleştirmiş olur.

### JDK nedir ne işe yarar?
*JDK*: Java Development Kit’in ilk harflerinden oluşan bir kısaltmadır ve programcıya yazılım geliştirme sürecinde gerekli olan bütün  kütüphanelerin bulunduğu geliştirici paketidir.

### Garbage Collector görevi nedir? Nasıl çalışır?
*Garbage collector*,otomatik bellek yönetimi mekanizmasıdır Basitçe; yazdığımız kodlardaki sınıflar için çalışma zamanında; nesneler için memory’de belli bir alan ayırırız. Nesne ile işimiz bittiğinde o hala hafızada yer tutar. Nesne ile ilgili işimizi bitirdiğimizde de bu ayrılan yeri tekrar sisteme geri bırakmalıyız ki, uygulamalarımız sorunsuz çalışsın. Bu durumda Garbage  Collection devreye girerek kullanılmayan nesneleri siler.

### .jar formatı nedir?
**.jar** uzantısına sahip bir dosya, java programlarını taşınabilirlik ve depolama alanını azaltmak gibi nedenlerle tek bir dosyada depolamak için kullanılan bir java arşiv dosyasıdır.

### Javada .class .ve .java formatının farkı nedir?
- *.java*; java programlama dilinde yazılmış kaynak kodunu içerir. 
- *.class*; JVM’de yürütülebilen java bayt kodunu içeren dosyadır. Yani java dosyaları bir java derleyicisi kullanarak sınıf dosyalarına derlenmektedir.

### Abstract class nedir,ne işe yarar, 1 tane abstract class örneği
**Abstract class**; belirli ayrıntıları gizleme ve kullanıcıya yalnızca gerekli bilgileri gösterme işlemidir.Ortak olan nesneleri bir çatı altında toplamak için kullanılır. 
- Asıl amaç,nesne türetilirken şablon oluşturmaktır. Abstract class içerisinde bulunan methodları override ederek yeniden tanımlayabiliriz.
- Abstract class ,gövdeye sahip değildir. Nesne oluşturmak için kullanılmaz.Abstract class  erişim için başka bir sınıftan miras alınması gerekir. 
```java
//Şekil class'ı abstract olarak tanımlanmış.
public abstract  class Sekil {
    private String isim;
    public Sekil(String isim){
        this.isim=isim;
    }
    public void isminiSöyle(){
        System.out.println("bu obje"+ getIsim() +"objesidir");
    }

    public abstract void alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
	
	//Şekil Class'ının alt sınıfı olan Kare sınıfı tanımlanmış.
public class Kare extends Sekil{
    private Integer kenarUzunluğu;
public Kare(String isim,Integer kenarUzunluğu){
    super(isim);
    this.kenarUzunluğu =kenarUzunluğu;
}
    @Override
    public void alanHesapla() {
        System.out.println(getIsim() +" objesinin alanı "+ kenarUzunluğu*kenarUzunluğu +" 'dır ");
    }
}
	//Şekil Class'ının alt sınıfı olan Daire sınıfı tanımlanmış.
public class Daire extends Sekil{
    private Integer yarıcap;
    static final double PI = 3.14;
    public Daire(String isim,Integer yarıcap){
        super(isim);
        this.yarıcap=yarıcap;
    }
    @Override
    public void alanHesapla() {
        System.out.println(getIsim()+"objesinin alanı"+PI*(yarıcap*yarıcap)+"'dır.");
    }
}
	//uygulama main class'ı içerisinde çalıştırılır.
public class Main {

    public static void main(String[] args) {
   Kare kare=new Kare("kare",5);
    Daire daire=new Daire("daire",5);
    kare.alanHesapla();
    daire.alanHesapla();
    }
}
```



