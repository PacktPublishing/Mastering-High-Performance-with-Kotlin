# Mastering High Performance with Kotlin

<a href="https://www.packtpub.com/application-development/mastering-high-performance-kotlin?utm_source=github&utm_medium=repository&utm_campaign=9781788996648 "><img src="https://d1ldz4te4covpm.cloudfront.net/sites/default/files/imagecache/ppv4_main_book_cover/B09963.png" alt="Mastering High Performance with Kotlin" height="256px" align="right"></a>

This is the code repository for [Mastering High Performance with Kotlin](https://www.packtpub.com/application-development/mastering-high-performance-kotlin?utm_source=github&utm_medium=repository&utm_campaign=9781788996648), published by Packt.

**Find out how to write Kotlin code without overhead and how to use different profiling tools and bytecode viewer to inspect expressions of Kotlin language.**

## What is this book about?
The ease with which we write applications has been increasing, but with it comes the need to address their performance. A balancing act between easily implementing complex applications and keeping their performance optimal is a present-day requirement In this book, we explore how to achieve this crucial balance, while developing and deploying applications with Kotlin.

This book covers the following exciting features:
* Understand the importance of high performance 
* Learn performance metrics 
* Learn popular design patterns currently being used in Kotlin 
* Understand how to apply modern Kotlin features to data processing 
* Learn how to use profling tools 


If you feel this book is for you, get your [copy](https://www.amazon.com/dp/178899664X) today!

<a href="https://www.packtpub.com/?utm_source=github&utm_medium=banner&utm_campaign=GitHubBanner"><img src="https://raw.githubusercontent.com/PacktPublishing/GitHub/master/GitHub.png" 
alt="https://www.packtpub.com/" border="5" /></a>

## Instructions and Navigations
All of the code is organized into folders. For example, Chapter02.
To run examples from this book, you will need a computer running Windows, Linux, or Mac OS. You also need IntelliJ IDEA (Ultimate edition version is preferable) and Android Studio. You need basic knowledge of GitHub and Git to clone a project with examples. Since Kotlin is an official language for Android development, Android Studio supports this language out of the box.

To build the project [import it as Maven project in Intellij IDEA](https://www.jetbrains.com/help/idea/maven-support.html).

Project contains packages for each chapter that is splitted by sections:

<img src="http://i64.tinypic.com/fypdvm.png" width="380" height="500"/>

Most of the examples contain a ```main``` function that can run by clicking the ![](https://www.jetbrains.com/help/img/idea/2018.1/run.png) icon in the left gutter and choose the Run or Debug command.

Project also contains benchmarks that can be run using the following commands:
1) Build a ```.jar``` file using this command at the root of the repository: ```mvn clean install```
2) To run the ```.jar``` with fast benchmarking: ```java -jar target/benchmarks.jar -wi 0 -i 1 -f 1 -tu ns -bm avgt```
   To run the ```.jar``` with default benchmarking: ```java -jar target/benchmarks.jar```


The code will look like the following:
```
public inline fun measureTimeMillis(block: () -> Unit) : Long {
    val start = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - start
}
```

**Following is what you need for this book:**
This book is for Kotlin developers who would like to build reliable and high-performance applications. Prior Kotlin programming knowledge is assumed.

With the following software and hardware list you can run all code files present in the book (Chapter 1-10).
### Software and Hardware List
| Chapter  | Software required                   | OS required                        |
| -------- | ------------------------------------| -----------------------------------|
| 1-10        | IntelliJ IDEA (Ultimate edition) | Windows, Mac OS X, and Linux (Any) |

We also provide a PDF file that has color images of the screenshots/diagrams used in this book. [Click here to download it](https://www.packtpub.com/sites/default/files/downloads/MasteringHighPerformancewithKotlin_ColorImages.pdf).

### Related products
* Hands-On Microservices with Kotlin [[Packt]](https://www.packtpub.com/web-development/microservices-kotlin?utm_source=github&utm_medium=repository&utm_campaign=9781788471459) [[Amazon]](https://www.amazon.com/dp/1788471458)

* Functional Kotlin [[Packt]](https://www.packtpub.com/application-development/functional-kotlin?utm_source=github&utm_medium=repository&utm_campaign=9781788476485) [[Amazon]](https://www.amazon.com/dp/1788476484)

## Get to Know the Author
**Igor Kucherenko**
 is an Android developer at Techery, a software development company that uses Kotlin as the main language for Android development. Currently, he lives in Ukraine, where he is a speaker in the Kotlin Dnipro Community, which promotes Kotlin and shares knowledge with audiences at meetups. You can find his articles about Kotlin and Android development on Medium and a blog for Yalantis, where he worked previously.
 
### Suggestions and Feedback
[Click here](https://docs.google.com/forms/d/e/1FAIpQLSdy7dATC6QmEL81FIUuymZ0Wy9vH1jHkvpY57OiMeKGqib_Ow/viewform) if you have any feedback or suggestions.
### Download a free PDF

 <i>If you have already purchased a print or Kindle version of this book, you can get a DRM-free PDF version at no cost.<br>Simply click on the link to claim your free PDF.</i>
<p align="center"> <a href="https://packt.link/free-ebook/9781788996648">https://packt.link/free-ebook/9781788996648 </a> </p>