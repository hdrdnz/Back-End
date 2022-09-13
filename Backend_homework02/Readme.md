### SOLİD nedir ? Kısa kısa SOLİD prensiplerini kendi yorumlarınızla açıklayınız.
**Solid Prensipleri**,geliştirilen yazılımın esnek ve geliştirilmeye uygun olması için geliştirilen kurallar bütünüdür.  “Spagetti code “ dediğimiz karmaşık kodlar yerine “Clean Code” yazmamızı  sağlar  ve  en önemlisi  geliştirilen yazılımın gelecekte gereksinimlere kolayca adapte olmasını sağlar.
Dünya standartlarında yazılım geliştirmemize olanak sağlayan bu prensipleri 5 ana başlıkta ele alabiliriz.
- **S**ingle Responsibility Principle
- **O**pen/Closed Principle
- **L**iskov Substitution Principle
- **I**nterface Segregation Principle
- **D**ependency Inversion Principle

## 1-**S**-Single Responsibility Principle

Kelime anlamı olarak “Tek Sorumluluk” anlamına gelir.Bu prensibe göre bir sınıfın yapması gereken yalnızca bir işi olmalıdır.Yani bir fonksiyona birden fazla iş verip onu birçok işten sorumlu tutmak yerine,her bir iş için farklı bir fonksiyon oluşturulmalı ve değişiklik yapılacağı zaman ilgili metoda  giderek kolayca değişiklik yapabilmeliyiz.

## 2-**O**- Open/Closed Principle

Türkçe çevirisi “Açık/Kapalı” olan bu prensibe göre bir sınıf yada fonksiyon geliştirilmeye  açık ama değişime kapalı olmalıdır. Yani bir nesne davranışını değiştirmeden yeni özellikler kazanabiliyor olmalıdır. Bu prensip, tekrar kullanılabilir yapıda kod yazmanın temelini oluşturur.

## 3-**L**- Liskov Substitution Principle

Türkçe karşılığı “Yerine Geçme “ anlamına gelen bu prensibe göre miras olarak türemiş olan class’ların miras aldıkları nesnenin tüm özelliklerini kullanması gerekir. Eğer tüm özelliklerini kullanmayacaksa ortaya gereksiz kod blokları  çıkar ve bu da istenilen son şeydir.Yani kodlarımızda herhangi bir değişiklik yapmadan alt sınıfları,türedikleri üst sınıfın yerine kullanabilmeliyiz.

## 4-I-Interface Segregation Principle

“Arayüz Ayırımı” prensibine göre bütün sorumlulukları tek bir interface toplamak yerine daha özelleşitirlmiş birden fazla interface  oluşturmalıyız.Nesneler, ihtiyacı olmayan özellikler ve metotlar içeren interface’leri miras almaya zorlanmamalıdır.

## 5-D-Dependency Inversion Principle

Türkçe karşılığı “Bağımlılığın Ters Çevrilmesi” anlamına gelen bu prensibe göre sınıflar arası bağımlılıklar olabildiğince az olmalıdır. Üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.


### Singleton Design Pattern’ı açıklayıp kod ile örnekleyiniz.
## Singleton Design Pattern nedir?
- Yazılımcılar genellikle farklı projeler oluştursa da benzer sorunlarla karşı karşıya kalır ve bu sorunlara da benzer çözümler üretirler.  Peki bu çözümleri bir araya getirsek ve bunlara bir isim versek? İşte Design Patterns(Tasarım Kalıpları) buna çözüm sunuyor.  Sonuç olarak Design Pattern; sıklıkla karşılaşabilecek sorunlara genel çözüm üretirler.
- Tasarım kalıpları bir algoritma veya kod değildir. Belli bir dile bağlı değildir. Genellikle nesneler arası ilişkileri UML diyagramları ile gösteririz, bu sayede yazılımcılar arasında ortak bir iletişim dili oluşmuş olur.
-  Creational Patterns (Yaratımsal Kalıplar),  bir yazılım tasarım kalıbı çeşididir. Uygulamamızda duruma uygun şekilde nesne yatmaya çalışan bir tasarım kalıbıdır.Yani nesne yaratma mekanizmasıyla ilgilenir.
- Singleton Pattern yaratımsal tasarım deseni olarak geliştirilmiştir. Singleton kullanım amacı; bir nesnenin sadece bir örneğinin olduğundan emin olmak ve bu nesneye ihtiyacınız olduğunda kodunuzda her yerde aynı (ve tek örneğin) çağırılmasını sağlamaktır. 
Singleton Design Pattern için basit bir kod örneği;
```java
public class Singleton {
   //Class ile aynı türde static bir memberoluşturulur. 
    private  static Singleton singleton=new Singleton();
    //Constructor private olmalı. Bu yapılan işlem new ile nesne oluşturulmasını engeller.
    private Singleton() {
    }
    //Static member’a ulaşmak için static bir metot oluşturulmalıdır.
    public  static Singleton getSingleton() {
        return singleton;
    }
```
Main class:
```java
public class Main {
    public static void main(String[] args) {
        //Instance’ları new ile yaratmıyoruz. Bunun yerine getInstance metodunu kullanıyoruz. Bu metot ise bize her defasında yeni bir nesne oluştursakta aynı instance’ı veriyor.
        SingletonObject n1 = SingletonObject.getName();
        SingletonObject n2 = SingletonObject.getName();

    }
}
```
### Springde application properties nedir? Ne işe yarar?

Spring Applaction Proporties, Spring Boot Projemizin yönetimsel ayarlamalarını yapmak için gereklidir.Proporties dosyaları ile uygulamalarınızı farklı yapılandırma ayarları ile ayrı ayrı yapılandırabilir ve güncellenebilir hale getirebilirsiniz. Proporties dosyaları sayesinde bağımlılıkları kolayca değiştirebilirsiniz.








