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
    <td><img src="assets/bitcoin_qr_code.png" alt="Bitcoin QR code" width="100px"></td>
    <td><samp>16A9J59ahMRqkLSZjhYj33n9j3fMztFxnh</samp></td>
  </tr>
  <tr>
    <td><a href="https://liberapay.com/TeamDreamsTube/"><img src="https://upload.wikimedia.org/wikipedia/commons/2/27/Liberapay_logo_v2_white-on-yellow.svg" alt="Liberapay" width="80px" ></a></td>
    <td><a href="https://liberapay.com/TeamDreamsTube/"><img src="assets/liberapay_qr_code.png" alt="Visit DreamsTube at liberapay.com" width="100px"></a></td>
    <td><a href="https://liberapay.com/TeamDreamsTube/donate"><img src="assets/liberapay_donate_button.svg" alt="Donate via Liberapay" height="35px"></a></td>
  </tr>
  <tr>
    <td><a href="https://www.bountysource.com/teams/dreamstube"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Bountysource.png/320px-Bountysource.png" alt="Bountysource" width="190px"></a></td>
    <td><a href="https://www.bountysource.com/teams/dreamstube"><img src="assets/bountysource_qr_code.png" alt="Visit DreamsTube at bountysource.com" width="100px"></a></td>
    <td><a href="https://www.bountysource.com/teams/dreamstube/issues"><img src="https://img.shields.io/bountysource/team/dreamstube/activity.svg?colorB=cd201f" height="30px" alt="Check out how many bounties you can earn."></a></td>
  </tr>
</table>

