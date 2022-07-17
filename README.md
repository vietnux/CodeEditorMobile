# CodeEditor

![ApplicationIcon](images/cove.jpg)

**Available on [Galaxy Store](http://galaxystore.samsung.com/detail/com.tglt.code.editor) and [Google Play](https://play.google.com/store/apps/details?id=com.tglt.code.editor)**
*(disponible sur [Galaxy Store](http://galaxystore.samsung.com/detail/com.tglt.code.editor) et [Google Play](https://play.google.com/store/apps/details?id=com.tglt.code.editor))*

[![](https://img.shields.io/github/v/release/vietnux/CodeEditorMobile?label=Latest%20release&style=plastic)](https://github.com/vietnux/CodeEditorMobile/releases)
[<img src="https://d3unf4s5rp9dfh.cloudfront.net/SDP/GalaxyStore_English.png" height="18" wwidth="118">](http://galaxystore.samsung.com/detail/com.tglt.code.editor)
[![](https://img.shields.io/endpoint?style=plastic&color=blue&label=Google%20Play%20release&url=https://playshields.herokuapp.com/play?i=com.tglt.code.editor&m=$version)](https://play.google.com/store/apps/details?id=com.tglt.code.editor)  
A cool and optimized code editor on Android platform with good performance and nice features.

***Work In Progress*** This project is still developing slowly. Bugs may be inside.
It is **not** recommended to use this project for production use.   
***Note:***
Any method or field can be changed, moved or even deleted at current period.     
If you find any bug or require any enhancement, please send it to me by issues or other ways.
Download newest sources from [Releases](https://github.com/vietnux/CodeEditorMobile/releases) instead of cloning this repository directly.

**Issues and pull requests are welcome.**   
Note: Language issues may not be handled.   
## Features
  ⭐ Smooth syntax highlighting for multiple languages (C++, Java, JavaScript, HTML, Markdown, PHP, Perl, Python, Lua, Dart, etc)  
  ⭐ Preview HTML and Markdown files.  
  ⭐ Code Editor is an engine that can compile and run Java code  
  ⭐ Auto completion  
  ⭐ Auto indent  
  ⭐ Code block lines  
  ⭐ Scale text  
  ⭐ Select text  
  ⭐ Scroll, Scrollbars, EdgeEffect, OverScroll  
  ⭐ Undo/redo changes without limit  
  ⭐ Search and replace  
  ⭐ Shortcuts  
  ⭐ Auto wordwrap  
  ⭐ Show non-printable characters  
  ⭐ Incremental highlight Analysis  
  ⭐ Plugin System  
  ⭐ Access files from FTP, FTPS, SFTP and WebDAV.  
## Language Supported  
* PHP, Java, JavaScript, CSS, Dart, C, C++, HTML, Python (Basic Support:highlight, code block line, identifier and keyword auto-completion). Code block line isn't available for HTML Language.
## Screenshots
<img src="images/Screenshot_20210905-163425.png" width="360" height="675"><img src="images/Screenshot_20210905-163425.png" width="360" height="675">
<img src="images/Screenshot_20210905-164058.png" width="360" height="675"><img src="images/Screenshot_20210905-164058.png" width="360" height="675">
<img src="images/Screenshot_20210905-164403.png" width="360" height="675"><img src="images/Screenshot_20210905-164403.png" width="360" height="675">
<img src="images/Screenshot_20210905-164432.png" width="360" height="675"><img src="images/Screenshot_20210905-164432.png" width="360" height="675">
<img src="images/Screenshot_20210905-164459.png" width="360" height="675"><img src="images/Screenshot_20210905-164459.png" width="360" height="675">
## How to use this editor  
* Step 1.Add the JitPack repository to your build file   
Add it in your root build.gradle at the end of repositories:
```Gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
 ```
* Step 2. Add the dependency to your app
```Gradle
dependencies {
  implementation 'com.github.Rosemoe.CodeEditor:<moduleName>:<versionName>'
}
```
Available modules:     
* editor 
* language-base
* language-java
* language-html
* language-python
* language-universal   
### Some more information
Go to [Wiki](https://github.com/vietnux/CodeEditorMobile/wiki)

## Donate
If you like DreamsTube we'd be happy about a donation. You can either send bitcoin or donate via Bountysource or Liberapay. For further info on donating to DreamsTube, please visit our [website](http://thegioilaptrinh.net/app/appru/DreamsTube.htmldonate).

<table>
  <tr>
    <td><img src="https://bitcoin.org/img/icons/logotop.svg" alt="Bitcoin"></td>
    <td><img src="https://camo.githubusercontent.com/8077787649f17a88405bdd9d29db569e3f0cb70364297623ced31221ca293ae8/687474703a2f2f74686567696f696c61707472696e682e6e65742f646f6e6174652f626974636f696e642e706e67" alt="Bitcoin QR code" width="100px"></td>
    <td><samp>bc1q8z8ec9m29revsvpe9wtyvnlnave3jjz8w47snd</samp></td>
  </tr>
  <tr>
    <td><a href="https://www.paypal.com/paypalme/vietnux"><img src="https://camo.githubusercontent.com/15b09c935fc866626ffc0824ac5ff05197c19ca0406553d3b311f09acfde5b93/68747470733a2f2f7777772e70617970616c6f626a656374732e636f6d2f6469676974616c6173736574732f632f776562736974652f6c6f676f2f66756c6c2d746578742f70705f66635f686c2e737667" alt="Bountysource" width="190px"></a></td>
    <td><a href="https://www.paypal.com/paypalme/vietnux"><img src="https://github.com/vietnux/Stability-and-Faster-Launcher/raw/master/gui/paypal.svg" alt="Paypal" width="100px"></a></td>
    <td><a href="https://www.paypal.com/paypalme/vietnux">https://www.paypal.com/paypalme/vietnux</a></td>
  </tr>
</table>

